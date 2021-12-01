package com.dsa.linked_list;

public class Node {
    Object data; // 每个节点都有的属性：数值
    Node next; // 每个结点都有的属性：后继指针

    // 头节点构造器
    Node(Node nextVal){
        next = nextVal;
    }

    // 正常节点构造器
    Node(Object obj, Node nextVal){
        data = obj;
        next = nextVal;
    }

    // 取next
    public Node getNext(){
        return next;
    }

    // 置next
    public void setNext(Node nextVal){
        next = nextVal;
    }

    // 取data
    public Object getData(){
        return data;
    }

    // 置data
    public void setData(Object obj){
        data = obj;
    }
}
