package algorithms.circularlinkedlistsolution;

public class Main {

    public static void main(String[] args) {
        Node list = ListFactory.buildList(1, 2, 3, 4, 5);
        if(!isCircular(list))
            System.out.println(list);

        Node circularlist = ListFactory.buildListWithCycle();
        if(!isCircular(circularlist))
            System.out.println(circularlist);
    }

    private static boolean isCircular(Node head){
        Node slow = head;
        Node fast = head;

       // while (fast != null && )

        return false;
    }
}
