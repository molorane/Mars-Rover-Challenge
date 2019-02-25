/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rovers;

import Behaviours.Forward;

/**
 *
 * @author Mothusi Molorane
 */
public class MarsRover2016 extends Rover{
    
    
    public MarsRover2016(String name,Position startPosition){
        this.moveBehaviour = new Forward();
        this.setRoverName(name);
        this.position = startPosition;
    }
    
}
