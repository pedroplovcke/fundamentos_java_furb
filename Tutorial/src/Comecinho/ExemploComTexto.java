public class ExemploComTexto {
    public static void main(String[] args) {
        String nome = "Pedro";
        // System.out.println(nome.toLowerCase()); para dxar tudo minusculo
        System.out.println(nome.toUpperCase());
        /*
         * um exemplo que usamos de texto também é o charAt, que foi usado em:
         * "ExercicoBasico".
         */
        boolean res = nome.equalsIgnoreCase(nome);
        System.out.println(res);
    }

}
