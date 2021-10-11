import java.util.Deque;
import java.util.LinkedList;

/**
 * @author shiyutao
 * @create 2021-10-07 15:06
 */
public class T2 {

   /* 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的
    min 函数在该栈中，调用min、push 及 pop 的时间复杂度都是 O(1)。*/
   public static void main(String[] args) {

   }
}
class MinStack {
    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public MinStack() {
    stack1=new LinkedList<Integer>();
    stack2=new LinkedList<Integer>();
    }

    public void push(int x) {
    stack1.push(x);


    if(stack2.isEmpty()||stack2.peek()>=x)
        stack2.push(x);

    }

    public void pop() {

    if (stack1.pop().equals(stack2.peek()))
    stack2.pop();
    }
    public int top() {
     return    stack1.peek();
    }

    public int min() {
        return    stack2.peek();
    }

}