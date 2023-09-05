public class Main {
    public static void main(String[] args) throws Exception {

        USMoney dimdim1 = new USMoney(10, 50);
        USMoney dimdim2 = new USMoney(2, 70);

        USMoney primeiraSoma = dimdim1.plus(dimdim2);
        System.out.printf("Soma do primeiro e segundo valor: %d,%d%n", primeiraSoma.getDollar(), primeiraSoma.getCent());

        USMoney dimdim3 = new USMoney(4, 30);

        USMoney segundaSoma = primeiraSoma.plus(dimdim3);
        System.out.printf("Soma da primeira soma e o terceiro valor: %d,%d%n", segundaSoma.getDollar(), segundaSoma.getCent());

        USMoney dimdim4 = new USMoney(1, 50);

        USMoney terceiraSoma = segundaSoma.plus(dimdim4);
        System.out.printf("Soma da segunda soma e o quarto valor: %d,%d%n", terceiraSoma.getDollar(), terceiraSoma.getCent());

    }
}
