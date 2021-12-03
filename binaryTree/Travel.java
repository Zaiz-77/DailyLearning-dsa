package com.dsa.binaryTree;

// 二叉树的遍历类
public class Travel {
    // 先序遍历
    public void preOrder(BinaryTreeNode t, Visit vs){
        if(t != null){
            vs.print(t.getData());
            preOrder(t.getLeftChild(), vs);
            preOrder(t.getRightChild(), vs);
        }
    }

    // 中序遍历
    public void inOrder(BinaryTreeNode t, Visit vs){
        if(t != null){
            inOrder(t.getLeftChild(), vs);
            vs.print(t.getData());
            inOrder(t.getRightChild(), vs);
        }
    }

    // 后序遍历
    public void postOrder(BinaryTreeNode t, Visit vs){
        if(t != null){
            postOrder(t.getLeftChild(), vs);
            postOrder(t.getRightChild(), vs);
            vs.print(t.getData());
        }
    }
}
