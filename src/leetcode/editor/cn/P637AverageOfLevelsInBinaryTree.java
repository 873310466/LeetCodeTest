
import leetcode.editor.cn.TreeNode;

import	java.util.ArrayList;//给定一个非空二叉树, 返回一个由每层节点平均值组成的数组.
//
// 示例 1:
//
// 输入:
//    3
//   / \
//  9  20
//    /  \
//   15   7
//输出: [3, 14.5, 11]
//解释:
//第0层的平均值是 3,  第1层是 14.5, 第2层是 11. 因此返回 [3, 14.5, 11].
//
//
// 注意：
//
//
// 节点值的范围在32位有符号整数范围内。
//
// Related Topics 树


package leetcode.editor.cn;

import java.util.List;

//Java：二叉树的层平均值
public class P637AverageOfLevelsInBinaryTree{
    public static void main(String[] args) {
        Solution solution = new P637AverageOfLevelsInBinaryTree().new Solution();
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        if (root == null) {
            list.add(0.0);
            return list;
        }

        if (root.left == null && root.right == null) {
            list.add(root.val * 1.0);
            return list;
        }







    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
