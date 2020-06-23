package com.asuraiv.kotlinpractice.function;

import java.util.Arrays;

public class CallKotTest {

	public static void main(String[] args) {

		// Java 코드에서 코틀린 함수 호출
		System.out.println(JoinStringKt.joinToString(Arrays.asList(1, 2, 3), ", ", "(", ")"));
	}
}
