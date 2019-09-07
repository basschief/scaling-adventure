/*
 * Brett Markland
 * CSCI1302_M1
 * Professor Naidu, M.
 * lab1 Q1
 */

package lab1;

import java.util.*;

public class Q1 {
	
	public static void main(String args[]) {
		String[] names = new String[0];
		int[] grades = new int[0];
		namesAndGrades(names, grades);
		System.out.println(names.toString());
		System.out.println(grades.toString());
	}
	
	public static void namesAndGrades(String[] a, int[] b) {
		
		/*Accepts names and grades and uses them to populate two parallel, single-dimensional arrays until the name "alldone" is read*/
			
		/*Objects*/
		int c = 0; int grade = 0; String name;
		String namesCurrent[] = new String[0];
		String namesTemp[] = new String[0]; 
		int gradesCurrent[] = new int[0];
		int gradesTemp[] = new int[0];
		Scanner scan = new Scanner(System.in);
		
		do {System.out.println("Please input the next student name(s) and grades(s)");			// queries user for input for each iteration
			
			do {
				/*Gets names*/	
				name = scan.next();																// scans next name
				if(!(name.toLowerCase().equals("alldone"))) {									// checks for "alldone"
					namesCurrent = new String[++c];												// iterates c and then lengthens the current array
					for(int i = 0; i < c-1; i++) { 												// begins running once c reaches 2
						namesCurrent[i] = namesTemp[i];}										// copies the temp contents into the current array
					namesCurrent[c-1] = name;													// populates the newest index with user input
					namesTemp = new String[c];													// lengthens the temp array
					for(int i = 0; i < namesTemp.length-1; i++) {								// runs for each index in the temp array
						namesTemp[i] = namesCurrent[i];}										// copies the current contents into the temp array
					/*Gets grades*/
					grade = scan.nextInt();														// scans next grade
					gradesCurrent = new int[c];													// lengthens the current grades array
					for(int i = 0; i < c-1; i++) { 												// begins running once c reaches 2
						gradesCurrent[i] = gradesTemp[i];}										// copies the temp contents into the current array
					gradesCurrent[c-1] = grade;													// populates the newest index with user input
					gradesTemp = new int[c];													// lengthens the temp array
					for(int i = 0; i < gradesTemp.length-1; i++) {								// runs for each index in the temp array
						gradesTemp[i] = gradesCurrent[i];}										// copies the current contents into the temp array
					}
						
				}while(scan.hasNext() && !(name.toLowerCase().equals("alldone")));				// runs as long as there is input to be consumed and the name is not "alldone"
				
			}while(!(name.toLowerCase().equals("alldone")));									// runs until disqualifier is found
		
		scan.close();																			// scanner closed
		
		/*Copies the values of the names array to the passed String[] a*/																	
		a = new String[c];
		for(int i = 0; i < c; i++) {
			a[i] = namesCurrent[i];
		}
		/*Copies the values of the grades array to the passed int[] b*/
		b = new int[c];
		for(int i = 0; i < c; i++) {
			b[i] = gradesCurrent[i];
		}
	}
	
	public static void toString(String[] a) {
		/*Prints out String arrays*/
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.println();
		}
	}
}
