package Test;

public class Sqrt {
    double x, n, A;
    public Sqrt(double A,double n){
        this.A = A;
        this.n = n;
        this.x = 2;
        geron();
    }
    public void geron(){
        while (pow(this.x,this.n) != this.A && this.n > 0){
            this.x = (1/this.n)*((this.n - 1)*this.x + (this.A/pow(this.x,this.n - 1)));
            System.out.println(this.x);
            this.n--;
        }
    }
    public double pow(double x, double n){
        for (;n > 0; n--) x*=x;
        return x;
    }
}
