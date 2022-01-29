package uebung08;

public class josi2 {
    private static int position;
    public static void main(String[] args) {

        int Number = Integer.parseInt(args[0]);
        int schrittweite = Integer.parseInt(args[1]);

        position = 0;

        int[] permutation = new int[Number];
        for (int i = 0; i < Number; i++) {
            permutation[i] = i + 1;

        }
        int[] josephus = toJosephus(0, schrittweite, permutation, new int[Number]);

        System.out.println("");
        for(int i=0; i<josephus.length; i++){
            System.out.print(josephus[i]+" "); // Ausgabe des Arrays
        }
    }


    public static int[] toJosephus(int counter, int schrittweite, int[] permutation, int[] josephus) {

        if (permutation.length == 0)
            return josephus;

        position = (position + schrittweite - 1) % permutation.length;
        int stelle = permutation[position];
        counter++;

        josephus[stelle - 1] = counter;
        int[] tempArray = new int[permutation.length - 1];
        for (int i = 0; i < tempArray.length; i++) {
            if (i < position) {
                tempArray[i] = permutation[i];
            } else {
                tempArray[i] = permutation[i + 1];
            }

        }
        permutation = tempArray;

        return toJosephus(counter, schrittweite, permutation, josephus);
    }
}
