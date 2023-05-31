package fundamentos;

// pega 3 salários de uma pessoa usando String e calcular a média. O java tem que aceitar tanto "," , como "." para definir as casas decimais
import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu salário 01: ");
        String salario01 = entrada.next().replace(",", ".");

        System.out.print("Digite seu salário 02: ");
        String salario02 = entrada.next().replace(",", ".");

        System.out.print("Digite seu salário 03: ");
        String salario03 = entrada.next().replace(",", ".");

        double valor01 = Double.parseDouble(salario01);
        double valor02 = Double.parseDouble(salario02);
        double valor03 = Double.parseDouble(salario03);

        double media = (valor01 + valor02 + valor03) / 3;

        System.out.printf("A média do seu salário é: %.2f", media);

        entrada.close();
    }

}
