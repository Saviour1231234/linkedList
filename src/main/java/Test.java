import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test {
  public static void main(String[] args) throws IOException {
    MyLinkedList<String> myLinkedList = new MyLinkedList<>();
    var stream = Stream.builder()
            .add("1212")
            .add("1212sd")
            .add("1212asd")
            .build();
    myLinkedList.add("asdasd");
    myLinkedList.add("asdasd");
    myLinkedList.add("dsfd");
    myLinkedList.add("dsghh");
    myLinkedList.add("jkty");
    myLinkedList.add("ewrewr");

    System.out.println(myLinkedList);

    System.out.println(myLinkedList.get(2));
    myLinkedList.remove(0);
    System.out.println(myLinkedList);
    myLinkedList.remove(1000);
    System.out.println(myLinkedList);

  }
}
