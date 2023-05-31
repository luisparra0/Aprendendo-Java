package fundamentos;

public class Inferencia {
    
    public static void main(String[] args) {
        
        double a = 4.5;
        System.out.println(a);

        var b = 4.5; 
        // Quando não é colocado o tipo, o Java 'infere' qual o tipo
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "Outro texto";
        System.out.println(c);

        double d; // variável foi declarada
        d = 123.65;// variável foi inicializada
        System.out.println(d); //  usada!
    }
}
