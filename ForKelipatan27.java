import java.util.Scanner;

public class ForKelipatan27 {

    public static void main(String[] args) {
        Scanner scan27 = new Scanner(System.in);

        int kelipatan, total = 0, counter = 0;
        double rata2;

        System.out.println("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan27.nextInt();

        for(int i = 1; i <= 50; i++){
            if(i % kelipatan == 0){
                total += i;
                counter++;
            }
        }

        if(counter > 0){
            rata2 = (double) total/counter;
            System.out.println("rata ratanya adalah " + rata2);
        }else{
            System.out.println("rata rata tidak ditemukan");
        }
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter); 
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);  
    }

}