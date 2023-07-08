package DataStructure.LinkedList;


    public class Linkedlist {
        Node head;
        Node tail;

        public static void main(String[] args) {
            Linkedlist obj = new Linkedlist();
            obj.append(56);
            obj.append(30);
            obj.append(70);
            obj.append(23);
            System.out.println("Printing linked list values:-");
            obj.printing();
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
        class Node {
            int data;
            Node next; //place value

            public Node(int data) {
                this.data = data;
                this.next = next;
            }
        }

    }
