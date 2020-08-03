package Учить_31._Глава_3_4_5;
public class _Многомерный_массив2 {
    public static void main (String[] args) {
        int[][] w = new int[4][];
        w[0] = new int[3];
        w[1] = new int[8];
        w[2] = new int[9];
        w[3] = new int[6];
        int i, e, k = 0;
        for (i = 0; i < w.length; i++) {
            for (e = 0; e < w[i].length; e++) {
                w[i][e] = k;
                k++;
            }
        }
        for (i = 0; i < w.length; i++) {
            for (e = 0; e < w[i].length; e++) {
                System.out.print(w[i][e] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        Clon clon = new Clon();
        clon.main1();
    }
}
class Clon {
    void main1 () {
        int[][] q = new int[3][];
        q[0] = new int[4];
        q[1] = new int[4];
        q[2] = new int[4];
        int r, t, y = 0;
        for (r = 0; r < q.length; r++) {
            for (t = 0; t < q[r].length; t++) {
                q[r][t] = y;
                y++;
            }
        }
        for (r = 0; r<q.length;r++){
            for (t = 0; t < q[r].length; t++){
                System.out.print(q[r][t] + " ");
            }
            System.out.println();
        }
    }
}
