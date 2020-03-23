//计算给定二叉树的所有左叶子之和。
//
// 示例：
//
//
//    3
//   / \
//  9  20
//    /  \
//   15   7
//
//在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
//
//
// Related Topics 树


package leetcode.editor.cn;
//Java：左叶子之和
public class P404SumOfLeftLeaves{
    public static void main(String[] args) {
        Solution solution = new P404SumOfLeftLeaves().new Solution();
        // TO TEST
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
    // 记录左叶子节点值总和
    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        // 如果根节点为null，则直接返回 0
        if (root == null) {
            return 0;
        }

        // 如果根节点无子节点，则直接返回 0
        if (root.left == null && root.right == null) {
            return 0;
        }

        // 进行递归
        leftSum(root);

        // 递归处理完，返回sum即可
        return sum;
    }

    // 计算左叶子节点值总和
    // 核心思想是树的前序遍历 即 左中右
    public void leftSum(TreeNode node) {
        // 如果当前节点为null ，直接return 即可
        if (node == null) {
            return ;
        }
        // 取出当前节点的左右节点，为了方便调用
        TreeNode left = node.left;
        TreeNode right = node.right;



        // 根据前序遍历，再进行中间节点（即当前节点）的处理
        // 这里判断 左节点不为null 且 左节点无子节点 即可判断该 左节点是左叶子节点
        if (left != null && left.left == null && left.right == null) {
            // 符合条件即进行累加
            sum += left.val;
        }
        // 根据前序遍历，先进行左边节点的处理
        leftSum(left);
        // 根据前序遍历，最后进行右边节点（即当前节点）的处理
        leftSum(right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
