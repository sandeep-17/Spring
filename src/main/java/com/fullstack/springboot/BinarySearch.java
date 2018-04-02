package com.fullstack.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
	
	@Autowired
	SortAlgorithm sortalgorithm;
	
	public BinarySearch() {
		System.out.println("Constructor called");
	}

	public BinarySearch(SortAlgorithm sortalgorithm) {
		System.out.println("Constructor called with parameters");
		this.sortalgorithm = sortalgorithm;
	}
	
	void binarySearch(int[] numbers, int search) {
		numbers = sortalgorithm.sort(numbers);
		System.out.println("number is present");
	}
}
