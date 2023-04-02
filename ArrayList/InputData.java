import java.util.ArrayList;
import java.util.Scanner;

public class InputData {
    ArrayList<Mhs> lArrayList = new ArrayList<Mhs>();
    Scanner sc = new Scanner(System.in);
    public void InputData() {
        String nama,nim;
        float ipk;
        System.out.println("Masukkan Nama \t :");nama = sc.nextLine();
        System.out.println("Masukkan nim \t :");nim = sc.nextLine();
        System.out.println("Masukkan ipk \t:");ipk = sc.nextFloat();
        lArrayList.add(new Mhs(nim, nama, ipk));
    }
    public void printDataMhs(){
        for (int i=0;i<lArrayList.size();i++){
            lArrayList.get(i).printInfo();
        }
    }
    public void hapusDataNIM() {

    }
    public void cariData() {
    }
    public void hapusDataSemua() {
        lArrayList.clear();
    }
}
