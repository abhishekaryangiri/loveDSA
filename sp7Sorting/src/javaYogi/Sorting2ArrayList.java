package javaYogi;

import java.util.ArrayList;
import java.util.Comparator;

public class Sorting2ArrayList {
	public static void main(String[] args) {

	    // create an ArrayList
	    ArrayList<Integer> numbers = new ArrayList<>();
	    numbers.add(7);
	    numbers.add(3);
	    numbers.add(9);
	    numbers.add(-33);
	    System.out.println("Unsorted ArrayList: " + numbers);

	    // sort the ArrayList in ascending order
	    numbers.sort(Comparator.naturalOrder());

	    System.out.println("Sorted ArrayList: " + numbers);
	  }
}
