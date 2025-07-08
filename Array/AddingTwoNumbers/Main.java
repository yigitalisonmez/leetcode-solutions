//// ACCEPTED

class Solution {

      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode dummy = new ListNode(-1);  // Geçici başlangıç
        ListNode current = dummy;
        int digit1=-1;
        int digit2=-1;

        while(l1!=null || l2!=null ){
            // if there is a digit we take a otherwise we take 0 instead.(like filling with zero)
            digit1 = l1!=null ? l1.val : 0;
            digit2 = l2!=null ? l2.val : 0;
            // iterate through the l1 and l2 
            l1 = (l1!=null) ? l1.next:null;
            l2 = (l2!=null) ? l2.next:null; 
            // calculate if carry exists 
            int sum = digit1 + digit2 + carry;
            int nodeVal= sum % 10; 
            carry = (sum > 10) || (sum ==10) ? 1 : 0;
            // create the linked list
            current.next = new ListNode(nodeVal);
            current = current.next;
        }
        // add the carry from last addition
        if(carry==1){
            current.next = new ListNode(1);
            current = current.next;
        }
        return dummy.next;
    }
        // Helper method to create linked list from array
    public ListNode createList(int[] nums) {
        if (nums.length == 0) return null;
        
        ListNode head = new ListNode(nums[0]);
        ListNode current = head;
        
        for (int i = 1; i < nums.length; i++) {
            current.next = new ListNode(nums[i]);
            current = current.next;
        }
        return head;
    }
    
    // Helper method to print linked list
    public void printList(ListNode head) {
        System.out.print("[");
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(", ");
            }
            head = head.next;
        }
        System.out.print("]");
    }
    
    // Helper method to convert linked list to number for verification
    public long listToNumber(ListNode head) {
        long num = 0;
        long multiplier = 1;
        while (head != null) {
            num += head.val * multiplier;
            multiplier *= 10;
            head = head.next;
        }
        return num;
    }
     public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("=== ADD TWO NUMBERS TEST CASES ===\n");
        
        // Test Case 1: Basic example
        System.out.println("Test Case 1: 342 + 465 = 807");
        int[] nums1 = {9}; // represents 342
        int[] nums2 = {1,9,9,9,9,9,9,9,9,9}; // represents 465
        ListNode l1 = solution.createList(nums1);
        ListNode l2 = solution.createList(nums2);
        
        System.out.print("Input: l1 = ");
        solution.printList(l1);
        System.out.print(", l2 = ");
        solution.printList(l2);
        System.out.println();
        
        ListNode result1 = solution.addTwoNumbers(l1, l2);
        System.out.print("Output: ");
        solution.printList(result1);
        System.out.println(" (Expected: [0,0,0,0,0,0,0,0,0,0,1])");
        System.out.println("Verification: " + solution.listToNumber(l1) + " + " + solution.listToNumber(l2) + " = " + solution.listToNumber(result1));
        System.out.println();
        

        System.out.println("=== ALL TESTS COMPLETED ===");
    }
}