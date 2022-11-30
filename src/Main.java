import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Renda anual com salário: ");
		double rendaSalario = sc.nextDouble();
		System.out.print("Renda anual com prestações de serviço: ");
		double rendaServico = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		double rendaCapital = sc.nextDouble();
		System.out.print("Gastos médicos: ");
		double gastosMedicos = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		double gastosEdu = sc.nextDouble();
		
		double impostoSalario = 0;
		
		double salarioMes = rendaSalario/12;
		
		if(salarioMes >= 3000.0 && salarioMes < 5000.00) {
			
			impostoSalario += rendaSalario * 0.1; 
		
		} else {
			impostoSalario += rendaSalario * 0.2;
		}
		
		double impostoServico = rendaServico * 0.15;
		double impostoCapital = rendaCapital * 0.2;
		
		double impostoBruto = impostoSalario + impostoServico + impostoCapital;
		
		double gastosDedutiveis = gastosMedicos + gastosEdu;
		double maxDedutivel = impostoBruto * 0.3;
		
		double abatimento = 0;
		
		if(gastosDedutiveis < maxDedutivel) {
			abatimento = gastosDedutiveis;	
		}else {
			abatimento = maxDedutivel;
		}
		
		double impostoDevido = impostoBruto - abatimento;
		
		System.out.println();
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA: ");
		System.out.printf("Imposto sobre salário: %.2f%n", impostoSalario);
		System.out.printf("Imposto sobre serviços: %.2f%n", impostoServico);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoCapital);
		System.out.println();
		System.out.println("DEDUÇÕES:");
		System.out.printf("Máximo dedutível: %.2f%n", maxDedutivel);
		System.out.printf("Gastos dedutíveis: %.2f%n", gastosDedutiveis);
		System.out.println();
		System.out.println("RESUMO: ");
		System.out.printf("Imposto bruto total: %.2f%n", impostoBruto);
		System.out.printf("Abatimento: %.2f%n", abatimento);
		System.out.printf("Imposto devido: %.2f%n", impostoDevido);
		
	}

}
