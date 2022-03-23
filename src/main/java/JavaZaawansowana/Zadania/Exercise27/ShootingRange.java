package JavaZaawansowana.Zadania.Exercise27;


import java.util.ArrayList;
import java.util.List;

public class ShootingRange {
    private final int maxSize;// zadelarowanie niezmiennej wartości magazynku
    private int targetOfShooting;
    private List<String> bullets = new ArrayList<>(); // zadeklarowanie listy zawierającej naboje

    public ShootingRange(int maxSize) {
        this.maxSize = maxSize;
    }// zdefiniowanie konstruktora

    // metoda ładowanie pocisku do magazynku
    public void loadBullet(String bullet) {
        if (bullets.size() < maxSize) {

            bullets.add(bullet);// jeżeli jest miejsce -> ładujemu kulę -> metoda add.
        }
    }

    // metoda sprawdzająca zawartość magazynku
    public boolean isLoaded() {
        return bullets.size() > 0;
    }// false jesli jest pusty = 0

    protected void magazineCondition() {
        if (isLoaded()) {
            System.out.println("Magazynek jest załadowany. Masz " + bullets.size() + " naboi");
        }


    }

    private void targetOfShooting(int targetOfShooting) {
        System.out.print(" Trafiłeś w |" + targetOfShooting + "|");
        if (targetOfShooting == 0) {
            System.out.println(". Niestety to jest pudło. Popraw się\n");

        } else if (targetOfShooting < 6 & targetOfShooting > 0) {
            System.out.println(". Następny strzał będzie lepszy. Nie martw się.\n ");
        } else if (targetOfShooting < 10) {
            System.out.println(". Dobry strzał. Tak trzymaj\n ");
        } else {
            System.out.println(" !!! BRAWO !!!\n");
        }

    }

    // metoda imitująca strzelanie - pozbawianie się kul z magazynka
    public void shoot(int targetOfShooting) {
        // wykorzystanie metody sprawdzającej zawartość magazynku
        if (!isLoaded()) {
            magazineCondition();

        } else {// jeśli nie jest pusty to mozemy strzelać -> pozbawiając się kul z magazynka (listy bullets metodą remove)
            String shot = bullets.remove(bullets.size() - 1);
            System.out.print("Twój " + shot + " strzał.");
            // gdy wystrzelimy wszystkie kule magazynek znów będzie pusty
            if (!isLoaded()) {
                magazineCondition();
            }
            targetOfShooting(targetOfShooting);

        }
    }
}