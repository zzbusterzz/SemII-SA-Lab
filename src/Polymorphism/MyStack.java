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
public class MyStack implements MyInterface {

    private int[] stack;
    private int index;

    public MyStack() {
        stack = new int[10];
        index = 0;
    }
    
    @Override
    public void insert(int i) {
        if (index > stack.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[index] = i;
            index++;
        }
    }

    @Override
    public int delete() {
        if (index <= 0) {
            return -1;
        } else {
            int i = stack[index - 1];
            index--;
            return i;
        }
    }

    @Override
    public int peek() {
        if (index <= 0) {
            return -1;
        } else {
            return stack[index - 1];
        }
    }

    @Override
    public void display() {
        if (index == 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack :");
            for (int i = 0; i < index; i++) {
                System.out.print(stack[i] + " ");
            }
        }
    }
}