
/**
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode re;
        if (l1.val < l2.val) {
            re = l1;
            re.next = mergeTwoLists(l1.next, l2);
        } else {
            re = l2;
            re.next = mergeTwoLists(l1, l2.next);
        }
        return re;
    }
}
