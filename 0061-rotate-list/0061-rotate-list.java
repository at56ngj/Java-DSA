class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;

        ListNode temp=head;
        int count=1;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        temp.next=head;

        k=k%count;
        ListNode neww=head;
        for(int i=0;i<count-k-1;i++){
            neww=neww.next;
        }
        ListNode newHead=neww.next;
        neww.next=null;
        return newHead;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna