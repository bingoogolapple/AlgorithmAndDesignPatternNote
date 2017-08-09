package cn.bingoogolapple.adpn.linkedlist;

import cn.bingoogolapple.adpn.model.Node;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:2017/8/9 下午2:45
 * 描述:单链表倒序
 */
public class Reverse {
    private Reverse() {
    }

    /**
     * 不使用已有集合单链表倒序
     *
     * @param header
     * @return
     */
    public static Node reverse(Node header) {
        // 如果链表为 null 或者只有一个结点直接返回
        if (header == null || header.next == null) {
            return header;
        }

        Node current = header;
        Node next = current.next;
        Node nextNext;

        while (next != null) {
            nextNext = next.next;

            next.next = current;

            // 如果是头结点和第二个结点交换，就把 header 结点的 next 置空
            if (current.equals(header)) {
                current.next = null;
            }

            current = next;
            next = nextNext;
        }

        return current;
    }
}
