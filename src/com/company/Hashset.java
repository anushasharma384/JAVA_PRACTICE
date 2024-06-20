package com.company;
import java.util.HashSet;

//A set that uses hashing technique
// A set follows no repetition.
public class Hashset {
    public static void main(String[] args) {
        //load factor indicates how full a hash table can become before its capacity is automatically increased.
        //initial capacity - 16 and default load factor - 0.75
        HashSet<Integer> hs = new HashSet<>();
        //initial capacity - 32 and load factor - 0.68
        HashSet<Integer> hs1 = new HashSet<>(32, 0.62F);
        //method to overcome hashing collision:
        // 1. Over addressing
        // 2. Chaining
        hs.add(9);
        hs.add(40);
        hs.add(89);
        hs.add(90);
        hs.add(9);
        //other methods are same like arraylist and linked list
    }
}
