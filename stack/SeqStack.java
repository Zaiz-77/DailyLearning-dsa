package com.dsa.seq_stack;

public class SeqStack {
    // 定义一些属性
    final int defaultSize = 10;
    int top;
    int maxSize;
    Object[] stack;

    // 构造器
    public SeqStack(){
        setup(defaultSize);
    }

    // 有参构造
    public SeqStack(int sz){
        setup(sz);
    }

    // 初始化函数
    public void setup(int sz){
        top = 0;
        maxSize = sz;
        stack = new Object[sz];
    }

    // 入栈
    public void push(Object obj){
        if(top == maxSize){
            System.out.println("已满，无法入栈");
        }
        stack[top] = obj;
        top ++;
    }

    // 弹栈
    public Object pop(){
        if(top == 0){
            System.out.println("已空，无法弹栈");
        }
        top --;  // 虽然现在top的位置仍然有元素，但由于top标签位置就是栈顶，所以不考虑这个位置是否有元素
        return stack[top];
    }

    // 是否为空
    public boolean isEmpty(){
        return top == 0;
    }

    // 遍历
    public void travel(){
        for(int i = 0; i < top; i ++){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
