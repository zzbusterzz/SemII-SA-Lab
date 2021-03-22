/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author MScIT17
 */
public class MyQueue implements MyInterface {

    private int[] queue;
    private int index_Insert;
    private int index_Delete;

    public MyQueue() {
        queue = new int[10];
        index_Insert = 0;
        index_Delete = 0;
    }

    @Override
    public void insert(int i) {
        if (index_Insert >= queue.length) {
            index_Insert = 0;
            if (index_Delete == index_Insert) {
                System.out.print("Queue Overflow");
                index_Insert = queue.length;
            }
        } else if (index_Insert + 1 == index_Delete) {
            System.out.print("Queue Overflow");
        } else {
            queue[index_Insert] = i;
            index_Insert++;
        }
    }

    @Override
    public int delete() {
        if (index_Delete == index_Insert) {
            return -1;
        } else {
            int i = queue[index_Delete];
            queue[index_Delete] = -1;
            index_Delete++;
            if (index_Delete >= queue.length) {
                index_Delete = 0;
            }
            return i;
        }
    }

    @Override
    public int peek() {
        if (index_Delete == index_Insert) {
            return -1;
        } else {
            return queue[index_Delete];
        }
    }

    @Override
    public void display() {
        if (index_Insert == index_Delete) {
            System.out.println("The Queue is empty");
        } else {
            int finalIndexPoint;
            if (index_Insert < index_Delete) {
                finalIndexPoint = index_Insert + queue.length;
            } else {
                finalIndexPoint = index_Insert;
            }

            System.out.println("The Queue is : ");

            for (int i = index_Delete; i < finalIndexPoint; i++) {
                if (i >= queue.length) {
                    System.out.print(queue[i % queue.length] + " ");
                } else {
                    System.out.println(queue[i]);
                }
            }
        }
    }
}
