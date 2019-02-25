/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Rovers.Plateau;
import Rovers.Position;
import marsrover.Functions;

/**
 *
 * @author Mothusi Molorane
 */


public class MovementFactory {
    
    public void moveForward(Position position) {
        if(Plateau.size > position.getY()+1 && Plateau.size > position.getX()+1){
            
            switch(position.getOrientation()){
                case N:
                    position.setY(position.getY()+1); break;
                case E:
                    position.setX(position.getX()+1); break;
                case S:
                    position.setY(position.getY()-1); break;
                case W:
                    position.setX(position.getX()-1); break;
            }
        }else{
            Functions.errorMessage("Heads up! You can't move forward! The rover is moving out side of the plateau.\n"
                                   + "However, you can increase the size of the plateau!");
        }
    }
    
    public void moveBackward(Position position) {
        if(Plateau.size > position.getY()+1 || Plateau.size > position.getX()+1){
           switch(position.getOrientation()){
                    case N:
                        position.setY(position.getY()-1); break;
                    case E:
                        position.setX(position.getX()-1); break;
                    case S:
                        position.setY(position.getY()+1); break;
                    case W:
                        position.setX(position.getX()+1); break;
                }
        }else{
            Functions.errorMessage("Heads up! You can't move forward! The rover is moving out side of the plateau.\n"
                                   + "However, you can increase the size of the plateau!");
        }
    }
    
    /****
     * Movement behaviours can be added here in future.
     */
}
