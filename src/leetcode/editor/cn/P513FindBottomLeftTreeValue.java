
import leetcode.editor.cn.TreeNode;

import	java.util.LinkedList;
import	java.util.Queue;//给定一个二叉树，在树的最后一行找到最左边的值。
//
// 示例 1:
//
//
//输入:
//
//    2
//   / \
//  1   3
//
//输出:
//1
//
//
//
//
// 示例 2:
//
//
//输入:
//
//        1
//       / \
//      2   3
//     /   / \
//    4   5   6
//       /
//      7
//
//输出:
//7
//
//
//
//
// 注意: 您可以假设树（即给定的根节点）不为 NULL。
// Related Topics 树 深度优先搜索 广度优先搜索


package leetcode.editor.cn;
//Java：找树左下角的值
public class P513FindBottomLeftTreeValue{
    public static void main(String[] args) {
        Solution solution = new P513FindBottomLeftTreeValue().new Solution();
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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            root = queue.poll();
            if (root.right != null) queue.offer(root.right);
            if (root.left != null) queue.offer(root.left);
        }
        return root.val;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
