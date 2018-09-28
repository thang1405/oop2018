package week2.task3;

public class Task3 {
    public static void main(String[] args) {

    }
}
    class anime{
        private
        String Name ,Tacgia;
        int Bxh;
        long Luotxem;

        public String getname() {
            return Name;
        }
        public void setname(String Name) {
            Name= Name;
        }
        public String getTacgia() {
            return Tacgia;
        }
        public void setTacgia(String tacgia) {
            Tacgia = tacgia;
        }
        public int getBxh() {
            return Bxh;
        }
        public void setBxh(int bxh) {
            Bxh = bxh;
        }
        public long getLuotxem() {
            return Luotxem;
        }
        public void setLuotxem(long lx) {
            Luotxem=lx;
        }
        public anime(String nam, String tac, int bx, long lx){
            this.Name=nam;
            this.Tacgia=tac;
            this.Bxh=bx;
            this.Luotxem=lx;
        }
        public void animeview(){
            if(this.Luotxem<2500000) System.out.println("anime noi tieng");
            else System.out.println("anime chua noi tieng");
        }
        public void animerank(){
            if(this.Bxh<15) System.out.println("anime dang hot");
            else System.out.println("anime binh thuong");
        }
        public void like(){
            this.Luotxem += 3;
        }
        public void dislike(){
            this.Luotxem -= 3;
        }
    }
    class IT{
    String Trinhdo;
    String Name;
    String Luong;

    public String getTrinhdo() {
        return Trinhdo;
    }
    public void setTrinhdo(String trinh) {
        Trinhdo= trinh;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLuong() {
        return Luong;
    }

    public void setLuong(String luong) {
        Luong = luong;
    }

    public IT(String name,String trinh,String luong ){
        Name = name;
        Trinhdo = trinh;
        Luong = Luong(Trinhdo);
    }
    public String Luong(String trinhdo){
        if(Trinhdo== "dh") return "Luong cao";
        else return "Luong thap";
    }
    public void HoTen(){
        System.out.println(this.Name);
    }
    public void mucluong(){
        System.out.println(this.Luong);
    }
}

class Student{

    int Sotin;
    String Ten;
    String Diem;

    public int getTin() {
        return Sotin;
    }

    public void setTin(int tin) {
        Sotin=tin;
    }

    public String getName() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getDiem() {
        return Diem;
    }

    public void setDiem(String diem) {
        Diem = diem;
    }

    public Student(int tin ,String ten,String diem){
        Sotin=tin;
        Ten=ten;
        Diem=diem;
    }
    public long Tien(){
        return Sotin*230000;
    }
    public void Diem(){
        if(
                Diem.equals("A")) System.out.println("diem cao");
        else if(Diem.equals("B")) System.out.println("diem kha");
        else if(Diem.equals("C")) System.out.println("diem tb");
        else System.out.println("diem thap");
    }
    public void ten(){
        System.out.println(Ten);
    }
}
