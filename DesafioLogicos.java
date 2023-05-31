package fundamentos;

public class DesafioLogicos {
    
    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)
        // Caso consiga os dois trabalhos compro uma TV de 50" e toma sorvete
        // Se conseguir um dos dois trabalhos compro uma TV de 32" e toma sorvete
        // Se nenhum der certo não compra a TV nem toma sorvete


        boolean trabalho01 = true;
        boolean trabalho02 = false;

        boolean comprouTV50 = trabalho01 && trabalho02;
        boolean comprouTV32 = trabalho01 ^ trabalho02;
        boolean comprouSorvete = trabalho01 || trabalho02;

        // Operador Unário!

        boolean maisSaudavel = !comprouSorvete;


        System.out.println("Comprou TV50\" ?" + comprouTV50);
        System.out.println("Comprou TV32\" ?" + comprouTV32);
        System.out.println("Comprou TV32\" Sorvete ?" + comprouSorvete);
        System.out.println("Mais saudável? " + maisSaudavel);
        
    }
}
