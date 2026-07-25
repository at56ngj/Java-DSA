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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode prev=dummy;
        //First, shuru kiya dummy se, and phir chalte gaye up to left, left tak jakaar ruk gaye. Uska next hum connect karein reversed se. 
        for(int i=0;i<left-1;i++){
            prev=prev.next;
        }
        //Ab prev.next ko humne save karke rakh diya hai. 
        ListNode curr=prev.next;
        //Abhi curr se shuru karein, aur right tak chalein, traverse karke. Phir utna ko hum bhej denge, reverse wale function mein. 
        ListNode rightnode=curr;
        for(int i=0;i<right-left;i++){
            rightnode=rightnode.next;
        }
        //Abhi yeh right node.next ko humne save kar liya, wahan reverse node ke baad use attach karna ke liye. 
        ListNode afterright=rightnode.next;
        rightnode.next=null;//bas yahi to last part hai na. iske baad to null hi hai. 
         prev.next=reverse(curr);
        curr.next=afterright;

        return dummy.next;
        

       

        
    }
    public ListNode reverse(ListNode nadu){
         ListNode prev=null;
        ListNode curr=nadu;
        ListNode next=nadu;
        while(curr!=null){
            next=next.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna