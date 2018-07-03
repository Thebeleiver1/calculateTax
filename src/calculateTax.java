import java.util.Scanner;

public class calculateTax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("***Stage 1  Income Tac Calculator***");
		System.out.printf("Enter Name: ");
		String name = input.nextLine();
		System.out.printf("Enter Tax File Number (TFN): ");
		String tfn = input.nextLine();
		System.out.printf("Financial Year: ");
		String fYear = input.nextLine();
		System.out.printf("Enter assessable income for period 2015-2016: ");
		double income = input.nextDouble();
		System.out.printf("Enter bank interest accrued: ");
		double interest = input.nextDouble();
		System.out.printf("Enter capital gains for period 2015-2016: ");
		double capital = input.nextDouble();
		System.out.printf("Enter claimable deduction(s) for period 2015-2016: ");
		double deduction = input.nextDouble();
		deduction = -deduction;
		double totalIncome = (income + interest +  capital);
		double taxableIncome = (income + interest +  capital)+deduction;
		double taxPayable = (taxableIncome * .10);
		
		
		
		
		System.out.println("***Final Tax Statement***");
		System.out.printf("Name:                   %s\n",name);
		System.out.printf("Tax File Number:        %s\n",tfn);
		System.out.printf("Financial year:         %s\n\n",fYear);
		System.out.printf("Assessable Income:      $%10.2f\n",totalIncome);
		System.out.printf("Minus Deductions:       $%10.2f\n",deduction);
		System.out.printf("Taxable Income:         $%10.2f\n",taxableIncome);
		System.out.printf("Tax Payable:            $%10.2f\n",taxPayable);
		
		
	}

}
