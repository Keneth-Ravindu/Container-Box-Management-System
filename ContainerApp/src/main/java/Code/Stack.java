/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author kenethravindu
 */
public class Stack {
    
    private int maxSize;
    private int top;
    private Box stackArray[];
    
    public Stack(int s)
    {
        maxSize = s;
        top = -1;
        stackArray = new Box[s];
    }
    public void push(Box i)
    {
        if(isFull())
        {
            
        }
        else
        {
            stackArray[++top] = i;
            
        }
    }
    public Box pop()
    {
        if(isEmpty())
        {
            return null;
        }
        else
        {
            return stackArray[top--];
            
        }
    }
        public Box peek()
    {
        if(isEmpty())
        {
            return null;
        }
        else
        {
            return stackArray[top];
            
        }
    }
    public boolean isFull()
    {
        return (top ==(maxSize-1));
    }
    public boolean isEmpty()
    {
        return (top ==-1);
    }
}

