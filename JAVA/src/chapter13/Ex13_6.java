package chapter13;

class Thread1 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.println("-");
			for (int x = 0; x < 10000000; x++);
				
			}
		}
	}
class Thread2 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.println("|");
			for (int x = 0; x < 1000000000; x++);
			
		}
	}
	
}
	
	
	


public class Ex13_6 {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.setPriority(5);
		t2.setPriority(7);
		
		
		System.out.println("priority of t1(-) :"+t1.getPriority());
		System.out.println("priority of t2(|) :"+t2.getPriority());
		t1.start();
		t2.start();
		
	}

}
