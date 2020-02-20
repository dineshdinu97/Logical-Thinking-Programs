
public class Print13579246810 {

	public static void main(String[] args) {
		Print13579246810 obj=new Print13579246810();
		obj.display();

	}
	public void display()
	{
		int no=1;
		while(no<=10)
		{
			System.out.println(no);
			no+=2;
			if(no==11)
			{
				no=2;
			}
		}
	}

}
