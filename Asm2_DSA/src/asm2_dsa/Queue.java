/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm2_dsa;

/**
 *
 * @author Macbook2015
 */
public class Queue {
    int first, last, size; 
    int capacity; 
    
    Message message []; 

    public Queue(int capacity) {
        this.capacity = capacity; 
        first = this.size = 0; 
        last = capacity -1; 
        message = new Message[this.capacity];
    } 
    boolean isFull (Queue queue) {
        return(queue.size == queue.capacity);
    }
    boolean isEmpty (Queue queue) {
        return (queue.size == 0);
    } 
    public void enqueue (Message item) {
        if (isFull(this)) {
            System.out.println("The queue is full!!");
            return;
        }
        this.last = (this.last +1 ) % this.capacity; 
        this.message [this.last] = item; 
        this.size = this.size + 1; 
        System.out.println("Add message successfully");
    } 
    Message delete () {
        if (isEmpty(this)) {
            System.out.println("The queue is empty"); 
            return null;
        } 
        Message item = this.message[this.first]; 
        this.first = (this.first + 1) % this.capacity; 
        this.size = this.size - 1; 
        System.out.println("Delete successsfully");
        return item;
    }
    public void showMessage () {
        if (isEmpty(this)) {
            System.out.println("The queue is empty");
        }
        System.out.println("All the message you just input:");
        System.out.println("-----------------------------------------------");
        for (int i = first; i <= last; i++) {
            System.out.println( "The message from " + message[i].getPerson()+ 
                    " and the message is: " + message[i].getData());
        }
        System.out.println("");
    }
    
}
