public class Triangulo {
    
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(int lado1, int lado2, int lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    private boolean ehTriangulo(){
        if (lado1 < (lado2 + lado3) && lado2 < (lado1+lado3) && lado3 < (lado1+lado2) ) {
            return true;
        } else {
            return false;
        }
    }

    public String tipoTriangulo(){

        if (ehTriangulo()) {
            if(lado1 == lado2 && lado2 == lado3){
                return "Equilatero!";
            }
            else if((lado1 != lado2) && (lado2 != lado3) && (lado1 != lado3)){
                return "Escaleno!";
            }
            else{
                return "Isosceles!";
            }
        }else {
        return  "Nao eh triangulo.";
        }
    }
}