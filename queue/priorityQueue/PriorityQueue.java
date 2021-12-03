package com.dsa.queue.priorityQueue;

// 带有优先级的队列 只有出队的时候与普通队列有区别
public class PriorityQueue {
    final int defaultSize = 10; // 默认大小
    int front; // 队头
    int rear; // 队尾
    int maxSize; // 最大长度
    int size; // 当前元素个数
    Element[] priorityQueue; // 储存元素的数组

    // 构造器
    public PriorityQueue(){
        setup(defaultSize);
    }

    public PriorityQueue(int sz){
        setup(sz);
    }

    // 初始化函数
    public void setup(int sz){
        maxSize = sz;
        front = rear = 0;
        size = 0;
        priorityQueue = new Element[sz];
    }

    // 插入元素
    public void append(Object obj){
        if((rear + 1) % maxSize == front){
            System.out.println("已满，无法插入");
        }
        priorityQueue[rear] = (Element)obj;
        rear = (rear + 1) % maxSize;
        size ++;
    }

    // 删除元素，也即出队列
    public Element delete(){
        if(rear == front){
            System.out.println("已空，无法删除");
        }
        // 先要找到优先级最高的元素，这里默认给定元素值较小的
        // 进行一轮选择排序即可
        Element min = priorityQueue[0];
        int index = 0;
        // 找到最优先的元素位置
        for(int i = 0; i < size; i++){
            if(priorityQueue[i].getPriority() < min.getPriority()){
                min = priorityQueue[i];
                index = i;
            }
        }
        // 把这个位置之后的元素统统前移一位
        for (int j = index + 1; j < size; j ++){
            priorityQueue[j - 1] = priorityQueue[j];
        }
        rear = rear - 1;
        size --;
        return min; // 返回我们存储的元素
    }
}
