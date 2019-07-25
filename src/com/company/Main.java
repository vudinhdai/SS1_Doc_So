package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Nhap so can doc:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        /*switch (number) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println(" = two");
                break;
            case 3:
                System.out.println(" = three");
                break;
            case 4:
                System.out.println(" = four");
                break;
            case 5:
                System.out.println(" = five");
                break;
            case 6:
                System.out.println(" = six");
                break;
            case 7:
                System.out.println(" = sven");
                break;
            case 8:
                System.out.println(" = eight");
                break;
            case 9:
                System.out.println(" = nine");
                break;
            case 16:
                System.out.println(" = six" + "teen");
                break;
            case 61:
                System.out.println("six" + "ty _" + "one ");
                break;

            default:
                System.out.println("out of ability");

        }*/
        switch (number) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println(" one, two ,three ,four, five, six, sven, eight, nine ");
                break;
            case 16:
                System.out.println(" = six" + "teen");
                break;
            case 61:
                System.out.println("six" + "ty _" + "one ");
                break;

            default:
                System.out.println("out of ability");

        }
    }
}
