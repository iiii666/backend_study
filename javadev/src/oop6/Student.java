package oop6;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Student extends Human {
    private String stu_id;

    public void goSchool(){
    	System.out.println("등교하기");
    }

}
