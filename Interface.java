package com.thread.extend;

 interface first {
    default void show() 
    { 
        System.out.println("Default First"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("Default Second"); 
    } 
}  
       public class Interface implements first, Second 
{  
    public void show() 
    {  
        first.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        Interface ob = new Interface(); 
        ob.show(); 
    } 
}



