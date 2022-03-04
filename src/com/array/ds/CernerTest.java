package com.array.ds;

public final  class CernerTest {
	
	private  final int  empid;
    private final String name;
	 
    public CernerTest(int empid, String name)
    {
    	this.empid =empid;
    	this.name =name;
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CernerTest cernercity1 = new CernerTest(1, "Tausif");
		CernerTest cernercity2 =new CernerTest(2,"Anwar");
		
		System.out.println(cernercity1.equals(cernercity2));
	}

}
