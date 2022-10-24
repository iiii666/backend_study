package thread6;

public class CreateAndStartThread_M1C1 {
	public static void main(String[] args) {
		
		int[] intArray = {1,2,3,4,5};
		
		Thread m1c1 = new Thread(new SMIFileThread());//업캐슽
		m1c1.start();
		
		for(int i =0;i<intArray.length; i++) {
			System.out.print("(비디오프레임)" + intArray[i]);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
		
	}
	
}
class SMIFileThread implements Runnable {
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