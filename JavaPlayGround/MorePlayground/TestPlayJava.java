public class TestPlayJava   {

    public static void main(String[] args)  {

        String tmp = "This is the end, my friend";
        
        PlayJava me = new PlayJava("My only friend the end");
        me.printString();
        System.out.println(me.Reverse(me.get()));
        me.put(tmp);
        System.out.println(me.Reverse(me.get()));
//        System.out.println(me.Reverse(me.get()));
        me.printString();
        for(int i = 0; i <= 2; i++)	{
			System.out.println();
			for(int j = 0; j <= 2; j++)	{
				System.out.print(me.myArray[i][j]);
			}
		}
		System.out.println();
	}
}
