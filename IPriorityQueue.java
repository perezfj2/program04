// Student Name
// Date
// CSCI 3302 Section 001
//
// Files:
//
// Description: 

public interface IPriorityQueue<T> {
    public boolean isEmpty();
    public void add(int priority, T item);
    public T removePriority() throws PQException;
    public T peekTopPriority() throws PQException;

}  // end interface