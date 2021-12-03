package com.dsa.linked_stack;

import com.dsa.linked_list.Node;

// 需要链表部分的Node类
public class LinkedStack {
    // 初始化一些属性
    Node head; // 头节点
    int size; // 当前元素的个数

    // 构造器
    public LinkedStack() {
        head = null;
        size = 0;
    }

    // 入栈
    public void push(Object obj) {
        head = new Node(obj, head);
        size++;
    }

    // 弹栈
    public Object pop() {
        if (size == 0) {
            System.out.println("已空，无法弹栈");
        }
        Object obj = head.getData();
        head = head.next;
        size--;
        return "弹出元素是" + obj;
    }

    // 获取栈顶元素
    public Object getTop() {
        return "栈顶元素" + head.getData();
    }

    // 是否为空
    public boolean isEmpty() {
        return head == null;
    }

    // 遍历
    public void travel() {
        Node cursor;
        cursor = head;
        while (cursor != null) {
            if (cursor.next != null) {
                System.out.print(cursor.getData() + " -> ");
            }else System.out.println(cursor.getData());
            cursor = cursor.next;
        }
    }
}
