package mishahara;
import java.util.Scanner;
public class Mfanyakazi {
	public static String Fname,higheducation;
	public static int age,kazidaraja;
	Scanner ingizo=new Scanner(System.in);
	
	public Mfanyakazi()		//constructor hii hapa so itaanza kusoma hapa kwanza,special method
	{		
		System.out.println("Ingiza Jina lako");
		Fname=ingizo.nextLine();
		System.out.println("Ingiza elimu yake");
		higheducation=ingizo.nextLine();
		System.out.println("Ingiza umri wako");
		age=ingizo.nextInt();
		System.out.println("Ingiza Namba ya level post yako kama ulivyoomba kazi\n1.Level 1\n2.Level 2"
				+ "\n3.Level 3");
		kazidaraja=ingizo.nextInt();
	}
	public void viewdetail()
	{
		Madaraja viwango=new Madaraja();
		System.out.println("Name : "+Mfanyakazi.Fname);
		System.out.println("Eduaction : "+Mfanyakazi.higheducation);
		System.out.println("Age : "+ Mfanyakazi.age);
		System.out.println("Level : "+Mfanyakazi.kazidaraja);
		if(Mfanyakazi.kazidaraja==1)
		{
		 viwango.daraja1();
		}
		else if(Mfanyakazi.kazidaraja==2)
		{
			viwango.daraja2();
		}
		else if(Mfanyakazi.kazidaraja==3)
		{
			viwango.daraja3();
		}
		else if(Mfanyakazi.kazidaraja>3)
		{
			System.out.println("Hutapokea chochote wa Mwisho MWezi");
		}
		ingizo.close();	//enjoy,it was funny making this.. raha sana,ukishajua unafanya nini hii ni simple		
	}
}