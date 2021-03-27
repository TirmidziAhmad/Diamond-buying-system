//import
import java.util.Scanner;



class Display{

    public void  tampil (){
        //tampilan 
        System.out.println("1. 210 diamond (30.000)\n2. 355 diamond (50.000)\n3. 420 diamand (60.000)");
    }
}

class Input {
    int paket,jmlpaket,harga =0;
    Scanner scan = new Scanner(System.in);
    
    public void pilihpaket(){
        System.out.print("masukkan paket pilihan anda: ");
        paket = scan.nextInt();
        if (paket < 0 || paket > 3 ){
            System.out.println("System error");}
        else{
            System.out.print("Berapa jumlah paket yang ingin dibeli: ");
        jmlpaket = scan.nextInt();
        jikapaket();
        }
        
    }

    public void jikapaket(){
        switch (paket){
            case 1:
            harga = 30000 * jmlpaket;
            if (harga >= 200000){
                System.out.println("\n Selamat anda mendapatkan 'Bonus Mie Sedap' \n");
            }
            break;
            case 2:
            harga = 50000 * jmlpaket;
            if (harga >= 200000){
                System.out.println("\n Selamat anda mendapatkan bonus 'MIE SUKSES ISI 2' \n");
            }
            break;
            case 3:
            harga = 60000 * jmlpaket;
            if (harga >= 200000){
                System.out.println("\n Selamat anda mendapatkan bonus  \n");
            }
            break;
            default:
            System.out.println("Pilihan anda salah");
            break;
        }
        System.out.println("jumlah yang anda pesan adl: "+ harga);
    }
 
}


//main
public class diamond {

 public static void main(String[] args) {
        Input uyab = new Input();
        Display ida = new Display();
        ida.tampil();
        uyab.pilihpaket();

    }

}

