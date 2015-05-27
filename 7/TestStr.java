public class TestStr    {
    /** main method */
    public static void main(String[] args)  {

        Str testSample = new Str();

        testSample.setString("world");
        System.out.println(testSample.getString());
        System.out.println(testSample.indexAt('z'));
        System.out.println(testSample.lastIndexAt('l'));
        System.out.println(testSample.convertStringToArray("hey there!!"));

    }
}
