package LinkList;

public class BasicOperations {

    //create link list from array

    public static Node createLinkList(int[] A) {
        int n = A.length;

        Node head = new Node(A[0]);
        Node temp = head;

        for(int i=1;i<n;i++) {
            temp.next = new Node(A[i]);
            temp = temp.next;
        }

        return head;
    }

    public static int getKthElement(Node head, int k) {
        Node temp=head;

        for(int i=0;i<k;i++) {
            temp=temp.next;
        }

        return temp.data;
    }

    public static boolean isElementPresent(Node head, int data) {

        Node temp = head;

        while(temp!=null) {
            if(temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static int getlength(Node head) {
        int count = 0;
        Node temp = head;
        while(temp!=null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static Node insert(Node head, int pos, int data) {
        Node newNode = new Node(data);

        if(pos == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        } else {
            Node temp = head;

            for(int i=0;i<pos-1;i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return head;
    }

    public static Node delete(Node head, int data) {
        if(head.data == data) {
            Node temp = head.next;
            head.next = null;
            head = temp;
            return head;
        } else {
            Node temp = head;
            while(temp.next!=null) {
                if(temp.next.data == data) {
                    temp.next = temp.next.next;
                    return head;
                }
                temp = temp.next;
            }
            return head;
        }

    }

    public static void print_ll(Node head) {
        // Output each element followed by a space
        Node temp=head;
        while(temp!=null){
            if(temp.next!=null){
                System.out.print(temp.data);
                System.out.print(" ");
            } else {
                System.out.print(temp.data);
            }
            temp=temp.next;
        }
    }


    public static void main(String[] args) {
        int[] A = {2,5,7,8,20};
//        createLinkList(A);

        Node head = new Node(2);
        head.next = new Node(5);
        head.next.next = new Node(7);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(20);

//        System.out.println(getKthElement(head, 0));

//        System.out.println(isElementPresent(head, 20));
//        System.out.println(getlength(head));
        System.out.println();
        print_ll(head);
        Node h1 = insert(head,3,9);
        System.out.println();
        print_ll(h1);
//        System.out.println(getKthElement(head,3));
//        System.out.println(getKthElement(head,4));
        Node h = delete(head,5);
        System.out.println();
        print_ll(h);
//        System.out.println(" ");
//
//        System.out.println(h.data + ", " + h.next.data +  " " + h.next.next.data);
    }
}
