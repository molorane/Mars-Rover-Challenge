/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsrover;

import javax.swing.JOptionPane;

/**
 *
 * @author Mothusi Molorane
 */
public class Functions {
    
    public static void errorMessage(String msg){
        JOptionPane.showMessageDialog(null,msg,"Problem encountered!",JOptionPane.ERROR_MESSAGE);
    }
    
    public static void warningMessage(String msg){
       JOptionPane.showMessageDialog(null,msg,"Warning!",JOptionPane.WARNING_MESSAGE); 
    }
    
    public static void successMessage(String msg){
       JOptionPane.showMessageDialog(null,msg,"Action Successful!",JOptionPane.INFORMATION_MESSAGE); 
    }
    
}
