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
public class DLL<T> {

    private DLLNode head,tail;

    public DLL() {
        head = tail = null;
    }
    
    public boolean isEmpty(){
        return(head==null);
    }
    
    public String toString(){
        DLLNode<T> p;
        String s = "";
        for(p = head; p!= null; p = p.next)
            s = s + p.info.toString() + "";
        return s;
    }
    
    public void addToHead(T el){
        if(head == null){
            head = new DLLNode<T>(el,null,null);
            tail = head;
        } else {
            head = new DLLNode<T>(el,null,head);
            head.next.prev = head;
        }
    }
    
    public void addToTail(T el){
        if(head == null){
            head = new DLLNode<T>(el,null,null);
            tail = head;
        } else {
            tail = new DLLNode<T>(el,tail,null);
            tail.prev.next = tail;
        }
    }
    
    public T delete (T el){
        if(isEmpty()) return null;
        if(el == head.info)
            return deleteFromHead();
        if(el == tail.info)
            return deleteFromTail();
        DLLNode<T> pred = head;
        DLLNode<T> t = head.next;
        while(t != null && t.info != el){
            pred = pred.next;
            t = t.next;
        }
        if(t == null) return null;
        else{
            pred.next = t.next;
        }
        return el;
    }
    
    public T deleteFromHead(){
        if(isEmpty()) return null;
        T el = (T) head.info;
        if(head == tail){
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return el;
    }
    
    public T deleteFromTail(){
        if(isEmpty()) return null;
        T el =  (T) tail.info;
        if(head == tail){
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }  
        return el;
    }
    
    public static void main(String[] args) {
        DLL<Integer> dlist1 = new DLL<>();
        dlist1.addToHead(1);
        dlist1.addToTail(2);
        dlist1.addToTail(3);
        dlist1.addToTail(4);
        dlist1.addToTail(3);
        System.out.println(dlist1.toString());
        if(dlist1.delete(5) == null)
             System.out.println("data does not exist");
        
        
        
    }

   
    
}
