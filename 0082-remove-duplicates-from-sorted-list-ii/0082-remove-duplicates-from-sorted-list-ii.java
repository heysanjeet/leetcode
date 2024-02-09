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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null || head.next==null) return head;
        
        
       ListNode dummyHead= new ListNode(0);
        dummyHead.next=head;
        
        ListNode pre=dummyHead;
        ListNode curr=head;
        
        while(curr !=null){
            if(curr.next !=null && curr.val==curr.next.val){
              while(curr.next !=null && curr.val==curr.next.val){
                  curr=curr.next;
              }
             pre.next=curr.next;
            }else{
                pre=curr;
            }
            curr=curr.next;
        }
       return dummyHead.next;
    }
}