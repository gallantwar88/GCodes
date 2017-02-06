/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystack;

/**
 *
 * @author Gallantwar88
 * @param <T>
 */
public class MyStack<T> {

    private int maxStkSize = 100;
    private int top = -1;
    private Object[] stk;

    public MyStack() {
        stk = new Object[maxStkSize];
    }

    public MyStack(int n) {
        if(n > 0) maxStkSize = n;
        stk = new Object[maxStkSize];
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }
    
    public boolean isFull(){
        return (top == maxStkSize - 1);
    }
    
    public int push(T el){
        if(isFull()) return -999;
        stk[++top] = el;
        return 1;
    }
    
    public T pop(){
        if(isEmpty()) return null;
        T el =(T) stk[top--];
        return el;
    }
    
    public void clear(){
        top = -1;
    }
    
    public T peek(){
        if(isEmpty()) return null;
        else return (T) stk[top];
    }
    
    public static void main(String[] args) {
        MyStack<Character> s1 = new MyStack<>(4); 
        MyStack<Integer> s2 = new MyStack<>();
        MyStack<String> s3 = new MyStack<>();
        
        s1.push('A');
        System.out.println(s1.pop());
        s2.push(1);
        System.out.println(s2.pop()); 
        s3.push("Hercules");
        System.out.println(s3.pop());
        s3.push("Athena");
        System.out.println(s3.peek());
        
        
        
        
    }
    
}
