package com.studentsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings({"unchecked", "resource","rawtypes"})
public interface Student extends Comparator{
	/**
	 * Obtain student data from user
	 * Sorting of student data
	 * Printing the name of students in sorted order
	 * @param args
	 */
	public static void main(String[] args){  
		 Scanner in = new Scanner(System.in);
		 System.out.println("enter the  total no of students");  
		 int testC = in.nextInt();     
		 List Listofstudents = new ArrayList();    
		System.out.println("Enter values:");
		 while(testC>0){   
			 int id1=in.nextInt();
				String name1= in.next();
				double cgpa1= in.nextDouble();
			Comparedata cmp = new Comparedata(id1, name1, cgpa1); 
			 Listofstudents.add(cmp);        
			 testC--;    
			 }    
		 Collections.sort(Listofstudents); 
		 Iterator itr=Listofstudents.iterator();  
			while(itr.hasNext()){  
			Comparedata cmp=(Comparedata)itr.next();  
			System.out.println(cmp.Stname);  

				 } 
			 }
	}
