// Student Name
// Date
// CSCI 3302 Section 001
//
// Files:
//
// Description: The Node<T> class is used to build the linked-list collection of 
// objects stored in the PriorityQueue<T>. The class uses a generic data type.

public class Node<T> {

  private int itemPriority;  // priority of object in the queue
  private T item;            // value of item in the queue
  private Node<T> next;      // reference to the next item in the queue

  /**
   * Constructor to create a Node for the priority queue. 
   * A reference to the Node is returned via the constructor.
   * @param priority - integer represeting priority of item
   * @param newItem  - value of item to be in the queue
   */
  public Node(int priority, T newItem) {
    this.itemPriority = priority;
    this.item = newItem;
    this.next = null;
  }

  /**
   * Simple getter to return item priority.
   * @return - value of the itemPriority attribute
   */
  public int getPriority() {
    return this.itemPriority;
  }

  /**
   * Simple getter to return a reference to the 
   * item in this Node.
   * @return - reference to the item held in the Node 
   */
  public T getItem() {
    return this.item;
  }

  /**
   * Simple getter to return a reference to 
   * the next item in the queue.
   * @return - reference to following item in the queue
   */
  public Node<T> getNext() {
    return this.next;
  }

  /**
   * Setter for the next Node in the queue
   * @param nextNode - non-null reference to next
   * item in the queue
   */
  public void setNext(Node<T> nextNode) {
    this.next = nextNode;
  }
}
