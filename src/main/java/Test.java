public class Test {
  public static void main(String[] args) {
    MyLinkedList<String> myLinkedList = new MyLinkedList<>();

    myLinkedList.add("asdasd");
    myLinkedList.add("asdasd");
    myLinkedList.add("dsfd");
    myLinkedList.add("dsghh");
    myLinkedList.add("jkty");
    myLinkedList.add("ewrewr");

    System.out.println(myLinkedList);

    System.out.println(myLinkedList.get(2));
    myLinkedList.remove(3);
    System.out.println(myLinkedList);
    myLinkedList.update(1, "11");
    System.out.println(myLinkedList);
    myLinkedList.update(3, "11");
    System.out.println(myLinkedList);
  }
}
