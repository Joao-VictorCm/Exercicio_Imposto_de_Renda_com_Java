package Exercico_Java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]

		double rendaAnualSalario = 48000.00;
		double prestacaoServico = 0.00;
		double rendaAnualGanhoCapital = 800.00;
		double gastoMedicos = 400.00;
		double gastoEducacionais = 5400.00;

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

		System.out.println(impostoSalario);
		System.out.println(impostoPrestacaoServico);
		System.out.println(impostoGanhoCapital);

		System.out.println(impostoBruto);
		System.out.println(totalDedutiveis);
		System.out.println(maximoDedutiveis);

	}
}
