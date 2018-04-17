package com.encapsulation;

public class Encapsulation 
{
private int weight;

public void getWeight()
{
	System.out.println(weight);
}
public void setWeight(int w)
{
	if(w<0)
		System.out.println("weight should be greater than zero");
	else
	weight = w;
}
public static void main(String args[])throws Exception
{
	Encapsulation aa = new Encapsulation();
	aa.setWeight(100);
	aa.getWeight();
}
}
