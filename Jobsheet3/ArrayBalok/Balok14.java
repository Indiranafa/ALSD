package ArrayBalok;

public class Balok14 {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok14(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    
    public int hitungVolume(){
        return panjang * lebar *  tinggi;
    }

    public static void main(String[] args) {
        Balok14[] blArray = new Balok14[3];

        blArray[0] = new Balok14(100, 30, 12);
        blArray[1] = new Balok14(120, 40, 15);
        blArray[2] = new Balok14(210, 50, 25);

        for(int i = 0; i<3; i++){
            System.out.println("Volume balok ke " + i + ": " + blArray[i].hitungVolume());;
        }
    }
}
