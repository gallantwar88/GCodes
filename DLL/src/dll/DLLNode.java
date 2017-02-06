/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dll;

/**
 *
 * @author Gallantwar88
 * @param <T>
 */
public class DLLNode<T> {
    
    public T info;
    public DLLNode<T> prev;
    public DLLNode<T> next;
    
    public DLLNode(T el){
        info = el;
        next = null;
        prev = null;
    }
    
    public DLLNode(T el,DLLNode<T> front,DLLNode<T> back){
        info = el;
        prev = front;
        next = back;
    }
    
    @Override
    public String toString(){
        return info.toString();
    }
}
