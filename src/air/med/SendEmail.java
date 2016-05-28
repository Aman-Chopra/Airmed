package air.med;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.naming.Context;

public class SendEmail {
     public static int flag = 0;
	public static void main(String[] args) {
           
           try
            {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
                String username = "amanchopra64@gmail.com";
                String password = "pleasebestrong";
                Session session = Session.getInstance(props, new GMailAuthenticator(username, password));

		/*Session session = Session.getDefaultInstance(props,
			new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("amanchopra64@gmail.com","amanisgaoodboy1");
				}
			});*/

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("amanchopra64@gmail.com.com"));
			//message.setRecipients(Message.RecipientType.TO,
					//InternetAddress.parse("ashraydimri@gmail.com"));
                                        message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(args[0]));
			message.setSubject(args[2]);
			message.setText(args[1]);

			Transport.send(message);

			//System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
                        
		}
            }//
            catch(Exception e)
            {
               //System.out.println("No internet!");
                flag = 1;
            }
	}
}
        
