package com.dsa.list_araay;

public class ListArray {
    final  int defaultSize = 10;

    int maxSize; // 最大元素数量
    int size; // 当前元素的个数
    Object[] listArray; // 定义一个顺序表

    // 构造器
    public ListArray(){
        setup(defaultSize);
    }

    public ListArray(int size){
        setup(size);
    }

    public void setup(int sz){
        maxSize = sz;
        size = 0;
        listArray = new Object[sz];
    }

    // 插入
    public void insert(int i, Object obj){
        if(size == maxSize){
            System.out.println("已满，无法插入");
        }
        if(i < 0 || i > size){
            System.out.println("参数错误");
        }
        for(int j = size; j > i; j--){
            listArray[j] = listArray[j - 1];
        }
        listArray[i] = obj;
        size++;
    }

    // 删除
    public Object delete(int i){
        if(size == 0){
            System.out.println("已空，无法删除");
        }
        if(i < 0 || i > size - 1){
            System.out.println("参数错误");
        }
        Object temp = listArray[i];
        for(int j = i; j < size - 1; j++){
            listArray[j] = listArray[j + 1];
        }
        size --;
        return temp;
    }

    // 获取元素值
    public Object getData(int i){
        if(size < 0 || i > size - 1){
            System.out.println("参数错误");
        }
        return listArray[i];
    }

    // 当前元素个数
    public int getSize(){
        return size;
    }

    // 是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    // 打印列表
    public void travel(){
        for(int i = 0; i < size; i++){
            System.out.print(listArray[i] + " ");
        }
        System.out.println();
    }
}
