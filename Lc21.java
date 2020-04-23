/*
将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 

示例：

输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
*/
public class Lc21 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode sentinel = new ListNode(-1);
        ListNode current = sentinel;
        while (l1!=null || l2!=null){
            if (l1==null){
                current.next = l2;
                break;
            }
            if (l2==null){
                current.next = l1;
                break;
            }
            if (l1.val>l2.val){
                current.next = l2;
                l2 = l2.next;
                current = current.next;
            } else {
                current.next = l1;
                l1 = l1.next;
                current = current.next;
            }
        }
        return sentinel.next;
    }
}