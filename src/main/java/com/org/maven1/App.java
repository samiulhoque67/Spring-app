package com.org.maven1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Pet.class);
    	Animal animal=context.getBean("cat",Animal.class);
    	System.out.println(animal.legs());
    	animal.enemy();
    	context.close();
        
    }
}
