package ArrayBalok;

public class Segitiga14 {
    public int alas;
    public int tinggi;

    public Segitiga14(int a, int t) {
        alas = a;
        tinggi = t;
    }
    
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
    
    public int hitungKeliling() {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return (int)(alas + tinggi + sisiMiring);
    }

    public static void main(String[] args) {
        Segitiga14[] sgArray = new Segitiga14[4];
        sgArray[0] = new Segitiga14(5, 8);
        sgArray[1] = new Segitiga14(7, 10);
        sgArray[2] = new Segitiga14(4, 7);
        sgArray[3] = new Segitiga14(8, 12);

        for (int i = 0; i < 4; i++) {
            System.out.println("Segitiga ke-" + i + " Luas: " + sgArray[i].hitungLuas() + ", Keliling: " + sgArray[i].hitungKeliling());
        }
        
    }
}
