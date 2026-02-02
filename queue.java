class myQueue {
    int []arr;
    int front;
    int rear;
    int size;
    

    public myQueue() {
        // initialize your queue
        arr=new int[1000008];
        front =-1;
        rear =-1;
        size=0;
        
        
    }

    public void enqueue(int x) {
        // insert x into queue
        if(front == -1) front =0;
        
        if(size == arr.length) return ;
        
        else{
            arr[++rear]=x;
            size++;
        }
    }

    public void dequeue() {
        // remove front element from queue
        
        if(size ==0 ) return;
        
           front++; 
           size--;
        if( size  == 0 )
        {
            front =-1;
            rear = -1;
        }
        
    }

    public int getFront() {
        // return the front element of the queue
        
        if(size >0)
        {
           return arr[front]; 
        }
        else{
            return -1;
        }
    }

    public int getRear() {
        // return the rear element of the queue
        if(size >0)
        {
           return arr[rear]; 
        }
        else{
            return -1;
        }
    }

    public boolean isEmpty() {
        // check whether the queue is empty
        if(size == 0 ) return true;
        else  return false;
    }

    public int size() {
        // return the size of the queue
        return size;
    }
}
