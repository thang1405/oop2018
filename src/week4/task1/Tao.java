package week4.task1;

public class Tao extends HoaQua {
    private
    String loaiTao;
    int soDauMoi;
    int giaTao;


    public Tao(){
        loaiTao="tao nho";
        setMausac("do");
        setHinhdang("tron");
        soDauMoi=0;
        giaTao=20000;
    }
    public Tao(String loaitao,int sodaumoi,int giatao ){
        loaiTao=loaitao;
        soDauMoi=sodaumoi;
        giaTao=giatao;
    }
    public int getSodaumoi() {
        return soDauMoi;
    }

    public String getLoaiTao() {
        return loaiTao;
    }

    public void setSodaumoi(int sodaumoi) {
        this.soDauMoi = sodaumoi;
    }

    public void setLoaiTao(String loaiTao) {
        this.loaiTao = loaiTao;
    }

    public int getGiaTao() {
        return giaTao;
    }

    public void setGiaTao(int giaTao) {
        this.giaTao = giaTao;
    }

    @Override
    public void printf() {

        System.out.println("Loai Tao : "+loaiTao+"\nSo dau moi : "+soDauMoi+"\nGia ban :"+giaTao);
        super.printf();
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Tao tao= new Tao("to",8,40000);
        tao.printf();
        Tao tao1 = new Tao();
        tao1.printf();
    }
}
