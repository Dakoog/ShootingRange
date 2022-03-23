package JavaZaawansowana.Zadania.Exercise27;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ilość naboi w magazynku (6, 8, 10)");
        int maxSize = input.nextInt();
        Random targetOfShooting = new Random();

        ShootingRange gun = new ShootingRange(maxSize);
        gun.magazineCondition();

        if (maxSize == 10) {
            gun.loadBullet("Dziesiąty");
            gun.loadBullet("Dziewiąty");
            gun.loadBullet("Ósmy");
            gun.loadBullet("Siódmy");
            gun.loadBullet("Szósty ");
            gun.loadBullet("Piąty");
            gun.loadBullet("Czwarty");
            gun.loadBullet("Trzeci");
            gun.loadBullet("Drugi");
            gun.loadBullet("Pierwszy ");
        }

        if (maxSize == 8) {
            gun.loadBullet("Ósmy");
            gun.loadBullet("Siódmy");
            gun.loadBullet("Szósty ");
            gun.loadBullet("Piąty");
            gun.loadBullet("Czwarty");
            gun.loadBullet("Trzeci");
            gun.loadBullet("Drugi");
            gun.loadBullet("Pierwszy ");
        }

        if (maxSize == 6) {
            gun.loadBullet("Szósty ");
            gun.loadBullet("Piąty");
            gun.loadBullet("Czwarty");
            gun.loadBullet("Trzeci");
            gun.loadBullet("Drugi");
            gun.loadBullet("Pierwszy ");
        }
        gun.magazineCondition();
        for (int i = 0; i < maxSize; i++) {

            gun.shoot(targetOfShooting.nextInt(11));
        }

        //System.out.println("Czy pistolet zaladowany: " + gun.isLoaded());


    }
}


