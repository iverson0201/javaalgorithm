package ssj.algorithm.collections;

import java.util.Iterator;

/**
 * Created by shenshijun on 15/2/5.
 */
interface SearchTree<T extends Comparable<T>> extends Iterable<T> {
    void add(T ele);

    int size();

    Iterator<T> preIterator();

    Iterator<T> postIterator();

    void delete(T ele);

    T max();

    T min();

    T kthElement(int k);

    boolean contains(T ele);
}
