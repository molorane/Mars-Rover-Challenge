/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConcreteCommands;

import Rovers.Rover;
import interfaces.ICommand;

/**
 *
 * @author Mothusi Molorane
 */
public class CommandRover implements ICommand{
    
    private final Rover rover;
    
    public CommandRover(Rover rover){
        this.rover = rover;
    }

    @Override
    public void execute(String command) {
        this.rover.commandRover(command);
    }

    @Override
    public void undo(String command) {
        this.rover.undoCommand(new StringBuilder(command).reverse().toString());
    }
    
}
