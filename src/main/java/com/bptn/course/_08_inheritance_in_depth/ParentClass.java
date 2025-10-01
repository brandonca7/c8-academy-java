package com.bptn.course._08_inheritance_in_depth;

public class ParentClass {
	
	private String data;
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public ParentClass() {
		this.data = "test";
	}
	
	protected void sayHello() {
		System.out.println("Hello from the parent!");
	}
	
}
