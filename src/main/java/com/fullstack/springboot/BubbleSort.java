package com.fullstack.springboot;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements SortAlgorithm{
	
	@Override
	public int[] sort(int[] numbers) {
		System.out.println("bubble sort");
		return numbers;
	}

}
