package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private
    int num, den;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.num = numerator;
        this.den = denominator;
    }

    public void rutgon() { // rut gọn phân số
        int n = (this.num < this.den) ? this.num : this.den;
        for (int i = 1; i < n / 2; i++) {
            if (this.den % i == 0 && this.num % i == 0) {
                this.den /= i;
                this.num /= i;
            }
        }

    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction a = new Fraction(0, 0);
        a.num = this.num * other.den + this.den * other.num;
        a.den = this.den * other.den;
        a.rutgon();
        return a;
    }

    public Fraction subtract(Fraction other) {
        Fraction a = new Fraction(0, 0);
        a.num = this.num * other.den - this.den * other.num;
        a.den = this.den * other.den;
        a.rutgon();
        return a;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction a = new Fraction(0, 0);
        a.num = this.num * other.num;
        a.den = this.den * other.den;
        a.rutgon();
        return a;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction a = new Fraction(0, 0);
        a.num = this.num * other.den;
        a.den = this.den * other.num;
        a.rutgon();
        return a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction other = (Fraction) obj;
            if (this.num * other.den == this.den * other.num)
                return true;
            else return false;
        } else return false;
    }
}

//    public static void main(String[] args) {
//        Fraction f1 = new Fraction(1,2);
//        Fraction f2 = new Fraction(1,3);
//
//
//
//        System.out.println("hai phan so bng nhau: "+ f1.equals(f2));
//    }
//}