package enum3;

import java.util.Calendar;
public class WeekTest {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		
		Week[] weeks = Week.values();
		
		Week today = weeks[calendar.get(Calendar.DAY_OF_WEEK) -1];
//	    switch(calendar.get(Calendar.DAY_OF_WEEK)) {
//	    case 1: today = Week.SUNDAY; break;
//	    case 2: today = Week.MONDAY; break;
//	    case 3: today = Week.TUESDAY; break;
//	    case 4: today = Week.WEDNESDAY; break;
//	    case 5: today = Week.THURSDAY; break;
//	    case 6: today = Week.FRIDAY; break;
//	    case 7: today = Week.SATURDAY; break;
//	    
//	    }
	    System.out.println(today);
		
		
		for(Week w : Week.values()) {
			System.out.println(w.ordinal());
		}
		switch(today) {
		case SUNDAY:
		case SATURDAY:
			System.out.println("자기주도학습 주말");
			break;
		default:
			System.out.println("평일은 지루한 수업청강합니다");
			break;
			
		}
	}
}
