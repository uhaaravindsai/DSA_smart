
/*Definition for singly Linked List
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
*/

class Solution {
    public ListNode insertAtHead(ListNode head, int X) {
        ListNode newNode = new ListNode(X); 
        newNode.next = head;                
        return newNode;                     
    }
}

