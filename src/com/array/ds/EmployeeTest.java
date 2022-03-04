package com.array.ds;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<EmployeeStream> list =new ArrayList<EmployeeStream>();
		
		list.add(new EmployeeStream(1, "Tausif", 25000));
		list.add(new EmployeeStream(2, "Anwar", 50000));
		list.add(new EmployeeStream(3, "Manoj", 250000));
		list.add(new EmployeeStream(4, "Akash", 25000));
		list.add(new EmployeeStream(5, "Ferheen", 26000));
			
		List <EmployeeStream>ls = list.stream().filter(x1 -> x1.getSalary() >=50000).collect(Collectors.toList());
		
		Iterator<EmployeeStream> itr = ls.iterator();
		
		while(itr.hasNext())
		{
			System.out.println("Employee"+itr.next());
		}
		
		List <EmployeeStream>ls1 = list.stream().sorted((o1,o2)->(int)(o1.getSalary() -o2.getSalary())).collect(Collectors.toList());
		
		System.out.println(ls1);
		
		 List < EmployeeStream > employeesSortedList2 = list.stream()
		            .sorted(Comparator.comparing(EmployeeStream::getName)).collect(Collectors.toList()); //ascending order
		        System.out.println(employeesSortedList2);
	
	}

}
