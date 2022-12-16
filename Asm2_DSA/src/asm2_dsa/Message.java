/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asm2_dsa;

import java.util.Date;

/**
 *
 * @author Macbook2015
 */
public class Message {
    String person; 
    String data; 
    private Date time;

    public Message(String person, String data, Date time) {
        this.person = person;
        this.data = data;
        this.time = time;
    }

    public Message(String person, String data) {
        this.person = person;
        this.data = data;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }


    
    
}
