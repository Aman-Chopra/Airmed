/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package air.med;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Client extends JFrame{
	
	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private String message = "";
	private String serverIP;
	private Socket connection;
	
	//constructor
	public Client(String host){
		super("Your message!");
		serverIP = host;
		userText = new JTextField();
		userText.setEditable(false);
		userText.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						sendMessage(event.getActionCommand());
						userText.setText("");
					}
				}
			);
		    add(userText, BorderLayout.NORTH);
		    chatWindow = new JTextArea();
		    add(new JScrollPane(chatWindow));
		    setSize(300,200);
                    setLocation(950,450);
		    setVisible(true);
	}  
  
	//set up and run server
	public void startRunning(){
		try{
			connectToServer();
			setupStreams();
			whileChatting();
		}catch(EOFException eofException){
			showMessage("\n You ended the connection!! ");
		}catch(IOException ioException){
			ioException.printStackTrace();
		}finally{
			closeCrap();
		}
	}
		
	
	//Connecting to server
	private void connectToServer() throws IOException{
		showMessage(" Attempting connection.. \n");
		connection = new Socket(InetAddress.getByName(serverIP), 6789);
		showMessage( " Now connected to " + connection.getInetAddress().getHostName());
	}
	
	//Get stream to send and receive data
	private void setupStreams() throws IOException{
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
		showMessage("\n Streams are now setup! \n");
	}
	
	//During chat convo..
	private void whileChatting() throws IOException{
		ableToType(true);
                String b = "";
		do{
			try{
				message = (String) input.readObject();
				showMessage("\n" + message);
			}catch(ClassNotFoundException classNotFoundException){
				showMessage("\n You sent invalid data!");
			}
                        String a = doctorone.naam;
                        b = a+" - END";
		}while(!message.equals(b));
	}
	
	//Close Streams and Sockets
	private void closeCrap(){
		showMessage("\n Closing connections.... \n");
		ableToType(false);
		try{
			output.close();
			input.close();
			connection.close();
		}catch(IOException ioException){
			ioException.printStackTrace();
		}
	}
	
	//Send message
	private void sendMessage(String message){
		try{
			output.writeObject("CLIENT - " + message);
			output.flush();
			showMessage("\n CLIENT - " + message);
		}catch(IOException ioException){
			chatWindow.append("\n ERROR: This message cannot be sent");
		}
	}
	
	//Updates chatWindow
	private void showMessage(final String m){
		SwingUtilities.invokeLater(
				new Runnable(){
					public void run(){
						chatWindow.append(m);
					}
				}
			);
	}
	
	//Let the user to type
	private void ableToType(final boolean tof){
		SwingUtilities.invokeLater(
				new Runnable(){
					public void run(){
						userText.setEditable(tof);
					}
				}
			);
	}
}
	
	
	
	
				
