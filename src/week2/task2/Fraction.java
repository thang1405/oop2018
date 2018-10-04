package week2.task2;
import week2.task1.Task1;

public class Fraction {

    // TODO: khai báo các thuộc tính
    int tu;
    int mau;
    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.tu = numerator;
        this.mau = denominator;
    }
    public void ToiGian(){
        if(this.tu!=0&&this.mau!=0){
            int i = Task1.gcd(this.tu,this.mau);
            this.tu=this.tu/i;
            this.mau=this.mau/i;
        }
    }
    public Fraction add(Fraction other) {

        Fraction Pso = new Fraction(0,0);
        Pso.tu=this.tu*other.mau+this.mau*other.tu;
        Pso.mau=this.mau*other.mau;
        Pso.ToiGian();
        return Pso;
    }

    public Fraction subtract(Fraction other) {

        Fraction Pso = new Fraction(this.tu*other.mau-this.mau*other.tu,this.mau*other.mau);
        Pso.ToiGian();
        return Pso;
    }

    public Fraction multiply(Fraction other) {

        Fraction Pso = new Fraction(this.tu*other.tu,this.mau*other.mau);
        Pso.ToiGian();
        return Pso;
    }

    public Fraction divide(Fraction other) {

        Fraction Pso = new Fraction(this.tu*other.mau,this.mau*other.tu);
        Pso.ToiGian();
        return Pso;
    }
    public boolean equals(Object obj){
        Fraction Pso = new Fraction(0,0);
        Pso = this.subtract((Fraction)obj);
        if(Pso.tu==0) return true;
        else return false;
    }
}