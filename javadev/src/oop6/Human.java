
package oop6;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Human {
    private String name;
    private int age;


	public void eat(){
		System.out.println("먹기");
    }

    public void sleep(){
    	System.out.println("잠자기");
    }

}
