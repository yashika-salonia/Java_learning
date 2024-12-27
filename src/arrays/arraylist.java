package arrays;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list=new ArrayList<>(10); //initial capacity does not matter
        list.add(5);
        list.add(66);
        list.add(239);
        list.add(4390);
        System.out.println((list));
        list.set(0,234);
        System.out.println((list));
        list.addLast(98);
        System.out.println((list));
        list.addFirst(32);
        System.out.println((list));
        list.add(3,22);
        System.out.println((list));

        //sum
        int sum=0;
        for(int i=0;i<10;i++){
            sum+=list.get(i);
        }
        System.out.println(sum);
    }
}
//when we don't know how much size we want in an array, we use array list
//arraylist is similar to vector in cpp
//only wrapper class is added in it like Integer, String
//the array once filled becomes the double of its size and now have extra space for storing next elements in it