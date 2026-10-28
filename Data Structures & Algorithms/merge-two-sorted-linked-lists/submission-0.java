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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null) {
            return list1;
        }else if(list1==null) {
            ListNode first = sort(list2);
            return first;
        } else if(list2==null) {
            ListNode first = sort(list1);
            return first;
        } else {
        ListNode curr1 = list1;
        while(curr1.next!=null) {
            curr1 = curr1.next;
        }
        curr1.next=list2;
        ListNode first = sort(list1);
        return first;
        }
    }
    public ListNode sort(ListNode list1) {
        ListNode current = list1;
        while(current!=null) {
            ListNode inCurr = current.next;
            while(inCurr!=null) {
                if(current.val>inCurr.val) {
                    int temp = current.val;
                    current.val = inCurr.val;
                    inCurr.val = temp;
                }
                inCurr = inCurr.next;
            }
            current = current.next;
        }
        return list1;
    }
}