package de.unistuttgart.dsass2024.ex05.p2;

import java.util.Set;

/**
 * Hint:
 * - To manage the strings of the outgoing edges, you could use a HashMap which maps strings to nodes
 */
public interface IPrefixTreeNode {

    /**
     * Sets the prefix string of the node
     *
     * @param prefix
     */
    public void setPrefix(String prefix);

    /**
     * Returns the prefix string of the node
     *
     * @return String prefix
     */
    public String getPrefix();

    /**
     * Returns a set of all characters on the outgoing edges, i.e., edges to existing children
     *
     * @return set of characters on the outgoing edges
     */
    public Set<Character> getLabels();

    /**
     * Sets the child node for a certain character
     *
     * @param label character on the edge to the child node
     * @param node child node
     */
    public void setChild(char label, IPrefixTreeNode node);

    /**
     * Returns the child node for a certain character
     *
     * @param label character on the edge to the child node
     * @return child node for the given character, or null if there's no such edge
     */
    public IPrefixTreeNode getChild(char label);

    /**
     * Removes all children of the node
     */
    public void removeChildren();
}