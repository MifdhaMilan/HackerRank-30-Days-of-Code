//Question: https://www.hackerrank.com/challenges/30-linked-list/problem



    public static  Node insert(Node head,int data) {
        Node node = new Node(data); 
        node.data=data;
        if(head==null){
            head=node;
        }else{
            Node n=head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=node;
           
        }
        
        return head;
    }

