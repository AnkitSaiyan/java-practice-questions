package com.questions.linkedlist;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this(val);
        this.next = next;
    }

    ListNode(int[] arr) {
        if (arr.length > 0) {
            this.val = arr[0];
            ListNode last = this.next;
            for (int i = 1; i < arr.length; i++) {
                ListNode temp = new ListNode(arr[i]);
                if (this.next == null) {
                    this.next = temp;
                    last = this.next;
                } else {
                    last.next = temp;
                    last = last.next;
                }
            }
        }
    }

    public void displayList() {
        System.out.print(this.val);
        ListNode last = this.next;
        while (last != null) {
            System.out.print(" -> " + last.val);
            last = last.next;
        }
        System.out.println();
    }
}
