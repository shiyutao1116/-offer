import java.util.HashMap;

/**
 * @author shiyutao
 * @create 2021-10-08 21:29
 */
public class T5 {


}
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
class Solution {
    HashMap<Node,Node> hashMap = new HashMap<>();
    public Node copyRandomList(Node head) {
        if (head==null){
            return null;
        }
    if(!hashMap.containsKey(head)){
        Node newnode = new Node(head.val);
        hashMap.put(head,newnode);
        newnode.next=copyRandomList(head.next);
        newnode.random=copyRandomList(head.random);

    }

       return  hashMap.get(head);
        }

    }
