//Amal Suleiman, Exercise 2, Jan 24th!
public class Main {
    public static void main(String[] args) {
        int[] highTemp = {45, 29, 10, 22, 41, 28, 33};
        int[] precipitation = {95, 60, 25, 5, 0, 75, 90};
        String[] dayOfWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};


        for (int i = 0; i < highTemp.length; i++) {
            if (highTemp[i] >= 32 && precipitation[i] > 50) {
                System.out.println("We can expect snow on: "+ dayOfWeek[i]);
            }

        }
    }
}