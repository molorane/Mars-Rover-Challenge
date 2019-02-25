/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import Rovers.Position;

/**
 *
 * @author Mothusi Molorane
 */
public interface IMoveBehaviour {
    void move(Position position);
    void undo(Position position);
}

