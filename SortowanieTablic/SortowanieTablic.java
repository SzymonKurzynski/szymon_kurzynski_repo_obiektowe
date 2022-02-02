import java.util.Arrays;
import java.util.Random;

public class SortowanieTablic {
   public static void main(String[] args){
       
        final int ILOSC_ELEMENTOW = 100000;
        Random r = new Random();  // do losowania liczb
        long millisActualTime = 0, executionTime = 0;
        for(int k=0;k<10;k++){
        int[] tabBubble = new int[ILOSC_ELEMENTOW];  // moja tablica
        // wypełnianie losowymi elementami mojej tablicy
        for(int i=0;i<ILOSC_ELEMENTOW;i++){
           tabBubble[i] = r.nextInt(1000000)+1;  // losowe liczby od 1 do 1000000
       }
       int[] tabQuick = Arrays.copyOf(tabBubble, tabBubble.lenght);
       millisActualTime = System.currentTimeMillis();
       Arrays.sort(tabQuick);  // sortowanie Quicksort wbudowane w JAVE
       executionTime = System.currentTimeMillis() - millisActualTime;
       System.out.println("Sortowanie Quicksort czas wykonania : "+ executionTime);

        //SORTOWANIE BĄBELKOWE
        for (int i = 0; i<tab.length; i++){
            for (int j = 1; j< tab.length; j++){
                if (tab[j] < tab[j - 1]); {
                    int wieksza = tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = wieksza;
 
                    }

                }

            } 
            long executionTime = System.currentTimeMillis() - millisActualTime;
            System.out.println("Sortowanie bąbelkowe czas wykonania: "+executionTime);
   
        }
    }
}