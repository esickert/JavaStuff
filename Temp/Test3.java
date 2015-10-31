public class Test3 {
    public static void main(String[] args) {
        
        int N = 3;
        String str = "Mississippi";
        String newStr = "";
        
        TestMe a = new TestMe(str);
        a.printMe(str);
        a.printMeToo();
        a.print3rd(str,N);
    }
}
        
