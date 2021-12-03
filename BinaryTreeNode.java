package com.dsa.binaryTree;

public class BinaryTreeNode {
    BinaryTreeNode leftChild; // 结点的左孩子
    BinaryTreeNode rightChild; // 结点的右孩子
    Object data; // 结点存放的值

    // 构造器
    public BinaryTreeNode() {
        leftChild = rightChild = null;
    }

    public BinaryTreeNode(Object obj, BinaryTreeNode left, BinaryTreeNode right) {
        data = obj;
        leftChild = left;
        rightChild = right;
    }

    // get方法
    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;
    }

    public Object getData() {
        return data;
    }
}
