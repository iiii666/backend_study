package oop3;

public class Account {

	static int money1;//class area 에 할당되고 초기값없으면 0

	int money2;
	
	public Account(int money) {
		money1 += money;
		money2 += money;
	}
}
