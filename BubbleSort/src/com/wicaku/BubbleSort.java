package com.wicaku;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan jumlah data : ");
        String sn = a.nextLine();
        int n = Integer.parseInt(sn);

        int[] dataku = new int[n];
        String masukan;

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan data  yang ke-" + (i + 1) + ": ");
            masukan = a.nextLine();
            dataku[i] = Integer.parseInt(masukan);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(dataku[i]);

        }
        boolean lebihkecil;
        int cangkirlain;

        //Arrays.sort(dataku);
        
        // awal bubble sort
        for (int out = n - 1; out > 1; out--) {
            for (int in = 0; in < out; in++) {
                lebihkecil = (dataku[in] > dataku[in + 1]);

                if (lebihkecil) {
                    cangkirlain = dataku[in];
                    dataku[in] = dataku[in + 1];
                    dataku[in + 1] = cangkirlain;
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(dataku[i] + " ");
            }
            System.out.println();
        }
        // akhir bubble sort

        for (int i = 0; i < n; i++) {
            System.out.println(dataku[i]);

        }
    }
}
