/**
 * 
 */
package Algorithms;

/**
 * @author Whitney Holmes 3502092
 * Basic sorting algorithms from the Data Structures and Algorithms course at UNB
 * @param <T> which is a general Data item type
 * 
 * Notes:
 * Primitive operations:
 * --Assigning a value to a variable
 * --Following an object reference
 * --Performing an arithmic operation
 * --Comparing two numbers
 * --Accessing a single element of an array by index
 * --Calling a method
 * --Returning from a method
 * Each have a running time of t (actual time doesn't matter, 
 * as it is usually similar on the same machine) 
 * times by the amount of times it is done
 * The function f(n) of each algorithm is a characterization of the number of 
 * primitive operations performed as a function of input size (n)
 * 
 * S1=[1,2,4,3,5] -- best case
 * S2=[5,4,2,3,1] -- worst case
 * 
 * The constant function - f(n) = c; most common is g(n) = 1, and any other
 * constant function can be written at f(n) = cg(n) -- used with basic operations
 * 
 * The logarithm functions
 *  - f(n) = logbn (for some constant b > 1) It is an inverse of a power
 * where x = logbn iff b^x = n 
 * The most common base for cs application is 2 (b = 2)...therefore logn = log2n...
 * and can be seen as 2^x = n with n being an integer. Calculating this uses calculus. 
 * We can get an approx. by the ceiling principle, where the ceiling of any real number, x, 
 * is the smallest integer greater than or equal to x. where x <= ceiling of x < x + 1
 * So, for a positive integer n, we repeatedly divide n by b (in this case 2) and stop when we 
 * get a number <= 1. The number of divisions performed is equal to the ceiling of logbn
 * examples being:
 * -- ceiling of log3,27 = 3 b/c ((27/3)/3)/3 = 1;
 * -- ceiling of log2,12 = 4 b/c (((12/2)/2)/2)/2 = 0.75 <= 1
 * 
 * log(2n) = 1 + logn
 * log(n/2) = logn - 1 
 * logn^3 = 3logn
 * log2^n = nlog2 = n * 1 = n
 * log4,n = (logn)/log4 = (logn)/2 ---> log2n = log10,n/log10,2 (how to use LOG on calculator to get a diff. base)
 * 2^logn = n^log2 = n^1 = n
 * 
 * Linear Functions
 * f(n) = n, it is used when the basic operation is done over n items 
 * n-log-n Function
 * f(n) = nlogn
 * This function grows slightly more rapid than a linear function, but much less rapidly than a quadtratic function
 * 
 * Quadratic Functions
 * These are usually associated with loops where the outer loop runs n times for each inner loop that runs n times. 
 * f(n) = n * n = n^2
 * 
 * Nested Loops and Summation 
 * 1+2+3+...+(n-2)+(n-1)+n can be described as (n(n+1))/2
 * b/c a graph of length n where each nth(index) unit column is its index in height (forms an f(x) = x line)
 * can be divided by 2 along the x-axis (hence the 1/2 above), with the right-half flipped horizontally 
 * and placed on top of the left-half, in which the max height becomes n + 1 (1 from the first-column's height) 
 * and since the area = sum of all the columns (since column 1 has 1 unit, column 2 has 2 units, 1 + 2 = 3, 3 units total 
 * and so forth) the sum of all n columns is the area, which is (n/2) * (n+1) = (n(n+1))/2 
 * And since this can be expanded to (n*n + n*1)/2 = (n^2)/2 + n/2, which is quadratic. (detirmined off the highest power)
 * 
 * Cubic Functions
 * f(n) = n^3
 * This appears less often, and grows at a much faster rate
 * 
 * Polynomial Functions
 * This encompasses the linear, quadratic, and cubic functions above, where
 * f(n) = a0,n^0 + a1,n^1 + a2,n^2 + a3,n^3 + ... + ab,n^b, where
 * a0, a1, ..., ab are constants(coefficients) and integer b where ab /= 0, is the degree of the polynomial.
 * Running times that are polynomails of a small degree are usually better than ones with a larger degree
 * 
 */
public class SortingAlgorithms<T> implements Data{

	/**
	 *A set of static methods for sorting data
	 */
	public static SortingAlgorithms() {
	}
	
	public static T[] selectionSort(T[] dataIn) {
		T[] dataOut = new T[];
		
		long startTime = System.currentTimeMillis();
		
		/*
		 * Algorithm
		 */
		
		long endTime = System.currentTimeMillis();
		long elapsed = endTime - startTime;
		//System.out.println("\nThe total run time of this algorithm: " + elapsed + " seconds.\n");
		
		return dataOut;
	}
	
	public static T[] mergeSort(T[] dataIn) {
		T[] dataOut = new T[];

		long startTime = System.currentTimeMillis();
		
		/*
		 * Algorithm
		 */
		
		long endTime = System.currentTimeMillis();
		long elapsed = endTime - startTime;
		//System.out.println("\nThe total run time of this algorithm: " + elapsed + " seconds.\n");
		
		return dataOut;
	}
	
	public static T[] insertionSort(T[] dataIn) {
		T[] dataOut = new T[];

		long startTime = System.currentTimeMillis();
		
		/*
		 * Algorithm
		 */
		
		long endTime = System.currentTimeMillis();
		long elapsed = endTime - startTime;
		//System.out.println("\nThe total run time of this algorithm: " + elapsed + " seconds.\n");
		
		return dataOut;
	}

}
