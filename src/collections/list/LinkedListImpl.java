package collections.list;

public class LinkedListImpl {

  public void display(ListNode head) {
    if (head == null) {
      return;
    }
    ListNode current = head;
    while (current != null) {
      System.out.print(current.data + " ---> ");
      current = current.next;
    }
  }


  public static class ListNode {

    private int data;
    private ListNode next;

    public ListNode(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(10);
    ListNode second = new ListNode(20);
    ListNode third = new ListNode(30);
    ListNode fourth = new ListNode(40);

    head.next = second;
    second.next = third;
    third.next = fourth;

    LinkedListImpl linkedList = new LinkedListImpl();
    linkedList.display(head);
  }
}
