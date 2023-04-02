public class Mhs {
    String nim;
    String nama;
    float ipk;
    public Mhs(String nim, String nama, float ipk){
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public float getIpk() {
        return ipk;
    }
    public void setIpk(float ipk) {
        this.ipk = ipk;
    }
    public void printInfo(){
        System.out.println("Nim \t: " + getNim() + "\nNama \t: " + getNama() + "\nIpk \t: " + getIpk() );
    }
}
