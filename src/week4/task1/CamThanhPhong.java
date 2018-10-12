package week4.task1;

public class CamThanhPhong extends Cam {
    private
    int Chenhlech;// chênh lệch với cam thường
    String Xuatxu="Thanh Phong";
    int soLuong_kg;
    public CamThanhPhong(){
        Chenhlech=0;
        soLuong_kg=0;
    }
    public CamThanhPhong(int chenhlech,int so){
        Chenhlech=chenhlech;
        soLuong_kg=so;
    }

    public int getSoLuong_kg() {
        return soLuong_kg;
    }

    public int getChenhlech() {
        return Chenhlech;
    }

    public void setChenhlech(int chenhlech) {
        Chenhlech = chenhlech;
    }

    public void setSoLuong_kg(int soLuong_kg) {
        this.soLuong_kg = soLuong_kg;
    }

    @Override
    public void printf() {
        System.out.println("loai Cam thanh phong");
        System.out.println("\nChenh lech voi cam thuong : "+Chenhlech+"\nXuat su : "+ Xuatxu+ "\nSo Kg : "+soLuong_kg);
        super.printf();
    }

    public static void main(String[] args) {
        CamThanhPhong camThanhPhong= new CamThanhPhong();
        CamThanhPhong camThanhPhong1= new CamThanhPhong(10000,10);
        camThanhPhong.printf();
        camThanhPhong1.printf();
    }
}
