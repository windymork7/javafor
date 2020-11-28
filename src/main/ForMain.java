package main;

import process.ForProcess;

import java.util.Arrays;
import java.util.Scanner;

public class ForMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        System.out.println("크기를 설정해 주세요");
        int su = scanner.nextInt();
        ForProcess forProcess = new ForProcess(su);


        do {
            System.out.println("1.정사각형");
            System.out.println("2.왼쪽 위치 삼각형");
            System.out.println("3.오른쪽 위치 삼각형");
            System.out.println("4.피라미드");
            System.out.println("5.역피라미드");
            System.out.println("6.마름모");
            System.out.println("7.모래시계");
            System.out.println("0.종료");
            System.out.println("==========================");
            choice = scanner.nextInt();


            switch (choice){
                case 1: forProcess.moon1();
                    break;
                case 2: forProcess.moon2();
                    break;
                case 3: forProcess.moon3();
                    break;
                case 4: forProcess.moon4();
                    break;
                case 5: forProcess.moon5();
                    break;
                case 6: forProcess.moon6();
                    break;
                case 7: forProcess.moon7();
                    break;
            }
        } while (choice!=0);

    }

}
