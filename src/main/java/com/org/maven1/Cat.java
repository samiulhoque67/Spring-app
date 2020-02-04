package com.org.maven1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

	@Autowired
	private Enemy catenemy1;
	@Override
	public String legs() {
		return "The cat has four legs";

	}

	@Override
	public String food() {
	return "I5t's main food is milk";

	}
	public void enemy()
	{
		 catenemy1.catenemy();
	}

}
