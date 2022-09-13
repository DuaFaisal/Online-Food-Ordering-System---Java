package FinalProject;

import FinalProject.AvailableResturant.Node;

class AvailableResturant {
	public AvailableResturant(){
   	this.AddRestaurant("a. McDonalds");
       this.AddRestaurant("b. KFC");
       this.AddRestaurant("c. OPTP");
       this.AddRestaurant("d. Broadway");
       this.AddRestaurant("e. Dominos");
       this.AddRestaurant("f. Johnny Rockets");
       this.AddRestaurant("g. Cafe Bistrovia");
       this.AddRestaurant("h. Vintage Cafe");
       this.AddRestaurant("i. Kababjees");
       this.AddRestaurant("j. Urban Tarka");
   }
	static class Node {

       String restaurant;
       Node prev;
       Node next;

       public Node(String restaurant) {
           this.restaurant = restaurant;
       }
   }
	Node head, tail = null;
	
	
	void AddRestaurant(String restaurant) {
       Node toAdd = new Node(restaurant);

       if (head == null) {
           //Both head and tail will point to newNode  
           head = tail = toAdd;
           //head's previous will point to null  
           head.prev = null;
           //tail's next will point to null, as it is the last node of the list  
           tail.next = null;
       } else {
           //newNode will be added after tail such that tail's next will point to newNode  
           tail.next = toAdd;
           //newNode's previous will point to tail  
           toAdd.prev = tail;
           //newNode will become new tail  
           tail = toAdd;
           //As it is last node, tail's next will point to null  
           tail.next = null;
       }
   }
   //printing the restaurants names

   void print() {
       Node temp = head;
       while (temp != null) {
           System.out.println(temp.restaurant + " ");
           temp = temp.next;
       }
   }
   

   public void search(String resname) {
       int i = 1;
       boolean flag = false;
       //Node current will point to head  
       Node current = head;

       //Checks whether the list is empty  
       if (head == null) {
           System.out.println("The item is not available");
           return;
       }
       while (current != null) {
           //Compare value to be searched with each node in the list  
           if (current.restaurant == resname) {
               flag = true;
               break;
           }
           current = current.next;
           i++;
       }
       if (flag) {
           System.out.println("Successfully added!");
       } else {
           System.out.println("The item you want is not available. Please try later");
       }
   }
   void deleteNode(Node del)
   {

       // Base case
       if (head == null || del == null) {
           return;
       }

       // If node to be deleted is head node
       if (head == del) {
           head = del.next;
       }

       // Change next only if node to be deleted
       // is NOT the last node
       if (del.next != null) {
           del.next.prev = del.prev;
       }

       // Change prev only if node to be deleted
       // is NOT the first node
       if (del.prev != null) {
           del.prev.next = del.next;
       }

       // Finally, free the memory occupied by del
       return;
   }
// Function to delete the node at the
   // given position in the doubly linked list
    void deleteNodeAtGivenPos(char delete)
   {
    	int ascii = (int) delete;
       /* if list in NULL or
         invalid position is given */
       if (head == null || ascii <= 0)
           return;

       Node current = head;
       int i;
       
       for (i = 'a'; current != null && i < ascii; i++)
       {
           current = current.next;
       }
        
       // if 'n' is greater than the number of nodes
       // in the doubly linked list
       if (current == null)
           return;

       // delete the node pointed to by 'current'
       deleteNode(current);
   }
     void AfterDelete()
    {
        Node temp = head;
        if (temp == null)
            System.out.print("Something went wrong!");
 
        while (temp != null)
        {
            System.out.println(temp.restaurant + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
