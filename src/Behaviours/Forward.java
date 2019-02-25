/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behaviours;

import Factory.MovementFactory;
import Rovers.Position;
import interfaces.IMoveBehaviour;

/**
 *
 * @author Mothusi Molorane
 */
public class Forward implements IMoveBehaviour{
     MovementFactory movementDirection;
    
    public Forward(){
        movementDirection = new MovementFactory();
    }
    
    @Override
    public void move(Position position) {
        movementDirection.moveForward(position);
    }
    
    @Override
    public void undo(Position position) {
        movementDirection.moveBackward(position);
    }
}
