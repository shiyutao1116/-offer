import java.util.Deque;
import java.util.LinkedList;

/**
 * @author shiyutao
 * @create 2021-10-07 14:40
 */
public class T1 {
    /*用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead
    ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )*/
    public static void main(String[] args) {
        CQue cQue = new CQue();
        cQue.appendTail(1);
        cQue.appendTail(2);
        System.out.println(cQue.deleteHead());
        System.out.println(cQue.deleteHead());
        cQue.appendTail(3);
        cQue.appendTail(4);
        System.out.println(cQue.deleteHead());
        System.out.println(cQue.deleteHead());
        System.out.println(cQue.deleteHead());
    }


}
class CQue{
    Deque<Integer> stack1;
    Deque<Integer> stack2;
    public CQue() {
        stack1 = new LinkedList<Integer>();//创建栈
        stack2 = new LinkedList<Integer>();
    }

    public void appendTail( int value){
        stack1.push(value);
    }
    public int deleteHead(){
        if (stack2.isEmpty()&&stack1.isEmpty())
            return -1;
        if(stack2.isEmpty()){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();


    }
else {
       return stack2.pop();

    }


    }

}