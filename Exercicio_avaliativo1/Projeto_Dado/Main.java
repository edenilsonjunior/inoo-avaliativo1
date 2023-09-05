public class Main {
    
    public static void main(String[] args) throws Exception {
        
        Dado dado;

        for (int i = 0; i < 3; i++) {

            dado = new Dado();
            System.out.println("Soma dos dados: " + dado.soma_dados());
        }
    }
}
