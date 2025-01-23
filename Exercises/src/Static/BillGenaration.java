package Static;

class Bill
{
	private static int counter;
	private String billId;
	private String paymentMode;
	
	
	//static block
	static
	{
		counter = 9000;
	}
	
	//constructor
	public Bill(String paymentMode)
	{
		this.paymentMode = paymentMode;
		this.billId = "B"+ ++counter;
	}
	
	
	//getters and setters 
	public String getBillId()
	{
		return this.billId;
	}
	public void setBillId(String billId)
	{
		this.billId = billId;
	}
	public String getPaymentMode()
	{
		return this.paymentMode;
	}
	public void setPaymentMode(String paymentMode)
	{
		this.paymentMode  = paymentMode;
	}
	
	public int getCounter()
	{
		return counter;
	}
}



public class BillGenaration {

	public static void main(String[] args) {
		
		Bill bill1 = new Bill("DebitCard");
		Bill bill2 = new Bill("PayPal");
		Bill bill3 = new Bill("Cash");
		
		Bill[] bills = {bill1, bill2, bill3};
		
		for(Bill bill : bills)
		{
			System.out.println("Bill Details");
			System.out.println("=====================");
			System.out.println("Bill id      : " + bill.getBillId());
			System.out.println("payment mode : " + bill.getPaymentMode());
			System.out.println();
		}
	}
	
	
}







