package Учить_31._Глава_3_4_5;
public class Array {
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
    void main1(){
        int[][] q = new int[4][];
        q[0]= new int[4];
        q[1] = new int[4];
        q[2]=new int[4];
        q[3]=new int[4];
        int e,r,t=0;
        for (e=0;e< q.length;e++){
            for (r=0;r<q[e].length;r++){
                q[e][r]=t;
                t++;
            }
        }
        for (e=0;e< q.length;e++){
            for (r=0;r<q[e].length;r++){
                System.out.print(q[e][r] + " ");
            }
            System.out.println();
        }
    }
}
