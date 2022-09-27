public class Main {
    public static void main(String[] args) {
        int[] sayilar= new int[]{1,4,6,7,9};
        int aranacakSayi=6;
        boolean varMi=false;

        for(int sayi:sayilar){
            if(sayi==aranacakSayi){
                varMi=true;
            }
        }
        if(varMi) {
            System.out.println("Sayı mevcut");
        }else{
            System.out.println("Mevcut degil");}
    }
}
