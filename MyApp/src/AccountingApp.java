
public class AccountingApp {
// 부가가치세를 책정하는 class.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valueOfSupply = Double.parseDouble(args[0]); // Double.parseDouble = string type -> double type
		double expenseRate = 0.3;
		double vateRate = 0.1;
		double vat = valueOfSupply * vateRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;

		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+vat);
		System.out.println("Total : "+total);
		System.out.println("Expense : "+expense);
		System.out.println("Income : "+income);
		System.out.println("Dividend 1 : "+dividend1);
		System.out.println("Dividend 2 : "+dividend2);
		System.out.println("Dividend 3 : "+dividend3);

	}

}