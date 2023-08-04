import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(10);

        ArrayList<Integer> list3=new ArrayList<>(7);
        ArrayList<Integer> list4=new ArrayList<>(5);
        ArrayList<String> list2= new ArrayList<>(3);
//        list.add(67);
//        list.add(678);
//        list.add(43);
//        list.add(678);
        for(int i=0;i<11;i++){
            list.add(in.nextInt());
        }
        list2.add("lauda");
//        System.out.println(list);
//        System.out.println(list2);
//        System.out.println(list.contains(43));
//        System.out.println(list2.contains("lauda"));
//        list.set(1,45);
//        System.out.println(list);
//        list2.set(0,"mc");
//        System.out.println(list2);
        //to get item at any index
        for(int i=0;i<11;i++){
            System.out.println(list.get(i));
        }
    }
}
