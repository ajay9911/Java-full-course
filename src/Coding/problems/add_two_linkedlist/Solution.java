package Coding.problems.add_two_linkedlist;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    // Deserialize a string like "[2,4,3]" into a ListNode
    public static ListNode deserialize(String s) {
        if (s == null || s.isEmpty() || s.equals("[]")) return null;

        String[] vals = s.replaceAll("[\\[\\] ]", "").split(",");
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (String val : vals) {
            current.next = new ListNode(Integer.parseInt(val));
            current = current.next;
        }
        return dummy.next;
    }

    // Serialize a ListNode to a string representation like "[2,4,3]"
    public static String serialize(ListNode head) {
        if (head == null) return "[]";

        StringBuilder sb = new StringBuilder("[");
        while (head != null) {
            sb.append(head.val);
            if (head.next != null) sb.append(",");
            head = head.next;
        }
        sb.append("]");
        return sb.toString();
    }

    // Create a ListNode from an array of integers
    public static ListNode fromArray(int... values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: [2,4,3] + [5,6,4] = [7,0,8]
        ListNode l1 = ListNode.deserialize("[2,4,3]");
        ListNode l2 = ListNode.deserialize("[5,6,4]");
        ListNode result = solution.addTwoNumbers(l1, l2);
        System.out.println(ListNode.serialize(result));  // Output: [7,0,8]

        // Test case 2: [9,9,9,9,9,9,9] + [9,9,9,9] = [8,9,9,9,0,0,0,1]
        ListNode l3 = ListNode.deserialize("[9,9,9,9,9,9,9]");
        ListNode l4 = ListNode.deserialize("[9,9,9,9]");
        ListNode result2 = solution.addTwoNumbers(l3, l4);
        System.out.println(ListNode.serialize(result2));  // Output: [8,9,9,9,0,0,0,1]

        // Test case 3: [0] + [0] = [0]
        ListNode l5 = ListNode.deserialize("[0]");
        ListNode l6 = ListNode.deserialize("[0]");
        ListNode result3 = solution.addTwoNumbers(l5, l6);
        System.out.println(ListNode.serialize(result3));  // Output: [0]
    }
}
