package com.array.ds;

public class App {

	
		public static void main(String[] args) {
			
			Address adr = new Address("Sitamarhi", "India");
			Student st = new Student("Tausif",1,adr);
			
			System.out.println(st);
			
			Address adrs = st.getAdr();
			
			adrs.setCity("Patna");
			adrs.setCountry("India");
			
			System.out.println(st);
		}
}
