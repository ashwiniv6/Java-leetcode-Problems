package SwappingLinkedLists;
/*

 **
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 **

The main problem is to determine the kth node from start and kth node from end .

Find kth node from start . The kth node from start can be found out using simple iteration upto k
Find kth node from end. The kth node from end can be found out using looping upto (total number of nodes) - k +1 ;
Swap the values of these two nodes.
(kth node from end. = (n - k + 1)th node from start)
where n = total number of nodes in the list.
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
