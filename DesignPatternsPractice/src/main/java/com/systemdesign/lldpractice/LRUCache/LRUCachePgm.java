package com.systemdesign.lldpractice.LRUCache;

import java.util.Map;

public class LRUCachePgm<K,V> {
    private Map<K, Node<K,V>> cacheMap;
    private DoublyLinkedList<K,V> cacheList;
    private int capacity;

    public LRUCachePgm(int capacity) {
        this.capacity = capacity;
        this.cacheMap = new java.util.HashMap<>();
        this.cacheList = new DoublyLinkedList<>();
    }

    // put method
    public synchronized void put(K key, V value){
        Node<K,V> node;
       if(cacheMap.get(key) != null){
          node = cacheMap.get(key);
          cacheList.removeNode(node);
          node.setValue(value);
          cacheList.addNode(node);
       }else{
            //eviction logic here
            if(cacheMap.size() == capacity){
               Node<K,V> lastNode = cacheList.removeNodeFromTail();
               if(lastNode != null){
                cacheMap.remove(lastNode.key);
               }
            }
            node = new Node(key, value);
            cacheMap.put(key, node);
            cacheList.addNode(node);
       }
    }


    // get method
    public synchronized V get(K key){
        if(cacheMap.get(key) == null){
            return null;
        }
        Node<K,V> node = cacheMap.get(key);
        cacheList.removeNode(node);
        cacheList.addNode(node);
        return node.value;
    }


}
