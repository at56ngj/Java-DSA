class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 1. Dummy node aur carry initialize kiya 🧱
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        
        // 2. Loop tab tak chalega jab tak l1, l2 ya carry mein se kuch bhi bacha ho 🔄
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; // Pehle carry add karo ➕
            
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            
            // 3. Naya carry aur value calculate karo 🧮
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
        
        return dummy.next;
    }
}