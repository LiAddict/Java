//Written by Krista Elizabeth Ghazaleh
//Purchase
//Written on 4/9/18
 import java.text.DecimalFormat;
public class Purchase
{
		private int invoiceNumber;
		private double saleAmount;
		private double salesTax = .05;
		private double totalSalestax;
		DecimalFormat fmt = new DecimalFormat("0.##");
public int getInvoiceNumber() 
	{
			return invoiceNumber;
	}
public void setInvoiceNumber(int invoiceNumber)
	{
	this.invoiceNumber = invoiceNumber;
	}
public double getSaleAmount() 
	{
			return saleAmount;
	}
public void setSaleAmount(double saleAmount) 
	{
			this.saleAmount = saleAmount;
			totalSalestax = this.saleAmount*salesTax;
	}
public double getSalesTax() 
	{
			return salesTax;
	}
public void setSalesTax(double salesTax) 
	{
			this.salesTax = salesTax;
	}
public double getTotalSaletax() 
	{
			return totalSalestax;
	}
public void setTotalSaletax(double totalSaletax) 
	{
			this.totalSalestax = totalSaletax;
	}
		public void displayInfo()
		{
			System.out.println("Invoice number: " + invoiceNumber);
			System.out.println("Amount of sale: $" + saleAmount);
			System.out.println("Tax: $" + fmt.format(totalSalestax));
		}

}

