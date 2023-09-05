import java.util.Random;

public class Dado {

    private Random generator = new Random();
    private int dado_um;
    private int dado_dois;

    public Dado(){
        dado_um = aleatorio();
        dado_dois = aleatorio();
    }

    public int aleatorio(){
        int resultado = (generator.nextInt(6) + 1);
        System.out.println("Dado: " + resultado);
        return resultado;
    }


    public int soma_dados(){
        return dado_um + dado_dois;
    }

}
