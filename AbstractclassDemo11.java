package com.first_java;

public abstract class AbstractclassDemo {
	
	 public abstract void add();
	 public void sub()
	 {
		 System.out.print("Yo");
	 }
}

class Child extends AbstractclassDemo
{
	public void add()
	{
		System.out.print("Inside add of child");
	}
	public void mul()
	{
		System.out.println("In mul of child");
	}

	public static void main(String[] args) {
		
	AbstractclassDemo a = new Child();
	a.sub();
	a.add();
	//a.mul();
	
	Child c = new Child();
	c.add();
	c.sub();
	c.mul();
	
	}

}

