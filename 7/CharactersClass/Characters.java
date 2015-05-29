public class Characters {

    private char ch;

    Characters()    {
        this('a');
    }

    Characters(char ch) {
        this.ch = ch;
    }

    public void setChar(char ch)  {
        this.ch = ch;
    }

    public char getChar()    {
        return ch;
    }

    public static int[] countLetters(String s)  {
        int[] counts = new int[26];  //26 letters in the alphabet
        
        for(int i = 0; i < s.length(); i++) {   
            if (Character.isLetter(s.charAt(i)))
                counts[s.charAt(i) - 'a']++;
        }
        return counts;
    }

}
