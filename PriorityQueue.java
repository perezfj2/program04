// Student Name Fernando Perez
// Date 3/14/2023
// CSCI 3302 Section 001
//
// Files: IPriorityQueue.java, Node.java, PQException.java, PriorityQueue.java
//
// Description: This program adds items to a queue and sorts them on the integer value of the priority. The lower the priority numbers the higher the priority

public class PriorityQueue<T> implements IPriorityQueue<T> {
    private Node<T> front;

    public PriorityQueue() {
        this.front = null;
    }

    /**
     * Checks if the queue is empty.
     */
    @Override
    public boolean isEmpty() {
        return (this.front == null);
    }

    /**
     * Adds a new item to the queue and sorts it.
     * @param priority - integer represeting priority of item
     * @param item - value of the item in the queue
     */
    @Override   
    public void add(int priority, T item) {
        Node<T> newNode = new Node<T>(priority, item);
        if (this.isEmpty() || newNode.getPriority() < this.front.getPriority()) {
            newNode.setNext(this.front);
            this.front = newNode;
        } else {
            Node<T> current = this.front;
            while (current != null && current.getNext() != null && current.getNext().getPriority() <= current.getPriority()) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
    }

    /**
     * Removes the item at the top priority
     * @return - reference to the item removed
     */
    @Override
    public T removePriority() throws PQException {
        if (this.isEmpty()) {
            throw new PQException("Queue is empty.");
        } else {
            this.front = this.front.getNext();
            T item = (T) this.front;
            return item;
        }
    }

    /**
     * Shows the value of the item of top priority
     * @return - Returns the value of the top priority item in the queue.
     */
    @Override
    public T peekTopPriority() throws PQException {
        if(this.isEmpty()){
            throw new PQException("Queue is empty.");
        } else {
            T item = this.front.getItem();
            return item;
        }
    }

} // end class