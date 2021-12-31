package LeetCode;

import java.util.PriorityQueue;
import java.util.Queue;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){this.val = val;}
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
        pq.add(1);
        pq.add(2);
        pq.add(3);
        while (pq.peek() != null){
            System.out.println(pq.poll());
        }
    }
}
