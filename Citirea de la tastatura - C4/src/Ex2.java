import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int an = sc.nextInt();
        int luna = sc.nextInt();
        int zi = sc.nextInt();
        sc.nextLine();
        String numarInmatriculare = sc.nextLine();
        double numarKmBord = sc.nextDouble();
        double numarKmAchizitie = sc.nextDouble();
        sc.nextLine();
        String numeSofer = sc.nextLine();
        boolean arePermis = sc.nextBoolean();

        System.out.println("Multumim! Datele dumneavoastra:");
        System.out.println("Data fabricatie: " + zi + " " + luna + " " + an);
        System.out.println("Numar inmatriculare: " + numarInmatriculare);
        System.out.println("Numar km la bord: " + numarKmBord);
        System.out.println("Numar km la achizitie: " + numarKmAchizitie);
        System.out.println("Nume al soferului actual: " + numeSofer);
        System.out.println("Permis: " + arePermis);
        System.out.println("Numar km parcursi: " + (numarKmBord - numarKmAchizitie));
        System.out.println("Vechime aproximativa autovehicul: " + (2022 - an) + " ani");
    }
}
