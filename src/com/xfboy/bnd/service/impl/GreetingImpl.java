package com.xfboy.bnd.service.impl;

import org.osgi.service.component.annotations.Component;

import com.xfboy.bnd.service.Greeting;


@Component
public class GreetingImpl implements Greeting {

	@Override
	public String sayHello(String name) {
		return "hello,"+name;
	}

}
