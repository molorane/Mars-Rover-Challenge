/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rovers;

import interfaces.IMoveBehaviour;
import marsrover.Functions;
import marsrover.enums.Direction;
import marsrover.enums.Orientation;

/**
 *
 * @author Mothusi Molorane
 */
public abstract class Rover {
    
    protected IMoveBehaviour moveBehaviour;
    private String roverName;
    protected Position position;
    
    public final void moveRover(){
        this.moveBehaviour.move(position);
    }
    
    public final void undoRover(){
        this.moveBehaviour.undo(position);
    }
    
    /****
     * @param degrees
     * @param direction
     * 
     * This method is not final, indicating that any rover can override it
     * perhaps a rover with a capability such as rotating less or more than 90 degrees
     */
    public void rotateRover(double degrees, Direction direction){
        
        if(degrees == 90){ // rotate rover 90
            if(direction == Direction.L){
                switch(position.getOrientation()){
                    case N:
                        position.setOrientation(Orientation.W); break;
                    case W:
                        position.setOrientation(Orientation.S); break;
                    case S:
                        position.setOrientation(Orientation.E); break;
                    case E:
                        position.setOrientation(Orientation.N); break;
                }
            }
            else if(direction == Direction.R){
                switch(position.getOrientation()){
                    case N:
                        position.setOrientation(Orientation.E); break;
                    case E:
                        position.setOrientation(Orientation.S); break;
                    case S:
                        position.setOrientation(Orientation.W); break;
                    case W:
                        position.setOrientation(Orientation.N); break;
                }
            }else{
                Functions.errorMessage("Illegal direction arguments.");
            }
        }
    }
    
    public final String getRoverName(){
        return this.roverName;
    }
    
    public final void setRoverName(String roverName){
        this.roverName = roverName;
    }
    
    public final Position getPosition(){
        return this.position;
    }
    
    public void commandRover(String command){
        if(IsCommandValid(command)){
            command = command.toUpperCase();
            for(int i=0;i<command.length();i++){
                switch(command.charAt(i)){
                    case 'L':
                        rotateRover(90, Direction.L); break;
                    case 'R':
                        rotateRover(90, Direction.R); break;
                    case 'M':
                        moveRover();
                }
            }
        }else{
            Functions.errorMessage("Sorry, you passed invalid comand: Only include the following letters (M,L,R) in your string!!");
        }
    }
    
    public void undoCommand(String command){
        if(IsCommandValid(command)){
            command = command.toUpperCase();
            for(int i=0;i<command.length();i++){
                switch(command.charAt(i)){
                    case 'L':
                        rotateRover(90, Direction.R); break;
                    case 'R':
                        rotateRover(90, Direction.L); break;
                    case 'M':
                        undoRover();
                }
            }
        }else{
            Functions.errorMessage("Sorry, you passed invalid comand: Only include the following letters (M,L,R) in your string!!");
        }
    }
    
    public final boolean IsCommandValid(String command){
        command = command.toUpperCase();
        for(int i=0;i<command.length();i++){
           if(command.charAt(i) != 'M' && command.charAt(i) != 'L' && command.charAt(i) != 'R'){
               return false;
           }
        }
       return true;
    }
}
