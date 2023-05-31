package fundamentos;

public class NotacaoPonto {

    public static void main(String[] args) {

        String s = "Bom dia X"; // String não é tipo primitivo
        s = s.toUpperCase();

        System.out.println(s);

        s = s.replace("X", "Senhora");
        System.out.println(s);

        s = s.concat("!!!");
        System.out.println(s);

        System.out.println("Luís".toUpperCase());

        String y = "bom dia X".replace("X", "Luís").toLowerCase().concat("!!!");
        System.out.println(y);


        //Tipos primitivos não tem o operador "."
    }
}
