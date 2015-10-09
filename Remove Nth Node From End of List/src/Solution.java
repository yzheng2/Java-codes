
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode begin = new ListNode(0);
    	ListNode early = begin;
        ListNode late = begin;
        late.next = head;

        
        for(int i=1; i<=n+1; i++){
        	early = early.next;
        }
        
        while(early != null){
        	early = early.next;
        	late = late.next;
        }
        
        late.next = late.next.next;
        return begin.next;
        
    }
}