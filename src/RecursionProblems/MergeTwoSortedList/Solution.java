package RecursionProblems.MergeTwoSortedList;

class Solution {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 3, 4};

        ListNode list1 = buildList(arr1);
        ListNode list2 = buildList(arr2);

        Solution solution = new Solution();
        ListNode merged = solution.mergeTwoLists(list1, list2);

        System.out.print("Merged List: ");
        printList(merged);
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) current.next = list1;
        else current.next = list2;

        return dummy.next;
    }

    // Helper: build linked list from array
    public static ListNode buildList(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for (int num : arr) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper: print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

}