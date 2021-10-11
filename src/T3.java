import java.util.Stack;

/**
 * @author shiyutao
 * @create 2021-10-08 13:24
 */
public class T3 {



}

 class resolve{
  public int[] reversePrint(ListNode head) {
    Stack<Integer> stack = new Stack<>();
    while (head!=null){
        stack.push(head.val);
        head=head.next;
    }
        int size=stack.size();
    int arr[]=new int[size];
    for (int i=0;i<size;i++){
        arr[i]=stack.pop();
    }
    return arr;


}}

