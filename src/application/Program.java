package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.CompanyTaxPayer;
import entities.IndividualTaxPayer;
import entities.TaxPayers;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayers> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpend = sc.nextDouble();
				list.add(new IndividualTaxPayer(name, anualIncome, healthExpend));
			} else {
				System.out.print("Number of employees: ");
				int numOfEmployees = sc.nextInt();
				list.add(new CompanyTaxPayer(name, anualIncome, numOfEmployees));
			}
		}

		System.out.println();
		System.out.println("TAXES PAID:");
		double totalTaxes = 0;
		for (TaxPayers tp : list) {
			System.out.printf("%s: $ %.2f%n", tp.getName(), tp.taxValue());
			totalTaxes += tp.taxValue();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);
		sc.close();
	}

}
