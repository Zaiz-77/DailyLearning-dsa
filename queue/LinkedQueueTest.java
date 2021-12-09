package com.dsa.queue.linkedQueue;

public class LinkedQueueTest {
    public static void main(String[] args) {
        LinkedQueue myLinkedQueue = new LinkedQueue();
        System.out.println(myLinkedQueue.isEmpty());
        for (int i = 0; i < 10; i++) {
            myLinkedQueue.append(i + 1);
        }
        System.out.println(myLinkedQueue.isEmpty());
        myLinkedQueue.travel();
    }
}
