package JavaZaawansowana.Zadania.Exercise1;

import java.util.*;

public class Exercise1 {
    /*
    Stwórz listę Integerów. Wykonaj zadania:
    - dodaj do listy 5 elementów ze scannera
    - dodaj do listy 5 elementów losowych
    - wypisz elementy
     Sprawdź działanie aplikacji
     */
    public static void main(String[] args) {
        List<Integer> tenNumbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Wpisz 5 liczb całkowitych: ");
       // elementy dodane ze skanera
        Random r = new Random();
        for (int i = 0; i < 5; i++) {// 5 liczb ze skanera
            int number = input.nextInt();
            tenNumbers.add(number);

        //elementy losowe
        }
        for (int i = 0; i < 5; i++) { // 5 liczb całkowitych w przedziale 0 - 500
            int number = r.nextInt(500);
            tenNumbers.add(number);
        }
        // wydruk listy
        System.out.println("List tenNumbers = "+tenNumbers);
        // sortowanie listy
        Collections.sort(tenNumbers);
        // wydruk listy posortowanej
        System.out.println("List tenNumbers (posortowana chronologicznie) = "+tenNumbers);

    }
}
