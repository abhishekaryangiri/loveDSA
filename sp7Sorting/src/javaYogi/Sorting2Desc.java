package javaYogi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting2Desc {
	public static void main(String[] args) {

        // Creating an array list
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Unsorted ArrayList: " + numbers);

        // Using the sort() method
        Collections.sort(numbers);
        System.out.println("Natural Sorting: " + numbers);

        // Using the customized sort() method
        Collections.sort(numbers, new CustomComparator());
        System.out.println("Customized Sorting: " + numbers);

    }
}

class CustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer animal1, Integer animal2) {
        int value =  animal1.compareTo(animal2);
        // elements are sorted in reverse order
        if (value > 0) {
            return -1;
        }
        else if (value < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
