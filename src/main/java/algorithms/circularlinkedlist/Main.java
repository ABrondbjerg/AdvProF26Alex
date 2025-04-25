package algorithms.circularlinkedlist;



import java.util.List;

public class Main {

    public static void main(String[] args) {
        Node list = ListFactory.buildList(1, 2, 3, 4, 5);
      //  if(!isCircular(list))
        System.out.println(list);

        Node circularList = ListFactory.buildList();
      //   if(!isCircular(circularList))
        System.out.println(circularList);
    }
}
