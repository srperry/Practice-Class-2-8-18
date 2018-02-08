import java.util.Scanner;
public class CardTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Cards C1T1=new Cards(1,"Spades");
		Cards C2T1=new Cards(3,"Spades");
		Cards C3T1=new Cards(7,"Spades");
			Cards C1T2=new Cards(1,"Clover");
			Cards C2T2=new Cards(3,"Clover");
			Cards C3T2=new Cards(7,"Clover");
				Cards C1T3=new Cards(1,"Diamonds");
				Cards C2T3=new Cards(3,"Diamonds");
				Cards C3T3=new Cards(7,"Diamonds");

System.out.println("Pick a card from these cards");
	System.out.println(C1T1.Number+C1T1.Suit);
	System.out.println(C2T1.Number + C2T1.Suit);
	System.out.println(C3T1.Number + C3T1.Suit);
	System.out.println(C1T2.Number + C1T2.Suit);
	System.out.println(C2T2.Number + C2T2.Suit);
	System.out.println(C3T2.Number + C3T2.Suit);
	System.out.println(C1T3.Number + C1T3.Suit);
	System.out.println(C2T3.Number + C2T3.Suit);
	System.out.println(C3T3.Number + C3T3.Suit);
System.out.println("What suit do you want?");
		String suit=scanner.nextLine();
System.out.println("What number do you want?");
		int number=scanner.nextInt();
	if(suit.equals("Diamonds")&& number==7){
		System.out.println("You picked the Lucky Card! You Win!");
	}
	else{
		System.out.println("Im sorry, you loose.");
	}
	}

}
