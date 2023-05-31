package fundamentos;

public class PrimitivoVsObjeto {

    public static void main(String[] args) {

        String s = "texto";
        System.out.println(s); // objeto possui atributos e comportamentos

        String u = new String("texto");
        System.out.println(u);

        // Wrappers são a versão objeto dos tipos primitivos
        int a = 123;
        System.out.println(a);

    }

}
