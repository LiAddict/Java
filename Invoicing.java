
//Elizabeth Grace Jen
//Invoicing
//3/6/18
import java.text.NumberFormat;
public class Invoicing 
{
	private double bookPrice;
	int bookNumber;
	double couponDiscount;
	private double priceTaxed;
	NumberFormat fmt = NumberFormat.getCurrencyInstance();

	public double getBookPrice()
	{
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) 
	{
		this.bookPrice = bookPrice;
	}
	public void computeInvoice(double bookPrice)
	{
		priceTaxed = (bookPrice * .08) + bookPrice;
		priceTaxed = (bookPrice * bookNumber*.08) + (bookPrice * bookNumber) - couponDiscount;
	}
	public void computeInvoice(double bookPrice, int bookNumber)
	{
		priceTaxed = (bookPrice * bookNumber*.08) + (bookPrice * bookNumber);
		priceTaxed = (bookPrice * bookNumber*.08) + (bookPrice * bookNumber) - couponDiscount;
		
	}
	public void computeInvoice(double bookPrice, int bookNumber, double couponDiscount)
	{
		priceTaxed = (bookPrice * bookNumber*.08) + (bookPrice * bookNumber) - couponDiscount;
		
	}
}



