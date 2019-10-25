package com.practice23generics.model;

public class  Subtrac <K,V> {
    K key;
    V value;

    public Subtrac()
    {

    }

    public Subtrac(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    public K getKey()
    {
        return this.key;
    }

    public  V getValue()
    {
        return  this.value;
    }

    public  void setKey(K key)
    {
        this.key = key;
    }

    public void setValue(V value)
    {
        this.value = value;
    }

    public String ToString()
    {
        return "key: "+this.key+" value: "+this.value;
    }
}
