public class SimpleLinkedList {
    public Node head;

    public SimpleLinkedList(int data){
        this.head=new Node(data);
    }

    public void listFromArray(int[] arr){
        this.head = new Node(arr[0]);
        Node tmp = this.head;
        for(int i = 1; i < arr.length; i++){
            tmp.next = new Node(arr[i]);
            tmp = tmp.next;
        }
    }
    public void addFirst(int data){
        Node newHead=new Node(data);
        newHead.next=this.head;
        this.head=newHead;
    }

    public void addLast(int data){
        Node tmp=this.head;
        while(tmp.next!=null){
            tmp=tmp.next;
        }

        Node newTail=new Node(data);
        tmp.next=newTail;
    }

    public int getSize(){
        if(this.head==null) return 0;

        Node tmp=this.head;
        int count=1;

        while(tmp.next!=null){
            count++;
            tmp=tmp.next;
        }

        return count;
    }

    public boolean isEmpty(){
        return this.head==null;
    }


    public void removeFirst(){
        Node next = head.next;
        this.head = next;
    }


    public void removeLast(){
        Node tmp =this.head;
        //! = not
        while(tmp.next.next != null){
            tmp = tmp.next;
        }
        tmp.next = null;

    }


    public void removeAt(int position){

    }

    public int getAt(int position){
        return 0;
    }


}
