/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresandalgorithms;

/**
 *
 * @author Asus
 */


public class Stack<T> {
    private Node<T> top;
    private int size;

    // Node class
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    // Push method
    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Pop method
    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        T item = top.data;
        top = top.next;
        size--;
        return item;
    }

    // Peek method
    public T peek() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    // IsEmpty method
    public boolean isEmpty() {
        return top == null;
    }

    // Size method
    public int size() {
        return size;
    }

    // Main method to test the stack
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element is: " + stack.peek()); // Output: 3
        System.out.println("Stack size is: " + stack.size()); // Output: 3

        System.out.println("Popped element is: " + stack.pop()); // Output: 3
        System.out.println("Stack size after pop is: " + stack.size()); // Output: 2

        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false

        stack.pop();
        stack.pop();

        System.out.println("Is stack empty after popping all elements? " + stack.isEmpty()); // Output: true
    }
}


