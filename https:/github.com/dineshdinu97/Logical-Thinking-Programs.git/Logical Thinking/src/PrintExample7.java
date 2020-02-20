
public class PrintExample7 {
//Part8
	public static void main(String[] args) {
		// Print 1 8 27 64
		PrintExample7 obj=new PrintExample7();
		obj.display();
	}
	public void display()
	{
		int no=1;
		while(no<=4)
		{
			System.out.println(no*no*no);
			no++;
		}
	}

}
