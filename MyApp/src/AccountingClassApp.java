class Accounting{
	public double valueOfSupply = 10000.0; 
	public double vatRate = 0.1;
	public double expenseRate = 0.3;	
	public void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());
		System.out.println("Expense : " + getExpense());
		System.out.println("Income : " + getIncome());
		System.out.println("Dividend 1 : " + getDiviend1());
		System.out.println("Dividend 2 : " + getDiviend2());
		System.out.println("Dividend 3 : " + getDiviend3());
	}
	
	public double getDiviend1() {
		return getIncome() * 0.5;
	}
	public double getDiviend2() {
		return getIncome() * 0.3;
	}
	public double getDiviend3() {
		return getIncome() * 0.2;
	}
	
	public double getIncome() {
		return valueOfSupply - getExpense();
	}
	
	public static double getExpense() {
		return valueOfSupply * expenseRate;
	}
	
	public static double getTotal() {
		return valueOfSupply + getVAT();
	} 
	
	public static double getVAT() {
		return valueOfSupply * vatRate;
	}
}
public class AccountingClassApp {
// 부가가치세를 책정하는 class.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Accounting.valueOfSupply = 10000.0; 
//		Accounting.vatRate = 0.1;
//		Accounting.expenseRate = 0.3;
//		Accounting.print();
//		//...
//		Accounting.valueOfSupply = 90000.0; 
//		Accounting.vatRate = 0.3;
//		Accounting.expenseRate = 0.9;
//		Accounting.print();
//		//...
//		Accounting.valueOfSupply = 80000.0; 
//		Accounting.vatRate = 0.8;
//		Accounting.expenseRate = 0.5;
//		Accounting.print();
//		//...
//		anotherVariable = ...;
//		anotherMethod = ...;
		
		// instance 
        Accounting a1 = new Accounting();
        a1.valueOfSupply = 10000.0;
        a1.vatRate = 0.1;
        a1.expenseRate = 0.3;
        a1.print();
         
        Accounting a2 = new Accounting();
        a2.valueOfSupply = 20000.0;
        a2.vatRate = 0.05;
        a2.expenseRate = 0.2;
        a2.print();
        
        a1.print();
	}
	

}
