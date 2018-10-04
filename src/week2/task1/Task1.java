package week2.task1;

public class Task1 {

            public static int gcd(int a, int b) {
                // TODO: Tính ước chung lớn nhất của 2 số a, b
                if(a==1 || b==1 ) return 1;
                while(a != b ){
                    if(a>b) a = a-b;
                    else b = b-a;
                }
                return a;

            }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        int[] f = new int[n+1];
        f[0]=0;
        f[1]=1;
        for(int i=2;i<=n;i++){
            f[i]= f[i-2]+ f[i-1];
        }
        return f[n];
    }
}
