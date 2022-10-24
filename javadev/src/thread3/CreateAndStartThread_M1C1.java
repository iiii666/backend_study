package thread3;

public class CreateAndStartThread_M1C1 {
	public static void main(String[] args) {
		
		Thread m1c1 = new SMIFileThread();//업캐슽
		m1c1.start();
		
		
		Thread m2c1 = new VideoFileThread();
		m2c1.start();
		System.out.println("종료");
	}
	
}

class VideoFileThread extends Thread{
	@Override
	public void run() {
		int[] intArray = {1,2,3,4,5};
		
		
		
		for(int i =0;i<intArray.length; i++) {
			System.out.print("(비디오프레임)" + intArray[i]);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
class SMIFileThread extends Thread{
	@Override
	public void run() {
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		for(int i =0;i<strArray.length; i++) {
			System.out.println("(자막 번호)" + strArray[i]);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}