package application;

import entities.Employer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		List<Employer> list = new ArrayList();

		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos funcionários deseja registrar?");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Funcionário #" + (i + 1));

			System.out.println("Digite o ID ");
			int id = sc.nextInt();
			System.out.print("Digite o nome ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Digite o salario ");
			Double salary = sc.nextDouble();

			Employer emp = new Employer(id, name, salary);
			list.add(emp);

		}

		System.out.println("Entre com o ID do funcionário que vai ter encremento de salário");
		int idsalary = sc.nextInt();
		Employer emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

		if (emp == null)
			System.out.println("Id não existe");
		else {
			System.out.println("Entre com a porcentagem");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
			System.out.println(emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null));

		}

		for (Employer e : list) {
			System.out.print(e);
		}

	}
}
