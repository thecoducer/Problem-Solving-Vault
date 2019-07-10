import java.util.*;
class a{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);
        int size=list.size();
        System.out.println("size" + size);
        System.out.println(list.get(2));
        list.remove(0);
        System.out.println(list.get(0));
        size=list.size();
        list.remove(size-1);
        size=list.size();
        System.out.println(list.get(size-1));
        System.out.println(list);
        System.out.println(list.size());
    }
}