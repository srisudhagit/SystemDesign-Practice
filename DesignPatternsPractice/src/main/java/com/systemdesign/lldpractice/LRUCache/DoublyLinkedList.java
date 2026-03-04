package com.systemdesign.lldpractice.LRUCache;

public class DoublyLinkedList<K,V> {
    private final Node<K,V> headNode;
    private final Node<K,V> tailNode;

    public DoublyLinkedList() {
        this.headNode = new Node<>(null, null);
        this.tailNode = new Node<>(null, null);
        this.headNode.next = this.tailNode;
        this.tailNode.prev = this.headNode;
    }

    //add node
    public void addNode(Node<K,V> node){
        node.next = this.headNode.next;
        this.headNode.next = node;
        node.prev = this.headNode;
        node.next.prev = node;
    }

    //remove node
    public void removeNode(Node<K,V> node){
      node.prev.next = node.next;
      node.next.prev = node.prev;
    }   

    //remove node from tail
    public Node<K,V> removeNodeFromTail(){
        if(this.tailNode.prev == this.headNode){
            return null;
        }
        Node<K,V> nodeToRemove = this.tailNode.prev;
        removeNode(nodeToRemove);
        return nodeToRemove;
    }
    

}
