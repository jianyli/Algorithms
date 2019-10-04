package com.li.structure;

public interface IList {
    void clear();
    boolean isEmpty();
    int length();
    Object get(int i);
    void inset(int i, Object t) throws Exception;
    void remove(int i) ;
    int indexOf(Object t);
}
