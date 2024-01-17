
/**
 * The CourseList class represents a collection of courses stored in a linked list.
 * It provides various methods for manipulating and displaying course data, such as adding,
 * printing, converting to uppercase, deleting elements, reversing, sorting, and removing duplicates.
 * The main method initializes two linked lists with course names, performs various
 * operations, and displays the results.
 *
 * @author Hong Phong Nguyen
 * @version 1.0
 * @since 12/01/2023
 */
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Collection;
import java.util.Set;
import java.util.HashSet;

public class CourseList {
	/**
	 * Main method to demonstrate the functionality of the CourseList class and used
	 * as an entry point for the class
	 *
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		String[] courses = { "math", "english", "chemistry", "physics", "history", "geography" };

		LinkedList<String> list1 = new LinkedList<>();
		for (String crs : courses) {
			list1.add(crs);
		}

		LinkedList<String> list2 = new LinkedList<>();
		String[] courses2 = { "religion", "arts", "accounting", "math", "programming", "biology" };
		for (String crs2 : courses2) {
			list2.add(crs2);
		}
		list1.addAll(list2);
		System.out.println("The List is:");
		printList(list1);
		System.out.printf("%nDisplaying names of courses in uppercase letters...\n");
		System.out.println();
		System.out.println("The List is:");
		printListUpperCase(list1);
		System.out.printf("%nDeleting courses 4 to 6...\n");
		System.out.println();
		System.out.println("The List is:");
		deleteElements(list1, 4, 7);

		System.out.printf("%nHere is the current list of courses...\n");
		System.out.println();
		System.out.println("The List is:");
		printList(list1);
		System.out.println();
		reversedList(list1);
		System.out.printf("%nSorted courses in alphabetical order...\n");
		System.out.println();
		System.out.println("The List is:");
		sortList(list1);
		System.out.println();
		System.out.printf("%nRemoving duplicate courses...");
		System.out.println();
		removeDuplicates(list1);
	}

	/**
	 * Prints the elements of the linked list.
	 *
	 * @param list The linked list to be printed.
	 */
	public static void printList(LinkedList<String> list) {
		for (String s : list) {
			System.out.printf("%s ", s);
		}
		System.out.println();
	}

	/**
	 * Converts the elements of the linked list to uppercase and prints them.
	 *
	 * @param list The linked list to be processed.
	 */
	public static void printListUpperCase(LinkedList<String> list) {
		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			String s = iterator.next();
			iterator.set(s.toUpperCase());
		}
		printList(list);
	}

	/**
	 * Deletes elements within the specified range in the linked list.
	 *
	 * @param list  The linked list from which elements will be deleted.
	 * @param start The starting index of the range (inclusive).
	 * @param end   The ending index of the range (exclusive).
	 */
	public static void deleteElements(LinkedList<String> list, int start, int end) {
		list.subList(start, end).clear();
		printList(list);
	}

	/**
	 * Prints the reversed elements of the linked list.
	 *
	 * @param list The linked list to be reversed and printed.
	 */
	public static void reversedList(LinkedList<String> list) {
		ListIterator<String> iterator = list.listIterator(list.size());

		System.out.println("Reversed List");
		while (iterator.hasPrevious()) {
			System.out.printf("%s ", iterator.previous());
		}
		System.out.println();
	}

	/**
	 * Sorts the elements of the linked list in alphabetical order and prints them.
	 *
	 * @param list The linked list to be sorted.
	 */
	public static void sortList(LinkedList<String> list) {
		Collections.sort(list);
		for (String s : list) {
			System.out.printf("%s ", s);
		}
	}

	/**
	 * Removes duplicate elements from the linked list and prints the result.
	 *
	 * @param list The linked list from which duplicates will be removed.
	 */
	public static void removeDuplicates(LinkedList<String> list) {
		Set<String> newSet = new HashSet<>(list);
		System.out.print("Non-duplicates are: ");
		list.clear(); // Clear the list
		// adding all list again
		list.addAll(newSet);
		printList(list);
	}
}
