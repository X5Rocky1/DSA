package de.unistuttgart.dsass2024.ex04.p2;

/**
 * @param <K>
 *
 * This Interface provides the necessary methods your AVL-Tree should have.
 */
public interface IAVLTree<K extends Comparable<K>> {

    /**
     * Returns the root node of the binary search tree.
     *
     * @return root node of the tree
     */
    public AVLNode<K> getRootNode();

    /**
     * Sets the root node of the binary search tree. This effectively overrides the tree
     * with the sub tree starting at node (the new root node).
     */
    public void setRootNode(AVLNode<K> node);

    /**
     * Inserts a node with the given element into the AVL-Tree. If the balance-property
     * of the tree gets violated, the necessary rotations should be done to reestablish
     * the balance.
     *
     * @param k the element to be inserted
     */
    public void insert(K k);

    /**
     * Deletes a node with the given element from the AVL-Tree. If the balance-property
     * of the tree gets violated, the necessary rotations should be done to reestablish
     * the balance.
     *
     * @param k the element to be removed
     */
    public void remove(K k);

    /**
     * Rebalances an AVL-sub-tree with root n and returns the new root of the sub tree.
     * When calling this function, the node n has balance between [-2, 2] and all
     * descendants (i.e., nodes below n) are AVL-balanced, i.e., have balance between
     * [-1, 1].
     *
     * @param n
     * @return the new root of the sub tree (after rebalancing)
     */
    public AVLNode<K> rebalance(AVLNode<K> n);

}