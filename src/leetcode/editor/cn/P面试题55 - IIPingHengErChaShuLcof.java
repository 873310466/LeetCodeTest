//输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
//
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
//
// 限制：
//
//
// 1 <= 树的结点个数 <= 10000
//
//
// 注意：本题与主站 110 题相同：https://leetcode-cn.com/problems/balanced-binary-tree/
//
//
// Related Topics 树 深度优先搜索


package leetcode.editor.cn;
//Java：平衡二叉树
public class P面试题55 - IIPingHengErChaShuLcof{
    public static void main(String[] args) {
        Solution solution = new P面试题55 - IIPingHengErChaShuLcof().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;翻转二叉树
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    /*boolean flag = true;

    public boolean isBalanced(TreeNode root) {
        getHeight(root);
        return flag;

    }


    public int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = getHeight(node.left);
        int right = getHeight(node.right);

        if (Math.abs(left - right) > 1) {
            flag = false;
            return 0;
        }

        return Math.max(left,right) + 1;


    }*/
    // 自顶向下（效率低）
    public boolean isBalanced(TreeNode root) {
        if (root == null ) {
            return true;
        }

        int left = getHeight(root.left);
        int right = getHeight(root.right);

        return Math.abs(left - right)<=1 && isBalanced(root.left) && isBalanced(root.right);

    }


    public int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
