package JavaAdvanced;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Google");
        list.add("Runoob");
        list.add("Taobao");
        list.add("Weibo");
        System.out.println("创建了一个LinkedList：" + list);

        list.addFirst("Wiki");
        System.out.println("使用addFirst方法在头部添加了\"Wiki\"：" + list);

        list.addLast("Wiki");
        System.out.println("使用addLast方法在尾部添加了\"Wiki\"：" + list);

        list.removeFirst();
        System.out.println("使用removeFirst方法删除了头节点：" + list);

        list.removeLast();
        System.out.println("使用removeLast方法删除了尾部节点：" + list);

        System.out.println("使用getLast方法得到表尾节点：" + list.getLast());

    }
}
