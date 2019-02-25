/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rovers;

import marsrover.enums.Orientation;

/**
 * @author Mothusi Molorane
 */

public class Position {
    
    private int x;
    private int y;
    Orientation orientation;
    
    public Position(int x, int y, Orientation orientation){
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }
    
    public void setOrientation(Orientation orientation){
        this.orientation = orientation;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public Orientation getOrientation(){
        return this.orientation;
    }
    
}
