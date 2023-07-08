package DataStructure.LinkedList;


    public class Linkedlist {
        Node head;
        Node tail;

        public static void main(String[] args) {
            Linkedlist obj = new Linkedlist();
            obj.add(70);
            obj.add(30);
            obj.add(56);
            System.out.println("Printing linked list values:-");
            obj.printing();
            obj.pop();
            System.out.println("Printing linked list after deleting value:-");
            obj.printing();
        }

        //Delete first node means head
        public void pop() {
            this.head = this.head.next;
        }

        //Insert data between
        public void insertInBetween(Node previousNode,int data) {
            //creating object for Node with data
            Node newNode = new Node(data);
            //assigning place value for new node as previous.next which is Node1
            newNode.next = previousNode.next;
            //Assigning newNode as previous.next value
            previousNode.next = newNode;
        }

        //Adding value to linked list
        public Node add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode; //head=56
                tail = newNode; //tail=56
            } else {
                Node temp = head; //temp=56 -> temp=30
                this.head = newNode; //head=30 ->head=70
                newNode.next = temp; //newnode.next=56
            }
            return newNode;
        }

        //Printing the linked list values
        public void printing() {
            if (head == null) {
                System.out.println("Linked List is Empty");
            } else {
                Node temp = head; //head=23
                while (temp != null) {
                    if (temp.next != null){ //temp.next -> node1
                        System.out.print(temp.data + " -> ");//temp.data=23
                    }
                    else{
                        System.out.println(temp.data);
                    }
                    temp = temp.next; //temp -> node1
                }
            }
        }

        //creating append function
        public void append(int data) {
            Node newNode = new Node(data); //newNode=56
            if (head == null) {
                head = newNode; //head=56
                tail = newNode;//tail=56
            } else {
                this.tail.next = newNode;
                tail = newNode;
            }
        }

        //creating class node
        static class Node {
            int data;
            Node next; //place value

            public Node(int data) {
                this.data = data;
                this.next = next;
            }
        }

    }
