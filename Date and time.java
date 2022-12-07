public class Main {
	public static void main(String[] args) {
		System.out.println("MilliSeconds : "+System.currentTimeMillis());
		System.out.println("Seconds: "+System.currentTimeMillis()/1000);
		System.out.println("Minutes: "+System.currentTimeMillis()/1000/60);
		System.out.println("Hours : "+System.currentTimeMillis()/1000/3600);
		System.out.println("Days : "+System.currentTimeMillis()/1000/3600/24);
		System.out.println("Years : "+System.currentTimeMillis()/1000/3600/24/365);
	}
}