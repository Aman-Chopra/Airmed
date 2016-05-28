/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package air.med;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Error_message {

  public static void main(String[] args) {
    final JPanel panel = new JPanel();

    JOptionPane.showMessageDialog(panel, "Could not open file", "Error", JOptionPane.ERROR_MESSAGE);

  }
}

