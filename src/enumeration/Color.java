package enumeration;

public enum Color {
    RED("vermelho"), GREEN("Verde"), BLUE("Azul");
    private String valor;
    Color(String valor){
        this.valor=valor;
    }

    public String getValor() {
        return valor;
    }
}
