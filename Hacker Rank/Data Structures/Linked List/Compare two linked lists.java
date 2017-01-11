/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method 
    
    if ((headA == null) && (headB == null)) {
        return 1;
    }
    
    Node nodeA = headA;
    Node nodeB = headB;
    
    while ((nodeA != null) && (nodeB != null)) {
        
        if (nodeA.data != nodeB.data) {
            return 0;
        }
        
        nodeA = nodeA.next;
        nodeB = nodeB.next;
        
    }
    
    return ((nodeA == null) && (nodeB == null)) ? 1 : 0;    
}
