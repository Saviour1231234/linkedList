public class Test {
  public static void main(String[] args) {
    MyLinkedList myLinkedList = new MyLinkedList();

    myLinkedList.add(10);
    myLinkedList.add(20);
    myLinkedList.add(30);
    myLinkedList.add(40);
    myLinkedList.add(50);
    myLinkedList.add(60);

    System.out.println(myLinkedList);

    System.out.println(myLinkedList.get(2));
    myLinkedList.remove(3);
    System.out.println(myLinkedList);
    myLinkedList.update(1, 11);
    System.out.println(myLinkedList);
    myLinkedList.update(3, 11);
    System.out.println(myLinkedList);
  }
}
