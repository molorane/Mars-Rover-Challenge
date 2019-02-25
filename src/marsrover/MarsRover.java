/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsrover;

import ConcreteCommands.CommandRover;
import Rovers.MarsRover2016;
import Rovers.Plateau;
import Rovers.Position;
import Rovers.Rover;
import marsrover.enums.Orientation;

/**
 *
 * @author Mothusi Molorane
 */
public class MarsRover {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // First begin by initializing the plateau area where rovers will be moving
        Plateau plateau = Plateau.getInstance();
        
        // Create a rover object with a starting position and a name
        Rover rover = new MarsRover2016("Mars Rover 2016", 
                                         new Position(3, 3, Orientation.S));
        
        System.out.println(rover.getRoverName()+" starting position: "+getPosition(rover.getPosition()));
        
        // Command object intended to hide the rover's commandRover implementation from
        // this calling class.
        String strCommand = "LMMLMRMRMM";
        CommandRover command = new CommandRover(rover);
        command.execute(strCommand);
        
        System.out.println(rover.getRoverName()+" new position: "+getPosition(rover.getPosition()));
        
        //support for undo operation
        command.undo(strCommand);
        System.out.println(rover.getRoverName()+" back to starting position: "+getPosition(rover.getPosition()));
    }
    
    public static String getPosition(Position pos){
        return pos.getX() + " "+ pos.getY()+" "+pos.getOrientation();
    }
    
}
