package com.array.ds;

public class ImmutableTest {
	
	private final int id;
	private final String name;
	
	

	public ImmutableTest(int id, String name) {
		//super();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
		
		if(obj==this)
		{
			return true;
		}
		if(!(obj instanceof ImmutableTest ))
		{
			return false;
		}
		ImmutableTest im= (ImmutableTest) obj;
		
		//return name.equals(im.name) && Integer.compare(id, im.id)==0;
		return Integer.compare(id, im.id)==0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ImmutableTest test1 = new ImmutableTest(1, "Tausif");
		 ImmutableTest test2 = new ImmutableTest(1, "Anwar");
		 
		 System.out.println(test1.equals(test2));
	}

}
