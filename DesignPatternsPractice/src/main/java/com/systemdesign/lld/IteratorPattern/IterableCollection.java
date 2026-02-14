package com.systemdesign.lld.IteratorPattern;

// any class implementing this interface guaranteed to provide an iterator
public interface IterableCollection<T> {
    Iterable<T> createInterator();
}
