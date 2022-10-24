package generic;

public class generic {
	public static void main(String[] args) {
		Goods1 goods1 = new Goods1();
		goods1.setApple(new Apple());
		Apple apple = goods1.getApple();
		
		Goods2 goods2 = new Goods2();
		goods2.setPencil(new Pencil());
		Pencil pencil = goods2.getPencil();
	}
}
class Apple{
	
}

class Goods1{
	private Apple apple = null;
	public Apple getApple() {
		return apple;
	}
	public void setApple(Apple apple) {
		this.apple = apple;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "apple";
	}
}

class Pencil{
	
}
class Goods2{
	private Pencil pencil = null;
	public Pencil getPencil() {
		return pencil;
	}
	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "pencil";
				
	}
}