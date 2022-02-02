import java.util.Random;
final int ILOSC_ELEMENTOW = 1000000;
public class SortowanieTablic {
   public static void main(String[] args){
       
        Random r = new Random();
        int [] tab = new int[ILOSC_ELEMENTOW];


        for(int i=0;i<ILOSC_ELEMENTOW;i++){
           tab[i] = r.nextInt(1000000)+1;
       }
        System.out.println("Przed sortowaniem");
        long millisActualTime - System.currentTimeMillis();
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