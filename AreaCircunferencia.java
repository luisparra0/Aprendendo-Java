package fundamentos;

public class AreaCircunferencia {
    
    public static void main(String[] args) {
        double raio = 3.4;
        final double PI = 3.14;


        double area = (PI* raio * raio);
        System.out.println("Área 01 = " + area + " m²") ;


        raio = 10;
        double area2 = (PI * Math.pow(raio,2));
        System.out.println("Área 02 = " + area2 + " m²");
        
        
    }
}
