import java.util.Scanner;

public class WhileGaji27 {
    
    public static void main(String[] args) {
        Scanner scan27 = new Scanner(System.in);

        int jumlahkaryawan, jumlahJamLembur, gajiLembur = 0, totalGajiLembur = 0 ;
        String jabatan;

        System.out.println("Masukkan jumlah karyawan: ");
        jumlahkaryawan = scan27.nextInt();

        int i = 0;

            while (i < jumlahkaryawan) {
            
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan"); 
            System.out.print ("Masukkan jabatan karyawan ke-" + (i+1) + ": "); 
            jabatan = scan27.next();
            
            
            jumlahJamLembur = scan27.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            }
            else if (jabatan.equalsIgnoreCase("manajer")) { 
                gajiLembur = jumlahJamLembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }       

            totalGajiLembur += gajiLembur;

            System.out.println("Total gaji lembur " + totalGajiLembur);
        }
    }
}
