package com.example.ex00.dependency.qualifier;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

	@Override
	public int getScreenWidth() {
		return 1920;
	}

}
