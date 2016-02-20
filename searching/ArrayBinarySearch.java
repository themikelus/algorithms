/* 
 *-Binary search-
 *	In computer science, a binary search or half-interval search algorithm finds the position of a 
 *	target value within a sorted array. The binary search algorithm can be classified as a dichotomic 
 *	divide-and-conquer search algorithm.
 *
 *	Worst case performance 	   O(log n)
 *	Best case performance 	   O(1)
 *	Average case performance   O(log n)
 *
 *	Binary search algorithm. From Wikipedia, the free encyclopedia. https://en.wikipedia.org/wiki/Binary_search_algorithm
 *
 *
 *-Solution-
 *	public static int search(int number, int[] sortedArray)
 *	
 *	Where "int number" is an int >= 0.
 *	Where "int[] sortedArray" is a sorted array with length > 0.
 *
 *	This method will return a negative value if the number is not in the array.
 *	This method will return a positive value (array index) where the number is allocated.

 *	e.g.:
 *	number = 17
 *	sortedArray = [2, 3, 4, 9, 10, 17, 20]
 *
 *	In this exercise we are using an iterative method.
 *
 *	call#1
 *	number=17
 *	sortedArray=[2, 3, 4, 9, 10, 17, 20]   (pivot=9)
 *	
 *		sortedArray=[10, 17, 20]	       (pivot=17)
 *
 *	Found! 17 is at index #5
 *	
 *
 *-author-
 *	Mikel Solabarrieta (19 feb 2016)
 */
public class ArrayBinarySearch {
	
	public static void main(String[] args) {
		System.out.println("Search number (17) in this array [2, 3, 4, 9, 10, 17, 20]: " + search(17, new int[] {2, 3, 4, 9, 10, 17, 20}));
		System.out.println("Search number (15) in this array [2, 3, 4, 9, 10, 17, 20]: " + search(15, new int[] {2, 3, 4, 9, 10, 17, 20}));
		System.out.println("Search number (3) in this array [2, 3, 4, 9, 10, 17, 20]: " + search(3, new int[] {2, 3, 4, 9, 10, 17, 20}));
		System.out.println("Search number (4) in this array [2, 3, 4, 9, 10, 17, 20]: " + search(4, new int[] {2, 3, 4, 9, 10, 17, 20}));
		System.out.println("Search number (20) in this array [2, 3, 4, 9, 10, 17, 20]: " + search(20, new int[] {2, 3, 4, 9, 10, 17, 20}));
		System.out.println("Search number (9) in this array [2, 3, 4, 9, 10, 17, 20]: " + search(9, new int[] {2, 3, 4, 9, 10, 17, 20}));
		System.out.println("Search number (0) in this array [0, 3]: " + search(0, new int[] {0, 3}));
		System.out.println("Search number (3) in this array [1]: " + search(3, new int[] {1}));
		System.out.println("Search number (2) in this array [2]: " + search(2, new int[] {2}));
	}

	public static int search(int number, int[] sortedArray) {
		int lower = 0, higher = sortedArray.length - 1;
		int index = 0;

		while(lower <= higher) {
			index = (lower + higher) / 2;

			if(sortedArray[index] == number) {
				return index;
			}

			if(sortedArray[index] < number) {
				lower = index + 1;
			}
			else {
				higher = index - 1;
			}
		}

		return -1;
	}
}