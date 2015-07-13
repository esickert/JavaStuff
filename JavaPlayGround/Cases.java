class Cases {
    public static void main(String[] args)  {

        TestCases tmp = new TestCases(123);
        TestCases tmp2;
        tmp2 = new TestCases();
        System.out.println(tmp2);

        tmp.test[1][3] = 2.7;
        System.out.println(tmp.getNumber());
        System.out.println(tmp.sum(12));
        tmp.setNum(666);
        System.out.println("The new number is " + tmp.getNumber());
        double x = -1.0;
        System.out.println("The second objects number is " + tmp2.getNumber());
        System.out.println("The area of a circle with radius " + x + " is " + tmp2.areaCircle(x));
        System.out.println("First object I am here " + tmp.test[1][3]);
        System.out.println("2nd object " + tmp2.test[1][3]);  //test is a 2 demensional array
        
    }
}
