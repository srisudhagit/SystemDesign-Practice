package com.systemdesign.lldpractice.LRUCache;

public class Client {
    public static void main(String[] args) {
        LRUCachePgm lrucache = new LRUCachePgm<>(3);
        lrucache.put(1, "Sudha");
        lrucache.put(2,"Sai");
        lrucache.put(3, "Sreyansh");
        System.out.println(lrucache.get(1));
        lrucache.put(4, "Shanmukh");
        System.out.println(lrucache.get(2));
     }
    
}
