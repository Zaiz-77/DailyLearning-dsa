package com.dsa.unionFind;

// 并查集
public class UnionFind {
    UnionFindNode [] set; // 集合
    int n; // 集合中元素的个数

    // 初始化
    public UnionFind(int sz){
        n = sz;
        set = new UnionFindNode[n];

        // 初始化的集合
        for (int i = 1; i < n; i++) {
            set[i] = new UnionFindNode();
            set[i].data = i;
            set[i].parent = -1;
        }
    }

    // find 方法,去找i的最根处的结点
    public int Find(int i){
        int cursor = i;
        while (set[cursor].parent >= 0) cursor = set[cursor].parent;
        return cursor;
    }

    // union方法,将不相同根的集合并起来
    public void Union(int i, int j){
        set[j].parent = i; // 就是j去往上找的时候先找i
        int temp = Find(i); // 找到i的那个根
        set[temp].parent -= 1; // 多挂了一个j，所以要-1
    }
}
