/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistlab;

/**
 *
 * @author it.student
 */
public class IntNode {
    public int info;
    public IntNode next;
    public IntNode(int i){
        this(i,null);
    }
    public IntNode(int i, IntNode n){
        info = i;
        next = n;
    }
    
}
