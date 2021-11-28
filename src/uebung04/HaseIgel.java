package uebung04;

public class HaseIgel {
    public static void main(String[] args) {
        int startwerte = 0;
        for (int i = 0x0000; i <= 0xFFFF; i += 0x0001) {
            long hase = i, igel = i; //aktualisieren von Hase und Igel
            String hex = Long.toHexString(i);
            hex = hex.toUpperCase();

            for (int j = 0x0000; j <= 0x10000; j += 0x0001) {
                igel = middleSquare(igel); //Igel aktualisieren
                hase = middleSquare(hase);
                hase = middleSquare(hase); //Hase aktualisieren
                if (hase == 0x0000) break;
                if (igel == hase) {
                    System.out.println("Startwert in Hexadezimal: 0x" + hex); //Startwert ausgeben
                    startwerte++;
                    break;
                }
            }
        }
        System.out.println("Es gibt " + startwerte + " Startwerte");
    }

    private static long middleSquare(long var) {
        var *= var;
        return var / 0x100 % 0x10000;
    }
}
