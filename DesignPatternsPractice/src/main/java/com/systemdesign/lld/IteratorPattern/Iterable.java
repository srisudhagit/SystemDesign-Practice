package com.systemdesign.lld.IteratorPattern;

// Interface for standard iteration operations provided via iterable interface 
public interface Iterable<T> {
    boolean hasNext();
    T next();
}
