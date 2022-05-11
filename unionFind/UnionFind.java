package com.dsa.unionFind;

public class UnionFind {
    // good存的是第i个东西的大爹
    int[] good;
    // cnt存的第i个大爹带了几个小弟
    int[] cnt;
    // 大爹的个数
    int v;

    public UnionFind() {
    }

    public void init (int n) {
        good = new int[n + 1];
        cnt = new int[n + 1];
        v = n;
        for (int i = 1; i <= n; i++) {
            good[i] = i;
            cnt[i] = 1;
        }
    }

    public int find (int e) {
        while (e != good[e]) e = find(good[e]);
        return e;
    }

    public void union (int a, int b) {
        int r1 = find(a);
        int r2 = find(b);
        if (r1 == r2) return;
        if (cnt[r1] > cnt[r2]) {
            cnt[r1] += cnt[r2];
            good[r2] = r1;
        } else {
            cnt[r2] += cnt[r1];
            good[r1] = r2;
        }
        v--;
    }
}
