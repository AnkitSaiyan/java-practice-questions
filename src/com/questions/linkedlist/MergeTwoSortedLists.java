package com.questions.linkedlist;

public class MergeTwoSortedLists extends ListNode {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        ListNode merge;
        if (list1.val < list2.val) {
            merge = list1;
            list1 = list1.next;
        } else {
            merge = list2;
            list2 = list2.next;
        }

        ListNode curr = merge;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

       if (list1 != null) {
           curr.next = list1;
       }

        if (list2 != null) {
            curr.next = list2;
        }

        return merge;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2, 4};
        int[] arr2 = new int[] {0, 3, 5};

        ListNode list1 = new ListNode(arr1);
        ListNode list2 = new ListNode(arr2);

        list1.displayList();
        list2.displayList();

        ListNode mergeList = mergeTwoLists(list1, list2);
        mergeList.displayList();
    }
}
