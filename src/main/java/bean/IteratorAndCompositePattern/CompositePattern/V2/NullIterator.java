package main.java.bean.IteratorAndCompositePattern.CompositePattern.V2;

import java.util.Iterator;

/**
 * Created by Yang on 2018/1/15.
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
