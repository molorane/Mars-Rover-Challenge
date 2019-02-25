/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rovers;

/**
 *
 * @author Mothusi Molorane
 */

public class Plateau{
    
    /****
     * variable size is declared static to allow all calling applications to access the same size
     */
    
    public static int size;
    private static Plateau instance;
    
    private Plateau(){
        size = 10; // Give the plateau a default size of 10
    }
    
    /****
     * Procedure getInstance should be thread-safe so that in the event that there
     * are many calls to the method, only one call can be served at the time.
     * This will prevent having multiple instances of the class Plateau
     */
    
    public static synchronized Plateau getInstance(){
        if(instance == null){
           instance = new Plateau();
        }
        return instance;
    }
    
    public static void setPlateauSize(int newSize){
        size = newSize;
    }
    
    public static int getPlateauSize(){
        return size;
    }
}
