package com.linkedlist.linekedlist;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith (Parameterized.class)
public class MyLinkedListTesting 
{
	int data,expectedResult;
	MyLinkedList list;
	@Before 
	public void initialize()
	{	   
	        // Insert the values
	        list = list.insert(list,56);
	        list = list.insert(list,70);
	        list = list.insert(list,30);
	}
	
	public MyLinkedListTesting(int data,int expectedResult) 
	{
		this.data=data;
		this.expectedResult=expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection input()
	{
		return Arrays.asList(
				new Object[][] {
						{56,1},
						{70,1},
						{30,1},
						{40,0},
						{55,0},
						{69,0}
				});
	}
	@Test
	public void addTest() {
		assertEquals(expectedResult, list.searchNode(data));
	}
}
