public class Fraction {
    private int numenator;
    private int denominator;

    Fraction(int numenator, int denominator) {
        this.numenator = numenator;
        this.denominator = denominator;

    }

    public int getNumenator() {
        return numenator;
    }

    public int getDenominator() {
        return denominator;
    }


    public void printfraction() {
        System.out.println(this.numenator + "/" + this.denominator);

    }
    //N3 shekveca, shekreba da gamravleba
    public void shekveca(int a){
        if(this.numenator%a == 0 && this.denominator%a==0){
            System.out.println(this.numenator/a + "/" + this.denominator/a);

        }else{
            System.out.println("mocemuli wiladi ar ikveceba " + a+"-ze");
        }

    }
    public void shekreba(int a, int b){
        if(b == this.denominator){
            System.out.println(this.numenator+a + "/" + b);

        }else{
            int c = this.numenator*b;
            int d = a*this.denominator;
            int e = b*this.denominator;
            System.out.println(c+d + "/" + e);
        }

    }
    public void gamravleba(int a, int b){
        System.out.println(this.numenator*a + "/" + this.denominator*b);
        }


}
