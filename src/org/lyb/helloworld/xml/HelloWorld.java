package org.lyb.helloworld.xml;

public class HelloWorld {
	private String name;
	public void setName(String name){
		this.name=name;
	}
	public void getHello(){
		System.out.println("hello "+this.name);
	}
}
