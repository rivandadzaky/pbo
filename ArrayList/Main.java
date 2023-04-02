import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Main {
    public static void main(String[] args){
        menu Menu = new menu();
        int option = 0;
        Scanner sc = new Scanner(System.in);
        InputData masukkanData = new InputData();
        do {
            Menu.menu();
            option = sc.nextInt();
            switch (option) {
                case 1:
                    masukkanData.InputData();
                    break;
                case 2:
                    masukkanData.printDataMhs();
                    break;
                case 3:
                    masukkanData.cariData();
                    break;
                case 4:
                    masukkanData.hapusDataNIM();
                    break;
                case 5:
                    masukkanData.hapusDataSemua();
                    break;
                default:
                    break;
            }
        } while (option != 6);
        System.out.println("Program Selesai");

    }
}