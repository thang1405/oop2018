//package week3;
//import org.junit.Test;
//import static org.junit.Assert.*;
//public class Week3Test {
//
//    // TODO: Viết 5 testcase cho phương thức max()
//    @Test
//    public void testmax(){
//        assertEquals(9, Week3.max(6, 9));
//        assertEquals(1, Week3.max(1, 0));
//        assertEquals(2, Week3.max(2, 1));
//        assertEquals(3, Week3.max(1, 3));
//        assertEquals(4, Week3.max(1, 4));
//    }
//    // TODO: Viết 5 testcase cho phương thức minOfArray()
//    @Test
//    public void testminOfArray(){
//        int[] a= {1,2,3,4,5};
//        assertEquals(1, Week3.minOfArray(a));
//        int[] b= {7,2,3,4,5};
//        assertEquals(2, Week3.minOfArray(b));
//        int[] c= {5,67,53,34,454};
//        assertEquals(5, Week3.minOfArray(c));
//        int[] d= {545,45,98,5,9,35,1};
//        assertEquals(1, Week3.minOfArray(d));
//        int[] e= {5,8,2,9,3,4,9,4,8,2};
//        assertEquals(2, Week3.minOfArray(e));
//    }
//    // TODO: Viết 5 testcase cho phương thức calculateBMI()
//    @Test
//    public	void testcalculateBMI(){
//        assertEquals("Binh thuong", Week3.calculateBMI(60, 1.7));
//        assertEquals("Thieu can", Week3.calculateBMI(50, 1.75));
//        assertEquals("Binh thuong", Week3.calculateBMI(60, 1.65));
//        assertEquals("Beo phi", Week3.calculateBMI(80, 1.5));
//        assertEquals("Thua can", Week3.calculateBMI(70, 1.7));
//    }
//}