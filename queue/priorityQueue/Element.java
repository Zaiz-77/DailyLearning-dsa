package com.dsa.queue.priorityQueue;

// 对优先级队列里面的元素编写一个类，因为他们具有一些共同的特征
public class Element {
    private Object elem; // 元素的值
    private int priority; // 优先级

    // 构造器
    public Element(Object obj, int pri){
        elem = obj;
        priority = pri;
    }

    // 对私有对象的获取和设置
    public Object getElem() {
        return elem;
    }

    public void setElem(Object obj) {
        elem = obj;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int i) {
        priority = i;
    }
}
