package com.dsa.linked_list;

public class LinkedList {
    Node head; // 每一个链表都有头节点
    Node cursor; // 辅助结点，光标
    int size; // 当前元素的个数

    // 构造器
    LinkedList() {
        head = cursor = new Node(null); // 设置头节点
        size = 0;
    }

    // 定位光标的位置,将其置于i的位置
    public void index(int i) {
        if (i < -1 || i > size - 1) {
            System.out.println("参数错误");
        }
        if (i == -1) return;
        cursor = head.next;
        int j = 0;
        while (cursor.next != null && j < i) {
            cursor = cursor.next;
            j++;
        }
    }

    // 在指定位置插入
    public void insert(int i, Object obj) {
        if (i < 0 || i > size) {
            System.out.println("参数错误");
        }
        index(i - 1);
        cursor.setNext(new Node(obj, cursor.next));
        size++;
    }

    // 在指定位置删除
    public void delete(int i) {
        if (size == 0) {
            System.out.println("无法删除");
        }
        index(i - 1);
        cursor.setNext(cursor.next.next);
        size--;
    }

    // 取指定位置的元素
    public Object getData(int i) {
        if (i < 0 || i > size - 1) {
            System.out.println("参数错误");
        }
        index(i);
        return cursor.getData();
    }

    // 获得元素的个数
    public int getSize() {
        return size;
    }

    // 判断是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 输出链表
    public void travel() {
        if (isEmpty()) System.out.println("链表为空");
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                index(i);
                System.out.print(cursor.getData() + " -> ");
            }
        }
        index(size - 1);
        System.out.println(cursor.getData());
    }
}