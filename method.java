class Add
{
	public void Force(int a,int b){
		int c = a+b;
		System.out.println("Addition : "+c);
	}
	public static void main(String [] args)
	{
		Add a = new Add();
		a.Force(7,8);
	}
}