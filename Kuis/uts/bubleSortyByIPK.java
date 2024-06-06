package Kuis.uts;

public class bubleSortyByIPK {
    public void bubleSortyByIPK()
{
    int n = datarMahasiswa.lenght;

    for(int i = 0; i < n - 1; i==){
        for (int j = 0 ; j< n - i -1;j++){
            if (daftarMahasiswa[j].ipk> daftarMahasiswa[j+1].ipk){
                Mahasiswa temp = daftarMahasiswa[j];
                daftarMahasiswa[j]= daftarMahasiwa[j+1];
                daftarMahasiswa[j+1]= temp;
            } {
                
            }
        }
    }
}}
