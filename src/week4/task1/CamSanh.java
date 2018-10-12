package week4.task1;

public class CamSanh extends Cam {
    private
    String Diadiem;
    int Sanluong_tan;
    public CamSanh(){
        Diadiem="Ha noi";
        setVocam("Day");
        Sanluong_tan=0;
    }
    public CamSanh(String diadiem,int sanluong_tan){
        Sanluong_tan=sanluong_tan;
        setVocam("Day");
        setSoNguoimua(10);
        Diadiem=diadiem;
    }

    public int getSanluong_tan() {
        return Sanluong_tan;
    }

    public String getDiadiem() {
        return Diadiem;
    }

    public void setSanluong_tan(int sanluong_tan) {
        Sanluong_tan = sanluong_tan;
    }

    public void setDiadiem(String diadiem) {
        Diadiem = diadiem;
    }

    @Override
    public void printf() {
        System.out.println("Loai cam sanh \n");
        System.out.println("Ban tai : "+ Diadiem+ "\nSan luong(Tan) : "+Sanluong_tan);
        super.printf();

    }

    public static void main(String[] args) {
        CamSanh camSanh= new CamSanh();
        CamSanh camSanh1= new CamSanh("Thanh Hoa",12);
        camSanh.printf();
        camSanh1.printf();
    }
}
