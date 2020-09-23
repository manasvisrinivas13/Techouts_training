package threadexamples;
import threadexamples.MultithreadingDemo;

public class Multithread1
{ 
    public static void main(String[] args) 
    { 
        int n = 8; // Number of threads 
        for (int i=0; i<n; i++) 
        { 
            MultithreadingDemo object = new MultithreadingDemo(); 
            object.start(); 
            object.run();
        } 
    } 
} 