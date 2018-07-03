import java.util.Scanner;

public class calculateTaxStage2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("***Stage 2  Income Tac Calculator***");
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
		System.out.printf("Enter tax agent name: ");
		input.nextLine();
		String agent = input.nextLine();
		
		deduction = -deduction;
		double totalIncome = (income + interest +  capital);
		double taxableIncome = (income + interest +  capital)+deduction;
		double taxPayable = 0;
		double tax1 = 3572;
		double tax2 = 17547;
		double tax3 = 54547;
		double medicare = 0;
		if(taxableIncome > 180000){
			double tax4 = (taxableIncome -180000)*47/100;
			taxPayable = tax3 + tax4;
			medicare = taxableIncome * .02;
			System.out.println("/t***Final Tax Statement***");
			System.out.printf("Name:                   %s\n",name);
			System.out.printf("Tax File Number:        %s\n",tfn);
			System.out.printf("Financial year:         %s\n\n",fYear);
			System.out.printf("Assessable Income:      $%10.2f\n",totalIncome);
			System.out.printf("Minus Deductions:       $%10.2f\n",deduction);
			System.out.printf("Taxable Income:         $%10.2f\n\n",taxableIncome);
			System.out.printf("Tax Payable:            $%10.2f\n",taxPayable);
			System.out.printf("Medicare Levy:          $%10.2f\n\n",medicare);
			System.out.printf("Tax Agent:   %s\n",agent);		
						
		}
		else if(taxableIncome > 80000 && taxableIncome < 180001){
			tax3 = (taxableIncome -80000)*37/100;
			taxPayable = tax2 + tax3;
			medicare = taxableIncome * .02;
			System.out.println("\t***Final Tax Statement***");
			System.out.printf("Name:                   %s\n",name);
			System.out.printf("Tax File Number:        %s\n",tfn);
			System.out.printf("Financial year:         %s\n\n",fYear);
			System.out.printf("Assessable Income:      $%10.2f\n",totalIncome);
			System.out.printf("Minus Deductions:       $%10.2f\n",deduction);
			System.out.printf("Taxable Income:         $%10.2f\n\n",taxableIncome);
			System.out.printf("Tax Payable:            $%10.2f\n",taxPayable);
			System.out.printf("Medicare Levy:          $%10.2f\n\n",medicare);
			System.out.printf("Tax Agent:   %s\n",agent);		
		}
		
		else if(taxableIncome > 37000 && taxableIncome < 80001){
			tax2 = (taxableIncome -37000)*32.5/100;
			taxPayable = tax2 + tax1;
			medicare = taxableIncome * .02;
			System.out.println("\t***Final Tax Statement***");
			System.out.printf("Name:                   %s\n",name);
			System.out.printf("Tax File Number:        %s\n",tfn);
			System.out.printf("Financial year:         %s\n\n",fYear);
			System.out.printf("Assessable Income:      $%10.2f\n",totalIncome);
			System.out.printf("Minus Deductions:       $%10.2f\n",deduction);
			System.out.printf("Taxable Income:         $%10.2f\n\n",taxableIncome);
			System.out.printf("Tax Payable:            $%10.2f\n",taxPayable);
			System.out.printf("Medicare Levy:          $%10.2f\n\n",medicare);
			System.out.printf("Tax Agent:   %s\n",agent);			
		}
		
		else if(taxableIncome > 18200 && taxableIncome < 37001){
			tax1 = (taxableIncome -18200)*19/100;
			taxPayable = tax1;
			
			if(taxableIncome > 26121){
				medicare = taxableIncome * .02;
			}else
			{
				medicare = (taxableIncome - 20896)*.1;
			}
			
			System.out.println("\t***Final Tax Statement***");
			System.out.printf("Name:                   %s\n",name);
			System.out.printf("Tax File Number:        %s\n",tfn);
			System.out.printf("Financial year:         %s\n\n",fYear);
			System.out.printf("Assessable Income:      $%10.2f\n",totalIncome);
			System.out.printf("Minus Deductions:       $%10.2f\n",deduction);
			System.out.printf("Taxable Income:         $%10.2f\n\n",taxableIncome);
			System.out.printf("Tax Payable:            $%10.2f\n",taxPayable);
			System.out.printf("Medicare Levy:          $%10.2f\n\n",medicare);
			System.out.printf("Tax Agent:   %s\n",agent);		
		}
		
		else{
			System.out.println("\t***Final Tax Statement***");
			System.out.printf("Name:                   %s\n",name);
			System.out.printf("Tax File Number:        %s\n",tfn);
			System.out.printf("Financial year:         %s\n\n",fYear);
			System.out.printf("Assessable Income:      $%10.2f\n",totalIncome);
			System.out.printf("Minus Deductions:       $%10.2f\n",deduction);
			System.out.printf("Taxable Income:         $%10.2f\n\n",taxableIncome);
			System.out.printf("Tax Payable:            $%10.2f\n",taxPayable);
			System.out.printf("Medicare Levy:          $%10.2f\n\n",medicare);
			System.out.printf("Tax Agent:   %s\n",agent);		
		}
		
	}

}
