import java.util.Arrays;

public class MyLinkedList <T>{

  private Node <T> head;
  private int size;

  public void add(T value) {
    if (head == null) {
      this.head = new Node<>(value);
    } else {
      Node<T> temp = head;
      while (temp.getNext() != null) {
        temp = temp.getNext();
      }
      temp.setNext(new Node<>(value));
    }
    size++;
  }

  public T get(int index) {
    int currentIndex = 0;
    Node<T> temp = head;
    while (temp != null) {
      if (currentIndex == index) {
        return temp.getValue();
      } else {
        temp = temp.getNext();
        currentIndex++;
      }
    }
    throw new IllegalArgumentException();
  }

  public void remove(int index) {
    if (index==0){
      head = head.getNext();
      size--;
      return;
    }
    int currentIndex = 0;
    Node <T> temp = head;
    while (temp != null) {
      if ((currentIndex + 1) == index) {
        temp.setNext(temp.getNext().getNext());
        size--;
        return;
      } else {
        temp = temp.getNext();
        currentIndex++;
      }
    }
    throw new IllegalArgumentException();
  }

  public void update(int index, T value){
    int currentIndex = 0;
    Node <T> temp = head;
    while (temp != null) {
      if (currentIndex == index) {
        temp.setValue(value);
        break;
      } else {
      temp = temp.getNext();
        currentIndex++;
    }
    }
  }

  public String toString() {
    Object [] result = new Object[size];
    int index = 0;
    Node<T> temp = head;
    while (temp != null) {
      result[index++] = temp.getValue();
      temp = temp.getNext();
    }
    return Arrays.toString(result);
  }

  static class Node<T> {

    private T value;
    private Node <T> next;

    public Node(T value) {
      this.value = value;
    }

    public T getValue() {
      return value;
    }

    public void setValue(T value) {
      this.value = value;
    }

    public Node<T> getNext() {
      return next;
    }

    public void setNext(Node<T> next) {
      this.next = next;
    }
  }
}
