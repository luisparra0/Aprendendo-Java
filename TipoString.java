package fundamentos;

public class TipoString {

    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));

        String s = "Boa tarde"; // String é imutável, não consigo mudar seu valor inicial, MAS posso substituílo
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Luís";
        var sobrenome = "Parra";
        var idade = 23;
        var salario = 12345.987;

        System.out
                .println("Nome: " + nome + "\nSobrenome: " 
                + sobrenome + "\nIdade: " + idade +
                "\nSalário: " + salario + "\n\n");

                System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.",
                nome, sobrenome, idade,salario);
                //outro modo
                
                String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f. \n",
                nome, sobrenome, idade,salario);
                System.out.println(frase);

                System.out.println("Frase qualquer".contains("qual"));
                System.out.println("Frase qualquer".indexOf("qual"));
                System.out.println("Frase qualquer".substring(6));
                System.out.println("Frase qualquer".substring(6, 10));
                
    }
}
