package oop6;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Worker extends Human {
    private String work_id;

    public void goWork(){
    	System.out.println("출근하기");
    }
    @Override//메소드 재정의
    public void eat() {
    	System.out.println("레스토랑가다");
    }

}
