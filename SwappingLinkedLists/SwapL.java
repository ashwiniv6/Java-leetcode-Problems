package SwappingLinkedLists;


/*
Problem Statement: Swapping Nodes in a Linked List

You are given the head of a linked list, and an integer k.

Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).



Example 1:
Input: head = [1,2,3,4,5], k = 2
Output: [1,4,3,2,5]

Example 2:
Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
Output: [7,9,6,6,8,7,3,0,9,5]


Constraints:
The number of nodes in the list is n.
1 <= k <= n <= 105
0 <= Node.val <= 100
 */

public class SwapL {
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

        public ListNode swapNodes(ListNode head, int k) {


            if( head == null)
                return head;

            int count = 0 ;

            ListNode temp = head;

            while(temp != null)
            {
                count++;
                temp = temp.next;
            }

            ListNode firstNode = head;

            for( int i =1 ; i < k ; i++)
            {
                firstNode= firstNode.next;
            }

            ListNode secondNode = head;

            for(int i =1; i < count - k + 1 ; i ++)
            {
                secondNode=secondNode.next;
            }

            //swapp the values
            int value = firstNode.val;
            firstNode.val = secondNode.val;
            secondNode.val = value;

            return head;
        }


}

/*
Explanation:

The main problem is to determine the kth node from start and kth node from end .

1.Find kth node from start . The kth node from start can be found out using simple iteration upto k
2.Find kth node from end. The kth node from end can be found out using looping upto (total number of nodes) - k +1 ;
3.Swap the values of these two nodes.
     (kth node from end. = (n - k + 1)th node from start)
     where n = total number of nodes in the list.
 */