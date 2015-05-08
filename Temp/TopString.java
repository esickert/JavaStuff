class TopString{

    String firstString = "iphone";
    String secondString = "ipad";

    
    TopString() {
    }

    public String getString(){

        if((Math.random() * 100) < 70)
            return firstString;
        else
            return secondString;
    }
}

/*Class TopStringTest{

    @Test
    public static testGetString(){
    //Test various functionalities of above code
    System.out.println(TopString.getString);
    } */

