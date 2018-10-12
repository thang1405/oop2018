package week4.task1;

public class Cam extends HoaQua {
    private
    String Vocam;
    int SoNguoimua;
    int GiaCam;

    public Cam(){
        setMausac("Da Cam");
        Vocam ="Mong";
        SoNguoimua=0;
        GiaCam=20000;
    }
    public Cam(String vo,int so,int gia){
        setMausac("Da cam");
        Vocam=vo;
        SoNguoimua=so;
        GiaCam=gia;
    }

    public void setVocam(String vocam) {
        Vocam = vocam;
    }

    public String getVocam() {
        return Vocam;
    }

    public int getGiaCam() {
        return GiaCam;
    }

    public void setGiaCam(int giaCam) {
        GiaCam = giaCam;
    }

    public int getSoNguoimua() {
        return SoNguoimua;
    }

    public void setSoNguoimua(int soNguoimua) {
        SoNguoimua = soNguoimua;
    }

    @Override
    public void printf() {
        System.out.println("Cam co vo : "+ Vocam+ "\nGia Cam : "+GiaCam+ "\nSo luong mua : "+SoNguoimua);
        super.printf();
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Cam cam= new Cam();
        Cam cam1= new Cam("Day",10,30000);
        cam.printf();
        cam1.printf();
    }
}
