package Exercico_Java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		Scanner sc = new Scanner(System.in);

		System.out.println("Bem vindo ao IRFácil");
		System.out.println("Digite sua renda anual com sálario:");
		double rendaAnualSalario;
		rendaAnualSalario = sc.nextDouble();
		System.out.println("Sua renda anual com prestação de serviço:");
		double prestacaoServico;
		prestacaoServico = sc.nextDouble();
		System.out.println("Sua renda anual com ganho de capital:");
		double rendaAnualGanhoCapital;
		rendaAnualGanhoCapital = sc.nextDouble();
		System.out.println("Suas despesas com medicos:");
		double gastoMedicos;
		gastoMedicos = sc.nextDouble();
		System.out.println("Suas despesas escolares:");
		double gastoEducacionais;
		gastoEducacionais = sc.nextDouble();

		double impostoSalario = 00.00;

		if (rendaAnualSalario < 36000) {

			impostoSalario = 0.00;
		} else if (rendaAnualSalario > 36000 && rendaAnualSalario < 60000) {

			impostoSalario = rendaAnualSalario * 0.10;
		} else if (rendaAnualSalario > 60000) {

			impostoSalario = rendaAnualSalario * 0.20;
		}

		double impostoPrestacaoServico = (prestacaoServico > 00.00) ? prestacaoServico * 0.15 : 00.00;
		double impostoGanhoCapital = (rendaAnualGanhoCapital > 00.00) ? rendaAnualGanhoCapital * 0.20 : 00.00;

		double totalDedutiveis = gastoMedicos + gastoEducacionais;
		double maximoDedutiveis = 0.00;
		double impostoBruto = impostoSalario + impostoPrestacaoServico + impostoGanhoCapital;

		if (totalDedutiveis > impostoBruto * 0.30) {
			maximoDedutiveis = impostoBruto * 0.30;
		} else if (totalDedutiveis < impostoBruto * 0.30) {
			maximoDedutiveis = impostoBruto - maximoDedutiveis;
		}
		
		double impostoDevido = impostoBruto - maximoDedutiveis;

		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA.\n");
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.println("Imposto sobre o salário: " +impostoSalario);
		System.out.println("Imposto sobre serviçõs: " +impostoPrestacaoServico);
		System.out.println("Imposto sobre ganho de capital: " +impostoGanhoCapital+"\n");
		System.out.println("DEDUÇÕES:");
		System.out.println("Máximo dedutível: "+maximoDedutiveis);
		System.out.println("Gastos dedutíveis: "+totalDedutiveis+"\n");
		System.out.println("RESUMO:");
		System.out.println("Imposto bruto total: "+impostoBruto);
		System.out.println("Abatimento: " +maximoDedutiveis);
		System.out.println("Imposto devido: "+impostoDevido);
		
		sc.close();

	}
}
