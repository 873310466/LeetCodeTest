//给定一个二叉树，判断它是否是高度平衡的二叉树。
//
// 本题中，一棵高度平衡二叉树定义为：
//
//
// 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
//
//
// 示例 1:
//
// 给定二叉树 [3,9,20,null,null,15,7]
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
//
// 返回 true 。
//
//示例 2:
//
// 给定二叉树 [1,2,2,3,3,null,null,4,4]
//
//        1
//      / \
//     2   2
//    / \
//   3   3
//  / \
// 4   4
//
//
// 返回 false 。
//
//
// Related Topics 树 深度优先搜索


package leetcode.editor.cn;
//Java：平衡二叉树
public class P110BalancedBinaryTree{
    public static void main(String[] args) {
        Solution solution = new P110BalancedBinaryTree().new Solution();
        // TO TEST
        TreeNode node = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);
        TreeNode node6 = new TreeNode(3);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(4);
        node.left = node1;
        node.right = node6;
        node1.left = node3;
        node1.right = node2;
        node3.right = node4;
        node3.right = node5;
        int left = solution.judgeHeight(node.left);
        int right = solution.judgeHeight(node.right);
        System.out.println(left);
        System.out.println(right);
        System.out.println(Math.abs(left-right)<=1);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public boolean isBalanced(TreeNode root) {
            if (root == null) {
                return true;
            }

            if (root.left == null && root.right == null) {
                return true;
            }

            int left = judgeHeight(root.left);
            int right = judgeHeight(root.right);
            return Math.abs(left-right)<=1 &&isBalanced(root.left)&&isBalanced(root.right);



        }
        public int judgeHeight(TreeNode node) {
            if (node == null) {
                return 0;
            }
            return Math.max(judgeHeight(node.left), judgeHeight(node.right)) + 1;
        }
    }


//leetcode submit region end(Prohibit modification and deletion)

}
