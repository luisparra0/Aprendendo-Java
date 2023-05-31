package fundamentos;
//Foi dada uma equação pelo professor. Nela tenho que separar suas partes em variáveis diferentes e depois calcular o resultado final.

public class DesafioAritmeticos {
 
    public static void main(String[] args) {
        
        double parte1 = Math.pow( (6*(3+2)), 2) / (3*2);
        double parte2 = Math.pow(((1-5)*(2-7))/2, 2);
        double parte3 = Math.pow((parte1- parte2) , 3);

        double total = parte3/ Math.pow(10, 3);

        System.out.println("O resultado é: " + total);

    }


}
