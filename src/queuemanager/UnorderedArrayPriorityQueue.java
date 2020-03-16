package queuemanager;

public class UnorderedArrayPriorityQueue<T> implements PriorityQueue<T> {
    
    /**
     * Where the data is actually stored.
     */
    private final Object[] storage;

    /**
     * The size of the storage array.
     */
    private final int capacity;

    /**
     * The index of the last item stored.
     *
     * This is equal to the item count minus one.
     */
    private int tailIndex;

    /**
     * Create a new empty queue of the given size.
     *
     * @param size
     */
    public UnorderedArrayPriorityQueue(int size) {
        storage = new Object[size];
        capacity = size;
        tailIndex = -1;
    }

    @Override
    public T head() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            return ((PriorityItem<T>) storage[0]).getItem();
        }
    }

    @Override
    public void add(T item, int priority) throws QueueOverflowException {
          tailIndex = tailIndex + 1;
        if (tailIndex >= capacity) {
            /* No resizing implemented, but that would be a good enhancement. */
            tailIndex = tailIndex - 1;
            throw new QueueOverflowException();
        } else {
            
            int i = tailIndex;

            storage[i] = new PriorityItem<>(item, priority);
        }
        
    }

    @Override
    public void remove() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            tailIndex = tailIndex + 1;
            int priority = 0;
            int location = 0;
            for (int i = 0; i < tailIndex; i++) {
                while (((PriorityItem<T>) storage[i]).getPriority() > priority) {
                     priority = ((PriorityItem<T>) storage[i]).getPriority();
                      location =  i;                     
            }   
            }
             System.out.println("Tailindex is "+tailIndex);
            for(int i =location; i<tailIndex;i++ )
            {
                    storage[i]=storage[i+1];
                    tailIndex = tailIndex-1;
                    
            }
            
           tailIndex=tailIndex-1;
  
        }
            
           
    }

    @Override
    public boolean isEmpty() {
        return tailIndex < 0;
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i <= tailIndex; i++) {
            if (i > 0) {
                result = result + ", ";
            }
            result = result + storage[i];
        }
        result = result + "]";
        return result;
    }
}