/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rovers;

import Behaviours.Reverse;

/**
 *
 * @author Mothusi Molorane
 */
public class MarsRover2019 extends Rover{
    
    public MarsRover2019(String name,Position startPosition){
        this.moveBehaviour = new Reverse();
        this.setRoverName(name);
        this.position = startPosition;
    }
    
    // All other methods to change direction of movement that is (forward or reverse)
    // can be implemented here.
}
