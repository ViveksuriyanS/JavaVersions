package Functional_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorInterfaceEg {
    public static void main(String[] args) {
        ArrayList<Mobile> stringArrayList = new ArrayList<>();
        stringArrayList.add(new Mobile("Apple" , 1));
        stringArrayList.add(new Mobile("Samsung" , 1));
        stringArrayList.add(new Mobile("Vivo" , 2));
        stringArrayList.add(new Mobile("Oppo" , 3));
        stringArrayList.add(new Mobile("MI" , 4));
        stringArrayList.add(new Mobile("Redmi" , 2));
        stringArrayList.add(new Mobile("Pixel" , 1));
        stringArrayList.add(new Mobile("One Plus" , 2));

        Collections.sort(stringArrayList, new Comparator<Mobile>() {
            @Override
            public int compare(Mobile o1, Mobile o2) {
                if(o1.ranking == o2.ranking){
                    return o1.name.compareTo(o2.name);
                } else if (o1.ranking < o2.ranking) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        System.out.println(stringArrayList);


    }
}

class Mobile {
    String name;
    int ranking;

    public Mobile(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return STR."Name : \{name}, Ranking : \{ranking}";
    }
}

// Comparable interface is in java.lang package
// Comparable Interface contains method compareTo() to sort the order of elements

// It doesn't make sense to use comparable using Lambda Expression
    // Instead it can be implemented in a class to compare the objects

// Though it has only one abstract method, it is a Functional Interface theoretically
    // But it is an Interface