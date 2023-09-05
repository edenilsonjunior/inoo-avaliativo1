public class USMoney {
    private int dollar;
    private int cent;

    public USMoney(int dollar, int cent){

        this.dollar = dollar;

        if ((cent <= 99) && (cent > 0)) {
            this.cent = cent; 
        } 
        else if(cent > 0 && cent >= 100){
            this.dollar += cent / 100; 
            this.cent = cent % 100; 
        }
        else{
            this.cent = 0;
        }
    }

    public int getDollar() {
        return dollar;
    }

    public int getCent() {
        return cent;
    }

    public USMoney plus(USMoney obj) {
    
        int new_dollar = this.dollar + obj.dollar;
        int new_cent = this.cent + obj.cent;

        return new USMoney(new_dollar, new_cent);
    }
}
