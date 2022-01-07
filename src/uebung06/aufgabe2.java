package uebung06;

/*public class aufgabe2 {
    public static void main(String[] args) {
        int i = StdIn.readInt();
        StdIn.readLine();
        char[] arrayOfChar = new char[i];
        int j;
        for (j = 0; j < i; j++)
            arrayOfChar[j] = StdIn.readChar();
        StdIn.readLine();
        j = 0;
        int k = 0;
        int m = 0;
        int n = 0;
        for (byte b = 0; b < 2; b++) {
            int i1 = 0;
            int i2 = 0;
            if (b == 1) {
                int i3 = k - j;
                int i4 = n - m;
                if (i3 != i4)
                    if (i3 > i4) {
                        n += (i3 - i4) / 2;
                        m -= (i3 - i4) / 2;
                    } else {
                        k += (i4 - i3) / 2;
                        j -= (i4 - i3) / 2;
                    }
                StdDraw.setXscale(j, k);
                StdDraw.setYscale(m, n);
            }
            byte b1 = 1;
            byte b2 = 0;
            for (byte b3 = 0; b3 < i; b3++) {
                switch (arrayOfChar[b3]) {
                    case 'F':
                        if (b == 1)
                            StdDraw.line(i1, i2, (i1 + b1), (i2 + b2));
                        i1 += b1;
                        i2 += b2;
                        if (b == 0) {
                            if (i1 > k)
                                k = i1;
                            if (i2 > n)
                                n = i2;
                            if (i1 < j)
                                j = i1;
                            if (i2 < m)
                                m = i2;
                        }
                        break;
                    case 'L':
                        if (b1 == 0) {
                            b1 = -b2;
                            b2 = 0;
                            break;
                        }
                        b2 = b1;
                        b1 = 0;
                        break;
                    case 'R':
                        if (b1 == 0) {
                            b1 = b2;
                            b2 = 0;
                            break;
                        }
                        b2 = -b1;
                        b1 = 0;
                        break;
                    default:
                        System.out.println("ERROR: wrong character \"" + arrayOfChar[b3] + "\"");
                        return;
                }
            }
        }
    }
}
*/