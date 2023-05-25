import enumeration.Color;

public class Main {
    public static void main(String[] args) {
        Color c1= Color.BLUE;

        System.out.println("Acessendo via Nome " +c1.name());
        System.out.println("Acessando o Valor " +c1.getValor());
        for (Color color : Color.values()){
            System.out.println(color.getValor());
            System.out.println(color.name());
        }
        //System.out.println(c1);
    }
}