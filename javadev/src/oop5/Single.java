package oop5;

public class Single {// singleton design pattern
	private static Single single = null; // 나 자신을 참조 , 공유하는 변수
	// single 에 접근 할 getter 생성

	private Single() {

	}

	public static Single getInstance() {

		if (single == null) {
			single = new Single();
		}

		return single;

	}
	/*
	 * Singleton
	   1. constructor 를 private 로 
	 * 2. 자신의 클래스를 참조하는 변수를 static으로 선언
	 * 3. getInstance()메소드를 생성
	 * 4. getInstance() 에서 최초 1번만 인스턴스 생성
	 * 
	 */
}
