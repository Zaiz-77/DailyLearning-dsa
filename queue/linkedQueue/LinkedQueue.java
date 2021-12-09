package com.dsa.queue.linkedQueue;

import com.dsa.list.linked_list.Node;
// 需要Node类
public class LinkedQueue {
    // 属性
    Node front; // 头结点
    Node rear; // 尾结点

    // 构造器,在构造器里面调用初始化函数
    public LinkedQueue(){
        setup();
    }

    public LinkedQueue(int sz){
        setup();
    }

    // 初始化
    public void setup(){
        front = rear = null;
    }

    // 追加
    public void append(Object obj){
        Node temp = new Node(obj, null);
        if(rear!= null) rear.next = temp;
        rear = temp; // 注意rear只是一个指针的名字，到时候肯定要有具体的结点给到它才可以
        if(front == null) front = temp;
    }

    // 删除
    public Object delete(){
        if(front == null) System.out.println("为空，无法删除");
        Object temp = front.getData();
        front = front.next;
        return temp;
    }

    // 获得队头元素
    public Object getFront(){
        return front.getData();
    }

    // 是否为空
    public boolean isEmpty(){
        return front == null;
    }

    // 遍历
    public void travel(){
        Node cursor = front;
        while (cursor != null){
            if(cursor.next != null) System.out.print(cursor.getData() + " -> ");
            else System.out.print(cursor.getData());
            cursor = cursor.next;
        }
    }
}
