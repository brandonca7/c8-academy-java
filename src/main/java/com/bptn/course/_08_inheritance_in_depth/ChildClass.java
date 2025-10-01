package com.bptn.course._08_inheritance_in_depth;

public class ChildClass extends ParentClass {

	int number;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public ChildClass() {
		super();
		this.number = 100;
	}
	
	@Override
	protected void sayHello() {
		super.sayHello();
		System.out.println("Hello from the child!"+number+" : "+super.getData());
	}
}
