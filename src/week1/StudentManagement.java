package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    Student[] students = new Student[100];

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        if ( s1.getGroup()== s2.getGroup()) return true;
        return false; // xóa dòng này sau khi cài đặt
    }
    int num(){ // đếm số phần tử của mảng
        int i=0;
        while(students[i]!=null) i++;
        return i;
    }
    void studentsByGroup() {
        //TODO:
    Student a = new Student();
    String cla = students[0].getGroup(); //khởi tạo biến class để nhận tên lớp
        for(int i =0;i<num();i++){
            for(int j =i+1;j<num();j++){
                if(students[i].getGroup().equals(students[j].getGroup())) {
                    a=students[i];
                    students[i]=students[j]; // sắp xếp lại mảng
                    students[j]=a;
            }
        }
    }
		System.out.println(cla); // in tên các class
		 for(int i=0;i<num();i++){
        if(students[i].getGroup().equals(cla)) students[i].getInfo(); // in thông tin
        else {
            cla = students[i].getGroup(); // đặt lại biến class để in lớp khác
            System.out.println(cla);     // lớp tiếp theo
            students[i].getInfo();

        }
    }
}

    void removeStudent(String id) {
        //TODO:
        for(int i=0; i<num(); i++)// chạy mảng
        {
            if(id.equals(students[i].getId()))// so sánh với id trong các mảng
            {
                for(int j=i; j<num(); j++)
                {
                    students[j] = students[j + 1];// xóa khỏi ds
                }
            }
        }
        System.out.println("Danh sach lop sau khi xoa: ");
        for(int i=0;i<num();i++) students[i].getInfo();// in ra ds sau khi xóa
    }

    public static void main(String[] args) {
        // TODO:
        Student stu = new Student();
        stu.setName("tran manh thang");// nhap ten
        stu.setId("17021034");// nhap id
        stu.setGroup("INT22041");// nhap lop
        stu.setEmail("17021034@uet.vnu.edu.vn"); // nhap email
        System.out.println(stu.getName()+ "\n"); // in ten
        stu.getInfo();

        Student st1= new Student();
        Student st2= new Student("tran manh thang 2","17021034","17021034@uet.vnu.edu.vn");
        st1.getInfo();
        System.out.println("\n");
        st2.getInfo();
        System.out.println("\n");
        Student st3 = new Student(stu);
        st3.getInfo();

        Student s1= new Student("tran manh thang 1","17021035","pohajtak@gmail.com");
        Student s2= new Student("tran manh thang 2","17021036","pohajtak@gmail.com");
        Student s3 = new Student();
        s3.setName("tran manh thang 3");
        s3.setId("17021037");
        s3.setGroup("INT22042");
        s3.setEmail("pohajtak@gmail.com");


        StudentManagement a= new StudentManagement();
            if(a.sameGroup(s1,s2)== true )
                System.out.println( "sv1 va sv2 cung lop");
            else System.out.println("sv1 va sv2 khac lop");

            if(a.sameGroup(s1,s3)== true )
            System.out.println( "sv1 va sv3 cung lop");
            else System.out.println("sv1 va sv3 khac lop\n");
            a.students[0]=stu;
            a.students[1]=s1;
            a.students[2]=s2;
            a.students[3]=s3;

            a.studentsByGroup();
            System.out.println("\n");
            a.removeStudent("17021034");


    }
}
