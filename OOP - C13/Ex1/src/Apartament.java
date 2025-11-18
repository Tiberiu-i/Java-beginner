public class Apartament {
    int numarCamere;
    String culoareVopsea;
    boolean esteDecomandat;
    int pret;
    String tipPodea;
    boolean cuLocParcare;
    int aniVechime;

    public void schimbaCuloare(String culoareNoua) {
        culoareVopsea = culoareNoua;
    }

    public void modificaPret(int pretNou) {
        pret = pretNou;
    }

    public void adaugaLocParcare() {
        cuLocParcare = true;
    }

    public void printObjectState() {
        System.out.println("Numarul de camere al apartamentului este de " + numarCamere + " camere");
        System.out.println("Apartamentul este zugravit in culoarea: " + culoareVopsea);
        System.out.println("Apartamentul " + (esteDecomandat ? "este " : "nu este ") + "decomandat");
        System.out.println("Pretul curent este de " + pret + " Euro");
        System.out.println("Tipul de pardoseala este: " + tipPodea);
        System.out.println("Apartamentul " + (cuLocParcare ? "detine " : "nu detine ") + "loc de parcare");
        System.out.println("Vechimea apartamentului este de: " + aniVechime + " ani\n");
    }

    public void initializeState(int numarCamere1, String culoareVopsea1, boolean esteDecomandat1, int pret1,
                                String tipPodea1, boolean cuLocParcare1, int aniVechime1) {
        numarCamere = numarCamere1;
        culoareVopsea = culoareVopsea1;
        esteDecomandat = esteDecomandat1;
        pret = pret1;
        tipPodea = tipPodea1;
        cuLocParcare = cuLocParcare1;
        aniVechime = aniVechime1;
    }
}
