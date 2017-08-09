package cn.bingoogolapple.adpn.linkedlist;

import cn.bingoogolapple.adpn.model.Node;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:2017/8/9 下午2:48
 * 描述:
 */
public class ReverseTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverse() throws Exception {
        Node header = initLinkedList();

        System.out.print("反转前：");
        printNode(header);
        header = Reverse.reverse(header);
        System.out.println();
        System.out.print("反转后：");
        printNode(header);
    }

    private Node initLinkedList() {
        int maxValue = 6;
        Node current = null;
        Node next = null;
        for(int i = 1; i <= maxValue; i++) {
            current = new Node(next, i);
            next = current;
        }
        return current;
    }

    private void printNode(Node header) {
        if (header == null) {
            return;
        }

        System.out.print(header.value);

        Node current = header.next;
        while(current != null) {
            System.out.print(current.value);
            current = current.next;
        }
    }

}