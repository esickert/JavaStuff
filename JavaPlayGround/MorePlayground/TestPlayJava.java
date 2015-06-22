public class TestPlayJava   {

    public static void main(String[] args)  {

        String tmp = "This is the end, my friend";
        
        PlayJava me = new PlayJava("My only friend the end");
        me.printString();
        //me.put(tmp);
        System.out.println(me.Reverse(tmp));
        System.out.println(me.Reverse(me.get()));
//        System.out.println(me.Reverse(me.get()));
        me.printString();
    }
}
