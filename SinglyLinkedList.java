public class SinglyLinkedList {
    Node head;
    Node tail;

    public SinglyLinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
    public void tambahDepan(Buku data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode = head;
            head = newNode;
        }
    }

    public void tambahBelakang(Buku data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void hapusDepan() {
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void hapusBelakang() {
        if (head == tail) {
            head = tail = null;
        } else {
            Node iterator = head;
            while (iterator.next != tail) {
                iterator = iterator.next;
            }
            iterator = tail;
            iterator.next = null;
        }
    }

    public void print() {
        if(isEmpty()) {
            System.out.println("List Kosong");
        } else {
            Node iterator = head;
            while (iterator != null) {
                System.out.println(iterator.data);
                iterator = iterator.next;
            }
        }
    }
}
