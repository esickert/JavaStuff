public class LabelsInLoops	{
    public static void main(String args[])	{

    int i, j;

    outer:
	for (i = 1; i < 10; i++)    {
	    inner:
		for (j = 1; j < 10; j++)	{
		    if (i * j > 50)
			break outer;
		    System.out.println(i * j);
		}
	    }	
    }	
}
