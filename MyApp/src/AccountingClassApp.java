class Accounting{
	public static double valueOfSupply = 10000.0; 
	public static double vatRate = 0.1;
	public static double expenseRate = 0.3;	
	public static void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());
		System.out.println("Expense : " + getExpense());
		System.out.println("Income : " + getIncome());
		System.out.println("Dividend 1 : " + getDiviend1());
		System.out.println("Dividend 2 : " + getDiviend2());
		System.out.println("Dividend 3 : " + getDiviend3());
	}
	
	public static double getDiviend1() {
		return getIncome() * 0.5;
	}
	public static double getDiviend2() {
		return getIncome() * 0.3;
	}
	public static double getDiviend3() {
		return getIncome() * 0.2;
	}
	
	public static double getIncome() {
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
		
		Accounting.valueOfSupply = 10000.0; 
		Accounting.vatRate = 0.1;
		Accounting.expenseRate = 0.3;
		Accounting.print();
		//anotherVariable = ...;
		//anotherMethod = ...;
	}
	

}
