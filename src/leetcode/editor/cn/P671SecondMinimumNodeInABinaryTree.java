//给定一个非空特殊的二叉树，每个节点都是正数，并且每个节点的子节点数量只能为 2 或 0。如果一个节点有两个子节点的话，那么这个节点的值不大于它的子节点的值。
//
//
// 给出这样的一个二叉树，你需要输出所有节点中的第二小的值。如果第二小的值不存在的话，输出 -1 。
//
// 示例 1:
//
//
//输入:
//    2
//   / \
//  2   5
//     / \
//    5   7
//
//输出: 5
//说明: 最小的值是 2 ，第二小的值是 5 。
//
//
// 示例 2:
//
//
//输入:
//    2
//   / \
//  2   2
//
//输出: -1
//说明: 最小的值是 2, 但是不存在第二小的值。
//
// Related Topics 树


package leetcode.editor.cn;

//Java：二叉树中第二小的节点
public class P671SecondMinimumNodeInABinaryTree {
    public static void main(String[] args) {
        Solution solution = new P671SecondMinimumNodeInABinaryTree().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        int secondMinVal = Integer.MAX_VALUE;
        boolean flag = false;
        public int findSecondMinimumValue(TreeNode root) {
            if (root == null || (root.left == null && root.right == null)) {
                return -1;
            }
            getTarget(root, root.val);

            return flag?secondMinVal:-1;
        }


        public void getTarget(TreeNode root,int firstMinVal) {
            if (root == null) {
                return;
            }

            if (root.val > firstMinVal) {
                secondMinVal = Math.min(secondMinVal, root.val);
                flag = true;
            }

            getTarget(root.left,firstMinVal);
            getTarget(root.right, firstMinVal);

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
