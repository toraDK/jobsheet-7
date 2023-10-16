import java.util.Scanner;

public class DoWhile27 {
    public static void main(String[] args) {
        Scanner scan27 = new Scanner(System.in);
        
        int jatahCuti, jumlahHari; String konfirmasi;

        System.out.print("Jatah cuti: "); 
        jatahCuti = scan27.nextInt();
        
        do {
            System.out.print ("Apakah Anda ingin mengambil cuti (y/t)? "); 
            konfirmasi = scan27.next();

            if (konfirmasi.equalsIgnoreCase("y")) { 
                System.out.print("Jumlah hari: "); 
                jumlahHari = scan27.nextInt();

                    if (jumlahHari <= jatahCuti) { 
                        jatahCuti -= jumlahHari; 
                        System.out.println("Sisa jatah cuti: " + jatahCuti);
                    } else {
                        System.out.println("Sisa jatah cuti Anda tidak mencukupi"); 
                        continue;
                    }
            }else{
                break;
            }
            }while (jatahCuti > 0);
    }     
}
