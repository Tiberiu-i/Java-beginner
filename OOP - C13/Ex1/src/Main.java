public class Main {
    public static void main(String[] args) {
        Apartament ap1 = new Apartament();

        ap1.initializeState(2,"alb", true, 100_000, "parchet",
                false, 6);
        ap1.schimbaCuloare("bleu");
        ap1.modificaPret(110000);
        ap1.adaugaLocParcare();

        Apartament ap2 = new Apartament();

        ap2.initializeState(2,"alb", true, 120_000, "gresie",
                false, 1);
        ap1.schimbaCuloare("bej");
        ap1.modificaPret(130000);
        ap1.adaugaLocParcare();

        ap1.printObjectState();
        ap2.printObjectState();

        Monitor m1 = new Monitor();

        m1.initializeState(27, 144, "2K", "IPS", 2000,
                "negru", 2019);
        m1.modificaPret(2500);

        Monitor m2 = new Monitor();
        m2.initializeState(23, 144, "FullHD", "IPS", 1000,
                "negru", 2022);
        m2.modificaPret(800);

        m1.printObjectState();
        m2.printObjectState();
    }
}
