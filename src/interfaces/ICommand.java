/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Mothusi Molorane
 */
public interface ICommand {
    void execute(String command);
    void undo(String command);
}
