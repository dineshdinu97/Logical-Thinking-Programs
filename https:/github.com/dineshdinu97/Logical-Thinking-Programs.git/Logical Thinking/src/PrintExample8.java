
public class PrintExample8 {

	public static void main(String[] args) 
	{
		//Print 1 4 9 16 25 36 49
		PrintExample8 obj=new PrintExample8();
		obj.display();

	}
	public void display()
	{
		int no=1;
		while(no<=7)
		{
			System.out.println((int)Math.pow(no, 2));
			no++;
		}
	}

}
