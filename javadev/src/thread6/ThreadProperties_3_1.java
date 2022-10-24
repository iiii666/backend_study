package thread6;

public class ThreadProperties_3_1 {
	 public static void main(String[] args) {
		 Thread thread1 = new MyThread2();
		 thread1.setDaemon(false);
		 thread1.setName("thread1");
		 thread1.start();
		 
		 
		 Thread thread2 = new MyThread2();
		 thread2.setDaemon(true);
		 thread2.setName("thread2");
		 thread2.start();
		 
		 try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("main스레드종료");
		
	}
}


class MyThread2 extends Thread{
	@Override
	public void run() {
		System.out.println(getName() + " : " +(isDaemon()? "데몬 쓰레드": "일반 쓰레드"));
		
		for(int i =0; i<6;i++) {
			System.out.println(getName() + ":"+ i+"초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
			}
		}
		
		
	}
}
