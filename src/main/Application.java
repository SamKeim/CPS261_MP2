package main;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		// An attempt at practicing Lambdas
		Print printer = (List<Student> students, String msg) -> {
			System.out.println(msg);
			for (Student s : students) {
				System.out.println(s);
			}
			System.out.print("\n");
		};

		// Create base list and print
		List<Student> students = new ArrayList<>();
		students.add(new Student("Charles", 4.0));
		students.add(new Student("Abigail", 3.9));
		students.add(new Student("Beatrice", 3.5));
		students.add(new Student("Charlotte", 2.8));
		students.add(new Student("Gregory", 4.0));
		
		printer.printAll(students, "Base List:");
		
		
		// Shuffle and print
		students = MySelectionSort.shuffle(students);
		printer.printAll(students, "Shuffled:");
		
		
		// Sort using class compareTo and print
		students = MySelectionSort.sort(students);
		printer.printAll(students, "Sorted:");
	}
}

interface Print {
	void printAll(List<Student> s, String msg);
}
