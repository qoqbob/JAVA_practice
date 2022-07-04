package chapter06;

class data {int x;}

public class ex6_6 {
	public static void main(String[] args) {	
		Data d = new Data();
		d.x =10;
		System.out.println("main() :x "+d.x);
		
		chage(d.x);
		System.out.println("After change(d.x)");
		
	}
static void change(int x) {
	x = 1000;
	System.out.println("change():x="+x);
}

}
