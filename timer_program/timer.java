public class timer  {
    public static void main(String[] args)  {

        for(int i = 50; i >= 0; i--){
            System.out.print(i);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e) {
                e.printStackTrace();
            } 
        
            System.out.print("\r" + i + "\r");
            try {
                Thread.sleep(500);
            }	catch (InterruptedException e) {
                e.printStackTrace();
            }
        } 

    }
}



