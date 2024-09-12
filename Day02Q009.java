// Middle of the Linked List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int size = getSize(head);
        if (size == 0 || size == 1)
            return head;
        int middle;
        if (size % 2 == 0) {
            middle = (size / 2);
        } else {
            middle = ((size + 1) / 2) - 1;
        }
        int i = 0;
        while (i < middle) {
            head = head.next;
            i++;
        }
        return head;
    }

    private int getSize(ListNode head) {
        if (head == null)
            return 0;
        if (head.next == null)
            return 1;
        int i = 0;
        while (head != null) {
            head = head.next;
            i++;
        }
        return i;
    }
}