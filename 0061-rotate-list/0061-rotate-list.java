/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode temp=head;
        int count=1;
       while(temp.next!=null){
            temp=temp.next;
            count++;
       }
       temp.next=head;
       ListNode neww=temp.next;
       k=k%count;
       for(int i=0;i<count-k-1;i++){
            neww=neww.next;
       }
       ListNode newhead=neww.next;
       neww.next=null;
       return newhead;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna