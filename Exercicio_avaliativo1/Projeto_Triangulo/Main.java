import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int lado1, lado2, lado3;
        String tipo;
        Scanner input = new Scanner(System.in);

        Triangulo[] triangulo= new Triangulo[5];

        for (int i = 0; i < triangulo.length; i++) {
            System.out.print("Digite o lado 1: ");
            lado1 = input.nextInt();
            
            System.out.print("Digite o lado 2: ");
            lado2 = input.nextInt();
            
            System.out.print("Digite o lado 3: ");
            lado3 = input.nextInt();
    
            triangulo[i] = new Triangulo(lado1, lado2, lado3);
            tipo = triangulo[i].tipoTriangulo();
            System.out.println(tipo);
        }
        input.close();
    }
}
