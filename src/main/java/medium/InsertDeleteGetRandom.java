package main.java.medium;

import java.security.SecureRandom;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;

/**
 * {@link https://leetcode.com/problems/insert-delete-getrandom-o1/description}
 */

public class InsertDeleteGetRandom {

    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        System.out.println(randomizedSet.insert(1)); // true
        System.out.println(randomizedSet.insert(2)); // true
        System.out.println(randomizedSet.insert(2)); // false
        System.out.println(randomizedSet.remove(1)); // true
        System.out.println(randomizedSet.remove(3)); // false
        System.out.println(randomizedSet.getRandom()); // Random element from the set

    }


}

class RandomizedSet {

    private LinkedHashSet<Integer> linkedHashSet;
    private SecureRandom random;

    public RandomizedSet() {
        linkedHashSet = new LinkedHashSet<>();
        random = new SecureRandom();
    }

    public boolean insert(int val) {
        return linkedHashSet.add(val);
    }

    public boolean remove(int val) {
        return linkedHashSet.remove(val);
    }

    public int getRandom() {
        int index = random.nextInt(linkedHashSet.size());
        Iterator<Integer> iterator = linkedHashSet.iterator();

        for (int i = 0; i < index; i++) {
            iterator.next();
        }

        return iterator.next();
    }
}
