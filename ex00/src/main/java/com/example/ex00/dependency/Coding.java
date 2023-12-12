package com.example.ex00.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Coding {
	
	//필드 주입
	//굉장히 편하게 주입할 수 있으나 순환 참조(무한 루프) 시 오류가 발생하지 않기 때문에 StackOverFlow 발생.
	//final을 붙일 수 없기 떼문에 다른 곳에서 변형 가능.
	@Autowired
	private final Computer computer;
}
