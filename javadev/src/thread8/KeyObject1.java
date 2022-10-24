package thread8;

public class KeyObject1 {
	public static void main(String[] args) {
		MyData mydata = new MyData();
		
		new Thread() {
			public void run() {
				mydata.abc();
			};
		}.start();
		
		new Thread() {
			public void run() {
				mydata.bcd();
			};
		}.start();
		
		new Thread() {
			public void run() {
				mydata.cde();
			};
		}.start();
	}
}


class MyData{
	synchronized void abc() {
		for(int i =0;i<3;i++)
		{
			System.out.println(i +"sec");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
	synchronized void bcd() {
		for(int i =0;i<3;i++)
		{
			System.out.println(i +"번째");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
	 void cde() {
		 synchronized (new Object()) {
			 for(int i =0;i<3;i++)
				{
					System.out.println(i +"순서");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO: handle exception
					}
				}
		}
		 
	}
}

