public class Main {
    public static void main(String[] args) {
        int sayi1=20;
        int sayi2=10;
        int sayi3=30;
        int enBuyuk=sayi1;

        if(sayi2>enBuyuk)
        {
            enBuyuk=sayi2;
        }
        else if(sayi3>enBuyuk)
        {
            enBuyuk=sayi3;
        }
        System.out.println("En büyük sayi: "+enBuyuk);
    }
}
