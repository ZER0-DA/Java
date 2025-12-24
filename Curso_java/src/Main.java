public class Main {
    public static void main(String []args){
        String text = "Hola mundo";

        int largo = text.length();
        System.out.println(largo);

        String texto = text.replace("Hola", "Chao");
        System.out.println(text);

        System.out.println(texto.endsWith("do"));
        System.out.println(texto.startsWith(""));
    }
}