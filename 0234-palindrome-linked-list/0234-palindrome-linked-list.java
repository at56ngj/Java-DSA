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
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;//
        ListNode mid=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            mid=mid.next;
        }

        ListNode prev=null;
        ListNode curr=mid;
        ListNode next=mid;
        while(curr!=null){
            next=next.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        ListNode head2=prev;//
        ListNode head1=head;
        while(head1!=null && head2!=null){
            if(head1.val==head2.val){
                head1=head1.next;
                head2=head2.next;
            }
            else{
                return false;
            }
        }
        return true;
        


        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna