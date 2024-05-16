package de.unistuttgart.dsass2024.ex04.p2;



public class AVLTree<K extends Comparable<K>> implements IAVLTree<K> {
    private AVLNode<K> root = null;

    @Override
    public AVLNode<K> getRootNode() {
        return root;
    }

    @Override
    public void setRootNode(AVLNode<K> node) {
        root = node;
    }

    @Override
    public void insert(K k) {
        if (root == null)
            root = new AVLNode<>(k);
        else
            root = insertRecursive(root, k);
    }

    private AVLNode<K> insertRecursive(AVLNode<K> n, K k) {
        int cmp = n.getKey().compareTo(k);
        if (cmp == 0) {
            // Schlüssel bereits vorhanden. Es ist nichts zu tun.
        } else if (cmp < 0) {
            // Rechts einfügen
            if (n.getRight() != null) {
                // Im rechten Teilbaum einfügen (rekursiv)
                n.setRight(insertRecursive(n.getRight(), k));
            } else {
                // Neuen Blattknoten rechts erzeugen
                n.setRight(new AVLNode<>(k));
            }
            // Höhe des rechten Teilbaums könnte sich verändert haben
            n.updateHeight();
            // Ggf. rebalancieren
            n = rebalance(n);
        } else {
            // Links einfügen (symmetrisch)
            if (n.getLeft() != null) {
                // Im linken Teilbaum einfügen (rekursiv)
                n.setLeft(insertRecursive(n.getLeft(), k));
            } else {
                // Neuen Blattknoten links erzeugen
                n.setLeft(new AVLNode<>(k));
            }
            // Höhe des linken Teilbaums könnte sich verändert haben
            n.updateHeight();
            // Ggf. rebalancieren
            n = rebalance(n);
        }

        return n;
    }



    private AVLNode<K> rotateLeft(AVLNode<K> n) {
        AVLNode<K> tmp = n.getRight();
        n.setRight(tmp.getLeft());
        n.updateHeight();
        tmp.setLeft(n);
        tmp.updateHeight();
        return tmp;
    }

    private AVLNode<K> rotateRight(AVLNode<K> n) {
        AVLNode<K> tmp = n.getLeft();
        n.setLeft(tmp.getRight());
        n.updateHeight();
        tmp.setRight(n);
        tmp.updateHeight();
        return tmp;
    }
}