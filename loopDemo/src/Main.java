public class Main {
    public static void main(String[] args) {
        for(int i=2;i<10;i+=2){
            System.out.println(i);
        }
        System.out.println("Döngü bitti");
        int i=2;
        while(i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While Döngü bitti");
        int j=100;
        do {
            System.out.println("log");
            System.out.println(j);
        }while (j<10);

    }

}
