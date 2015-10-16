public class TestMe    {
    
    String stuff;
    
    TestMe()    {
    }
    
    TestMe(String a)    {
        stuff = a;
    }
    
    public void printMe(String a) {
        System.out.println(a);
    }
    
    public void printMeToo()    {
        System.out.println(stuff);
    }
    
    public void print3rd(String a, int N)  {
        String str = a;
        String newStr= "";
        for(int i = 0; i <= str.length(); i = i + N)    {
            newStr = newStr + str.substring(i,i+1);
        }
        System.out.println(newStr);
    }
}

