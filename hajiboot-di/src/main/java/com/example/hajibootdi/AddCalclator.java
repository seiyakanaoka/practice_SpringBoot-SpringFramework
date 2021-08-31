package com.example.hajibootdi;

import org.springframework.stereotype.Component;

@Component
public class AddCalclator implements Calclator {
	@Override
	public int calc(int a, int b) {
		return a + b;
	}
}
