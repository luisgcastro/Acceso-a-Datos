package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class unAI {
	
	public static void main(String [] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);
		
		System.out.println(cars.size());
		cars.get(0);
		System.out.println(cars.get(0));
		cars.set(0,"Opel");
		System.out.println(cars);
		cars.remove(0);
		System.out.println(cars);
		cars.clear();
		System.out.println(cars);
		
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(10);
		myNumbers.add(15);
		myNumbers.add(20);
		myNumbers.add(25);
		for (int i : myNumbers) {
			System.out.println(i);
		}
		Collections.shuffle(myNumbers);
		System.out.println(myNumbers);
		Collections.sort(myNumbers);
		System.out.println(myNumbers);
	
	}

}
