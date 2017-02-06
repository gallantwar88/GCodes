/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myqueue;
import java.util.Scanner;

/**
 *
 * @author Gallantwar88
 * @param <T>
 */
public class MyQueue<T> {

    private int maxQSize = 100;
    private int front = -1;
    private int rear = -1;
    private Object[] que;
    
    public MyQueue(){
        que = new Object[maxQSize];
    }

    public MyQueue(int n) {
        if(n > 0) maxQSize = n;
        que = new Object[maxQSize];
    }
    
    public void clear(){
        front = rear = -1;
    }
    
    public boolean isEmpty(){
        return (front == -1);
    }
    
    public boolean isFull(){
        return ((rear + 1) % maxQSize == front);
    }
    
    public int enQueue(T el){
        if(isFull()) return -999;
        if(isEmpty()) front = 0;
        rear = (rear + 1) % maxQSize;
        que[rear] = el;
        return 1;
    }
    
    public T deQueue(){
        if(isEmpty()) return null;
        T el = (T) que[front];
        if(front == rear) clear();
        else front = (front + 1) % maxQSize;
        return el;
    }
    
    
    
    public static void main(String[] args) {
        
        MyQueue<Character> q1 = new MyQueue<>();
        MyQueue<Integer> q2 = new MyQueue<>();
        MyQueue<String> q3 = new MyQueue<>();
        
        q1 =new MyQueue(4);
        q1.enQueue('J');
        q1.enQueue('K');
        q1.enQueue('A');
        q1.enQueue('L');
        System.out.println(q1.deQueue());
        q1.enQueue('M');
        System.out.println(q1.deQueue());
        
    }
    
}
