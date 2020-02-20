
public class PrintExaple10 {

	public static void main(String[] args) {
		//print 1 2 4 7 11 16
		PrintExaple10 obj=new PrintExaple10();
		obj.display();

	}
	public void display()
	{
		int no=1;int count=0;
		while(no<=11)
		{
			no=no+count;
			System.out.println(no);
			count++;
		}
	}

}
