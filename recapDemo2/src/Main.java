public class Main {
    public static void main(String[] args) {
        double  myList[]={5.6,3.2,4.0,2.2};
        double total=0;
        double max=myList[0];
        for(double number:myList){
            if(max<number)
            {
                max=number;
            }
            total+=number;
            System.out.println(number);
        }
        System.out.println("Total:"+total);
        System.out.println("Max :"+max);
    }
}
