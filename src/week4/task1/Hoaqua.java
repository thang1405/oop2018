package week4.task1;

class HoaQua{
    private
    String hinhdang;
    String mausac;

    public  HoaQua(){
        hinhdang="Tron";
        mausac="Xanh";
    }//khoi tao ko có tham só
    public  HoaQua(String hd,String ms){
        hinhdang=hd;
        mausac=ms;
    }//khoi tao có tham số

    public String getHinhdang() {
        return hinhdang;
    }// xuat ra hinh dang

    public void setHinhdang(String hinhdang) {
        this.hinhdang = hinhdang;
    }//nhâp hinh dang

    public String getMausac() {
        return mausac;
    }//xuất màu sắc

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }//nhap mau sắc

    public void printf(){
        System.out.println("Qua co mau : "+mausac +"   \nQua co hinh : "+ hinhdang);
    }

    public static void main(String[] args) {
        HoaQua tao = new HoaQua("meo","den");
//        tao.setHinhdang("tron");
//        tao.setMausac("do");
        tao.printf();
    }
}
