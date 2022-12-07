class Main<T1,T2>
 {
private int val;
private T1 t1;
private T2 t2;
Main(int val,T1 t1,T2 t2) {
 this.val = val;
 this.t1 = t1;
 this.t2 = t2;
}
public int getVal(){
	return val;
}
public void setVal(int val){
 this.val = val;
}
public T1 getT1(){
	return t1;
}
public void setT1(T1 t1){
 this.t1 = t1;
}
public T2 getT2(){
	return t2;
}
public void setT2(T2 t2){
 this.t2 = t2;
}
 }
 class A
 {
	public static void main(String[] args) {
		Main<String,Integer> m = new Main(45,"Anish Patil",645);
		int a = m.getVal();
		String b = m.getT1();
		int c = m.getT2();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}