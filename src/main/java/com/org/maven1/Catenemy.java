package com.org.maven1;

import org.springframework.stereotype.Component;

@Component
public class Catenemy implements Enemy {

	@Override
	public void catenemy() {
		System.out.println("the enemy of cat is dog");

	}

	@Override
	public void dogenemy() {
		System.out.println("The enemy of dog is fox");

	}

}
