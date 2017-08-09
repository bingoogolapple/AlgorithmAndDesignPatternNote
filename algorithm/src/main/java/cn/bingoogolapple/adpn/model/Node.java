package cn.bingoogolapple.adpn.model;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:2017/8/9 下午2:50
 * 描述:
 */
public class Node {
    public Node next;
    public int value;

    public Node() {
    }

    public Node(Node next, int value) {
        this.next = next;
        this.value = value;
    }
}
