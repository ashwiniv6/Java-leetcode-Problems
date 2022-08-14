package ReverseList;
/*
Problem Statement:
Given the head of a singly linked list, reverse the list, and return the reversed list.

        Example 1:
        Input: head = [1,2,3,4,5]
        Output: [5,4,3,2,1]

        Example 2:
        Input: head = [1,2]
        Output: [2,1]

        Example 3:
        Input: head = []
        Output: []


        Constraints:
        The number of nodes in the list is the range [0, 5000].
        -5000 <= Node.val <= 5000


        Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
*/
class Solution {
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
        public ListNode reverseList(ListNode head) {

            ListNode prev = null;

            while(head != null){
                ListNode next_node = head.next;
                head.next = prev;
                prev = head;
                head = next_node;
            }
            return prev;
        }
    }
/*
Solution 2:
class Solution{
         public ListNode reverseList(ListNode head) {
 if(head == null){
            return head;
        }

        ListNode previous = null;
        ListNode present = head;
        ListNode next = present.next;

        while(present != null) {
            present.next = previous;
            previous = present;
            present = next;
            if(next != null) {
                next = next.next;
            }
        }
        return previous; // as previous is now the head
    }
    }
 */
