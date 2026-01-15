package ListProblems;
//Problem 21:
//You are given the heads of two sorted linked lists list1 and list2.
//
//Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
//
//Return the head of the merged linked list.
//Example 1 :
//Input: list1 = [1,2,4], list2 = [1,3,4]
//Output: [1,1,2,3,4,4]

//Example 2:
//Input: list1 = [], list2 = []
//Output: []

//Example 3:
//Input: list1 = [], list2 = [0]
//Output: [0]





public class problem21 {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode cur1 = list1, cur2 = list2, cur3;
            ListNode newHead = new ListNode();
            cur3 = newHead;
            while (cur1!=null && cur2!=null){
                if(cur2.val>=cur1.val){
                    cur3.next = cur1;
                    cur1 = cur1.next;
                }
                else{
                    cur3.next = cur2;
                    cur2 = cur2.next;
                }
                cur3 = cur3.next;
            }
            if(cur2!=null)cur3.next = cur2;
            if(cur1!=null)cur3.next = cur1;
            return newHead.next;
        }
}
