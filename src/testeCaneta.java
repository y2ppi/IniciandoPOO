import java.util.Scanner;

class Caneta{
    String modelo;
    String cor;
    float tamPonta;
    int carga;
    Boolean tampada;

Caneta(String modelo, String cor, float tamPonta, int carga, Boolean tampada){
    this.modelo = modelo;
    this.cor = cor;
    this.tamPonta = tamPonta;
    this.carga = carga;
    this.tampada = tampada;
}
@Override
    public String toString(){
        return "Caneta [Modelo: " + modelo + ", Cor: " + cor + ", Ponta: " + tamPonta + ", Carga: " + carga + ", Está tampada: " + tampada +"]";
    }
}
public class testeCaneta{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Modelo: ");
        String modelo = sc.nextLine();
        System.out.println("Cor: ");
        String cor = sc.nextLine();
        System.out.println("Tamanho da ponta: ");
        float tamPonta = sc.nextFloat();
        System.out.println("Carga(inteiro/porcentagem): ");
        int carga = sc.nextInt();
        System.out.print("A caneta está tampada: ");
        Boolean tampada = sc.nextBoolean();

        Caneta minhaCaneta = new Caneta(modelo, cor, tamPonta, carga, tampada);

        System.out.println(minhaCaneta);

        sc.close();

    }
}