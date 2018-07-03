import java.util.Scanner;

public class calculateTaxStage3 {

	public static void main(String[] args) {
		// accept input from keyboard
		Scanner input = new Scanner(System.in);
		System.out.println("***Stage 3  Income Tac Calculator***\n");
		System.out.printf("Enter Name: ");
		String name = input.nextLine();
		System.out.printf("Enter Tax File Number (TFN): ");
		String tfn = input.nextLine();
		System.out.printf("Financial Year: ");
		String fYear = input.nextLine();
		double income = 0;
		double interest = 0;
		double capital = 0;
		double deduction = 0;
		String selection;
		//Ask user to choose from menu
		do{
			System.out.printf("----------\n");
			System.out.printf("*** Taxation Data Entry System***\n\n");
			System.out.printf("A - Add assessable income\n");
			System.out.printf("B - Add interest accrued from bank account\n");
			System.out.printf("C - Add capital gain realised from asset sale\n");
			System.out.printf("D - Add claimable deduction\n");
			System.out.printf("X - Exit and compile Final Tax Statement\n\n");
			System.out.printf("Enter your selection:");
			selection = input.nextLine();	
			//Force user to choose right option
			while(!(selection.equalsIgnoreCase("A")||selection.equalsIgnoreCase("B")||selection.equalsIgnoreCase("C")
			   ||selection.equalsIgnoreCase("D")||selection.equalsIgnoreCase("X"))){
				System.out.printf("Please choose proper value from list: ");
				selection = input.nextLine();
			}
			//choose which option to enabled
			
			switch(selection){
				case "A":
				case "a":
					System.out.printf("Enter assessable income for period 2015-2016: ");
					double income1 = input.nextDouble();
					income = income + income1;
					break;
					
				case "B":
				case "b":
					System.out.printf("Enter bank interest accrued: ");
					double interest1 = input.nextDouble();
					interest = interest1 + interest;
					break;
					
				case "C":
				case "c":
					System.out.printf("Enter capital gains for period 2015-2016: ");
					double capital1 = input.nextDouble();
					capital = capital + capital1;
					break;
					
				case "d":
				case "D":
					System.out.printf("Enter claimable deduction(s) for period 2015-2016: ");
					double deduction1 = input.nextDouble();
					deduction += deduction1; 
					break;
				//display when user closing the application
				case "X":
				case "x":
					System.out.printf("Taxation Data entry complete. \n\n");
					System.out.printf("Enter tax agent name: ");
					String agent = input.nextLine();
					
					deduction = -deduction;
					double totalIncome = (income + interest +  capital);
					double taxableIncome = (income + interest +  capital)+deduction;
					double taxPayable = 0;
					double tax1 = 3572;
					double tax2 = 17547;
					double tax3 = 54547;
					double medicare = 0;
					// calculating various stage of tax
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
					// output the result afeter calculataion
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
						// output the result afeter calculataion
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
					//income less than 18200
				else{
						System.out.println("\t***Final Tax Statement***\n");
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
					break;
								
			}
			input.nextLine();
		
					
		// repeat the process if user choose a,b,c or d			
		}while(selection.equalsIgnoreCase("A")||selection.equalsIgnoreCase("B")
				||selection.equalsIgnoreCase("C")||selection.equalsIgnoreCase("D"));
						
	}

}
