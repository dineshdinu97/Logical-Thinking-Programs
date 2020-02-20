
public class PrintExample6 {

	public static void main(String[] args) {
		// print 1 11 121
		//11'th table
		
		PrintExample6 obj=new PrintExample6();
		obj.display();

	}
	public void display()
	{
		int i=0;
		while(i<=2)
		{
			System.out.println((int) Math.pow(11, i));
			i++;
		}
	}

}
