package JavaZaawansowana.V.Exceptions_Wyjątki;

import javax.management.RuntimeMBeanException;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptMain {
    public static void main(String[] args) {

//  1.Blok przechwycenia - "try->catch"(próbuj i złap) -> wyłapywanie wyjątków
//- istnieje szansa, że w danym bloku (try) wystąpi wyłapany (catch) wyjątek (exception), który spowoduje
        try {
//            instrukcje, które potencjalnie mogą wywołać -> zakończyć się wyjątkiem

        } catch (Exception e) { // -> przechwycenie rodzaju wyjątku
//            blok, który wykona się, gdy otrzymamy wyjątek
        }
// Przykład: Wypłata pieniędzy z bankomatu ->
        try {
/*          1. sprawdź stan konta
            2. wypłać pieniądze
            --------------------------- brak wypłaty, np.:zerwane połączenie z bankiem
            3. zaktualizuj stan konta
*/
        } catch (Exception bank) {
//            wyłapany błąd więc należna jest instrukcja by naprawić bład (brak zadeklarowanej wypłaty)
//            pieniądze zostały już wyprowadzone z kąta, ale ich nie otrzymaliśmy więc stan konta powinien
//              być równy stanowi wejścia a nie wyjścia!
        }
//  Przykład 2. Wypisanie innej wartości niż zadeklarowana
//        Scanner input = new Scanner(System.in);
//        System.out.println("Podaj dowolną liczbę rzeczywistą");
//        for (int i = 0; i <3 ; i++) {
//            try{
//                double number = input.nextDouble();
//                System.out.println("Twoja liczba "+ number);
//            } catch (InputMismatchException ime){
//                // napraw bufor -> usuń, to co błędnego wpisał użytkownik
//               String lastEntry = input.next();
//                System.err.println("Wprowadziłeś złe dane! Twój wpis: "+lastEntry+" Powtórz");
//                i--; // cofamy iterator o jeden, czyli wprowadziłeś, złe dane powtórz i naucz się jak wprowadzić dobre dane
//            }

/*
  Rozróżnia się wyjątki niejawne (RuntimeException), jawne (Exception), Error.
    * RuntimeException- wyjątek, który występuje i jest wyjątkiem czasu rzeczywistego uruchomionego-
    wyjątki, które dzieją się w programie, ale my nie jesteśmy na nie przygotowani
    (tzw. głupie błędy, wynikające najczęściej z braku kontroli), np.:
    wyjście poza rozmiar tablicy, wpisanie słowa zamiast liczby itp.*/
        // jest to właśnie RuntimeException- zabezpieczenie przed takim wyjątkiem
//        Scanner input = new Scanner(System.in);
//        System.out.println("Podaj index elementów, który chesz otrzymać");


         /*    int[] array = new int[10];
            System.out.println(array[15]);
             podanie indeksu poza rozmiar tablicy- wyjątek (ArrayIndexOutOfBoundsException)
                                          nie można tego przewidzieć, ale można zapobiec i sprawdzić
                                          jest to wyjątek niejawny, gdyż nie jest wymuszone przechwycenie wyjątku*/
        final int size = 10;
        int[] array = new int[size];

        if (array.length > size) {
            System.out.println(array[15]);}
//         else {
//            System.out.println("Podałeś zły index tablicy. Popraw");
//        }


/*    * Exception- wyjątki, których my jesteśmy pewni, że w ponad 90% przypadków mogą się zdarzyć i powinniśmy go obsłużyć
           np.: wpisałeś źle hasło, popraw je!*/
        int number =-1;
        try {
            checkNumbersIndex(array, number);//tutaj -> dalej już nie ma, gdzie więc teraz go trzeba przechwycić (try -catch)
        } catch (TooLowerNumber tln) {
            tln.printStackTrace();
        } catch (Exception tln){
            System.out.println("Coś poszło nie tak!");
        }
        finally {// wykonuje się zawsze, niezależnie od tego, czy był błąd, czy też nie.
            System.out.println("Zawsze się wykonam");
        }
        System.out.println("Ja też się zawsze wykonam");
        System.out.println("Program się zakończył ");// czyli program będzie mógł się normalnie zakończyć

    }

    private static void checkNumbersIndex(int[] array, int number) throws TooLowerNumber {// rzuć (wyjątek) w górę
        if (number <0){
            throw new TooLowerNumber();// rzuć nowy (throw new)
        }

    }


}



