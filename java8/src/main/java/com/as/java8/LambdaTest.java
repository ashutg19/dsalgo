package com.as.java8;

public class LambdaTest {

	public static void main(String[] args) {

		MyLambda lambda = () -> System.out.println("asdasdas");
		lambda.foo();

		LambdaTest lambdaTest = new LambdaTest();
		lambdaTest.foo(lambda);
		lambdaTest.foo(() -> System.out.println("asdasdas"));

		MyStringLambda myStringLambda = s -> s.length();
		lambdaTest.foo(myStringLambda);
		lambdaTest.foo(s -> s.length());
	}

	public void foo(MyLambda lambda) {
		lambda.foo();
	}

	public void foo(MyStringLambda lambda) {
		lambda.foo("wqweqweqwe");
	}

}

interface MyLambda {
	public void foo();

}

interface MyStringLambda {
	public int foo(String s);

}
