import java.util.*;
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(arr);
        ListNode curr=head;
        int a=0;
        while(curr!=null){
            curr.val=arr.get(a);
            curr=curr.next;
            a++;
        }
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna