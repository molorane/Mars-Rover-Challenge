/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behaviours;

import Factory.MovementFactory;
import Rovers.Position;
import interfaces.IMoveBehaviour;
import marsrover.enums.Move;

/**
 *
 * @author Mothusi Molorane
 */
public class Reverse  implements IMoveBehaviour{
    public Move moveDirection;
    MovementFactory movementDirection;
    
    /****
     * Set default movement to forward, the user can dynamically change direction
     * through method setMoveDirection
     */
    
    public Reverse(){
        this.moveDirection = Move.Forward;
        movementDirection = new MovementFactory();
    }
    
    public void setMoveDirection(Move move){
        this.moveDirection = move;
    }

    @Override
    public void move(Position position) {
        if(this.moveDirection == Move.Forward){
            movementDirection.moveForward(position);
        }else{
            movementDirection.moveBackward(position);
        }
    }

    @Override
    public void undo(Position position) {
        movementDirection.moveBackward(position);
    }
}
