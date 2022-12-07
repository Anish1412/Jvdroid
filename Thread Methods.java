class Main extends Thread{
	public void run(){
		int i=0;
		while(i<100){
			System.out.println("Hello World!!");
			try{
				Thread.sleep(200);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			i++;
		}
	}
}
class Main1 extends Thread
{
	public void run(){
		System.out.println("\n");
		for(int i=0;i<100;i++){
			System.out.println("Anish Patil");
		}
	}
}
class A
{
	public static void main(String [] args){
		Main m1 = new Main();
		Main1 m2 = new Main1();
		m1.start();
		try{
			m1.join();
		}
		catch(Exception ex){
			System.out.println("Error = "+ex);
		}
		try{
			Thread.sleep(5000);
		}
		catch(Exception ex){
			System.out.println("Error = "+ex);
		}
		m2.start();
	}
}