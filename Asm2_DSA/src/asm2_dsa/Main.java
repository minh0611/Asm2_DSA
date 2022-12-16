/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm2_dsa;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Macbook2015
 */
public class Main {

    static Scanner sc = new Scanner(System.in);
    static Queue queueMessage = new Queue(150);

    public static void menu() {
        System.out.println("Message Menu Box");
        System.out.println("___________________");
        System.out.println("1. Input Message");
        System.out.println("2. Show Message");
        System.out.println("3. Delete Message");
        System.out.println("4. Exit");
    }

    public static void main(String[] args) {
        int choose = 0;
        do {
            menu();
            choose = SelectChoice();
            sc.nextLine();
            switch (choose) {
                case 1:
                    System.out.println("Enter name of sender: ");
                    String person = sc.nextLine();
                    System.out.println("Enter the text input: ");
                    String message = sc.nextLine();
                    Date date = new Date();
                    System.out.println("The current date is: " + date);
                    if (message.toCharArray().length > 250) {
                        System.out.println("The text message is too long");
                        break;
                    }
                    Message mess = new Message(person, message, date);
                    queueMessage.enqueue(mess);
                    break;
                case 2:
                    queueMessage.showMessage();
                    break;
                case 3:
                    queueMessage.delete();
                    break;
                case 4:
                    System.out.println("Thanks for use the system!!");
                    return;
                default:
                    System.out.println("Please re-enter the option");
                    break;
            }
        } while (choose != 4);
    }

    public static int SelectChoice() {
        boolean check = true;
        int choice = 0;

        do {
            System.out.println("Enter your choice: ");
            try {
                choice = sc.nextInt();
                check = false;
            } catch (InputMismatchException e) {
                System.out.println("Please enter the option!!!");
                sc.nextLine();
            }
        } while (check);
        return choice;
    }
}
