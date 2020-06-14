package com.asuraiv.kotlinjavapractice.function;

public class LambdaFunctions {

	public static void postponeComputation(int delay, Runnable computation) {

		new Thread(computation)
			.start();
	}
}
