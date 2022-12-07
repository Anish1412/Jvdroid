class Main extends Thread {
	public Main(String name){
		super(name);
	}
	public void run(){
		System.out.println("Hello World!!");
	}
}
class Main1 extends Thread {
	public Main1(String name){
		super(name);
	}
	public void run(){
		System.out.println("Hello World1!!\n");
	}
}
class A
{
	public static void main(String[] args) {
		Main m1 = new Main("Anish");
		Main1 m2 = new Main1("Omkar");
		m1.start();
		m2.start();
		System.out.println("The ID of the Main class is "+m1.getId());
		System.out.println("The Name of the Main class is "+m1.getName()+"\n");
		System.out.println("The ID of the Main class is "+m2.getId());
		System.out.println("The Name of the Main class is "+m2.getName());
	}
}