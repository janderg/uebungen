package uebung04;

public class HaseIgel {
    public static void main(String[] args) {
        int startwerte = 0;
        for (int i = 0x0000; i <= 0xFFFF; i += 0x0001) {
            long hase = i, igel = i; //Initialisierung von Hase und Igel
            String hex = Long.toHexString(i);
            hex = hex.toUpperCase();

            for (int j = 0x0000; j <= 0x10000; j += 0x0001) {
                igel = middleSquare(igel); //Igel middelsquare
                hase = middleSquare(hase);
                hase = middleSquare(hase); //Hase middelsquare
                if (hase == 0x0000) break;
                if (igel == hase) {
                    System.out.println("Startwert: 0x" + hex + " = " + i); //Startwert ausgeben
                    startwerte++;
                    break;
                }
            }
        }
        System.out.println("Es gibt " + startwerte + " Startwerte von Folgen mit einem Zyklus > 1");
    }

    private static long middleSquare(long var) {
        var *= var; //var quadrieren
        return var / 0x100 % 0x10000; //var aktualisieren
    }
}
