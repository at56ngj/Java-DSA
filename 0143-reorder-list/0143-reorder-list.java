class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;

        ListNode slow=head, fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondHead=slow.next;
        slow.next=null;   // first half yahin cut hoti hai, slow khud last node hai

        Stack<Integer> valueStack=new Stack<>();
        while(secondHead!=null){
            valueStack.push(secondHead.val);
            secondHead=secondHead.next;
        }

        ListNode rev=new ListNode(Integer.MIN_VALUE);
        ListNode ptr=rev;
        while(!valueStack.isEmpty()){
            ptr.next=new ListNode(valueStack.pop());
            ptr=ptr.next;
        }

        ListNode one=head;
        ListNode two=rev.next;

        while(two!=null){
            ListNode oneNext=one.next;
            ListNode twoNext=two.next;

            one.next=two;
            two.next=oneNext;

            one=oneNext;
            two=twoNext;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna