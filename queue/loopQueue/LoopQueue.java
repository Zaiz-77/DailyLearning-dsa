package com.dsa.queue.loopQueue;

// 队列，队尾入队，队头出队
public class LoopQueue {
    // 队列具有的一些属性
    final int defaultSize = 10; // 默认长度
    int rear; // 队尾
    int front; // 队头
    int maxSize; // 最大长度
    int size; // 当前元素个数
    Object[] loopQueue; // 储存队列的列表

    // 构造器
    public LoopQueue(){
        setup(defaultSize);
    }

    public LoopQueue(int sz){
        setup(sz);
    }

    // 初始化函数
    public void setup(int sz){
        size = 0;
        maxSize = sz;
        rear = front = 0;
        loopQueue = new Object[sz];
    }

    // 插入元素
    public void append(Object obj){
        if((rear + 1) % maxSize == front){
            System.out.println("已满，无法插入");
        }
        loopQueue[rear] = obj;
        rear = (rear + 1) % maxSize;
        size ++;
    }

    // 删除元素
    public Object delete(){
        if(rear == front){
            System.out.println("已空，无法删除");
        }
        Object temp = loopQueue[front];
        front = (front + 1) % maxSize;
        size --;
        return "被删除的元素是" + temp;
    }

    // 是否为空
    public boolean isEmpty(){
        return rear == front;
    }

    // 获取队头元素
    public Object getFront(){
        return "队头元素是" + loopQueue[front];
    }

    // 遍历
    public void travel(){
        for(int i = 0; i < size; i++){
            System.out.print(loopQueue[i] + " ");
        }
        System.out.println();
    }
}
