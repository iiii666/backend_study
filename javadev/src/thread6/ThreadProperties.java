package thread6;

public class ThreadProperties {
	public static void main(String[] args) {
		Thread curThread = Thread.currentThread();
		
		System.out.println("현재 쓰레드 이름  = " + curThread.getName());
		System.out.println("동작하는 스레드 수 = " + curThread.activeCount());
		
		for(int i = 0;i<3;i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		for(int i = 0;i <3;i++) {
			Thread thread = new Thread();
			thread.setName(i + "번째 쓰레드");
			System.out.println(thread.getName());
			thread.start();
		}
		
		for(int i =0;i<3;i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
		}
		System.out.println(Thread.activeCount());
		
		
	}
}
