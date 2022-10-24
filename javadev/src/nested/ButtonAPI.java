package nested;

public class ButtonAPI {
	public static void main(String[] args) {
		Button btn1 = new Button();
		
		btn1.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("개발자1 음악재생");
				
			}
		});
		btn1.onClick();
		
		Button btn2 = new Button();
		btn2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("개발자2 네이버접속");
			}
			
		});
		btn2.onClick();
	}
}

class Button{
	
	OnClickListener ocl;
	void setOnClickListener (OnClickListener ocl) {
		this.ocl = ocl;
	}
	interface OnClickListener{
		public abstract void onClick();
	}
	void onClick() {
		ocl.onClick();
	}
}