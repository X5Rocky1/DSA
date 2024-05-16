package de.unistuttgart.dsass2024.ex04.p2;

public class AVLNode<K extends Comparable<K>> {private int height;
    private K key;
    private AVLNode<K> left = null, right = null;

    public AVLNode(K e) { key = e; height = 1; }

    public K getKey() { return key; }
    public AVLNode<K> getLeft() { return left; }
    public AVLNode<K> getRight() { return right; }
    public void setKey(K k) { key = k; }
    public void setLeft(AVLNode<K> n) { left = n; }
    public void setRight(AVLNode<K> n) { right = n; }

    public void updateHeight() {
        int l = (left == null) ? 0 : left.height;
        int r = (right == null) ? 0 : right.height;
        height = Math.max(l, r) + 1;
    }

    public int getBalance() {
        int l = (left == null) ? 0 : left.height;
        int r = (right == null) ? 0 : right.height;
        return l - r;
    }

    public boolean subtreeEquals(AVLNode<K> other) {
        if (!key.equals(other.getKey()))
            return false;
        if (left == null && other.getLeft() != null)
            return false;
        if (left != null && !left.subtreeEquals(other.getLeft()))
            return false;
        if (right == null && other.getRight() != null)
            return false;
        if (right != null && !right.subtreeEquals(other.getRight()))
            return false;
        return true;
    }
}