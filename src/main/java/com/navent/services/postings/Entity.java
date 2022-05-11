package com.navent.services.postings;

public abstract class Entity implements Cloneable {

    abstract public int hashCode();

    abstract public boolean equals (Object obj);

    abstract public String toString();

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

