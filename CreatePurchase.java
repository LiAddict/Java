//Written by Elizabeth Grace Jen
//CreatePurchase
//Written on 4/9/18
import java.util.Scanner;
public class CreatePurchase 
{

	public static void main(String[] args) 
	{
		int inVoice;
		double salesTotal;
		Purchase subject = new Purchase();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter invoice number >>");
		inVoice = input.nextInt();
		if(inVoice < 1000||(inVoice>8000))
		{	
			System.out.println("Invoice number must be between 1000 and 8000");
			System.out.print("Enter invoice number>>");
			 		
			inVoice = input.nextInt();
			
		} 
	
		
		subject.setInvoiceNumber(inVoice);
		do 
		{
		System.out.print("Enter sale amount>> ");
		salesTotal = input.nextDouble();
		}
		while(salesTotal<0);
		subject.setSaleAmount(salesTotal);
			if(salesTotal>0)
			{
				
			
				
			{
			
	while(salesTotal<0)
		subject.setSaleAmount(salesTotal);
	subject.displayInfo();
			
		
			}
		}
			
	}
	
}

