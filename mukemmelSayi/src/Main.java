public class Main {
    public static void main(String[] args) {
        int sayi=6;
        int total=0;


        if(sayi<=0){
            System.out.println("Sayı geçersiz");
            return;
        }

        for(int i=1;i<6;i++){
            if(sayi%i==0){
                total+=i;
            }
        }

        if(total==sayi){
            System.out.println("Mükemmel sayı");
        }
        else{
            System.out.println("Mükemmel sayı değil");
        }

    }
}
