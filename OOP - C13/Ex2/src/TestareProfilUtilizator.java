import java.util.Scanner;

public class TestareProfilUtilizator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProfilUtilizator profilUtilizator = new ProfilUtilizator();

        profilUtilizator.initializeazaProfil(scanner);
        profilUtilizator.afisareStareInterna();
        System.out.println();

        String newEmail = scanner.nextLine();
        profilUtilizator.actualizareEmail(newEmail);

        String newPhone = scanner.nextLine();
        profilUtilizator.actualizareNumarTelefon(newPhone);

        int year = scanner.nextInt();
        profilUtilizator.afisareVarsta(year);
        System.out.println();

        profilUtilizator.afisareStareInterna();
    }
}
