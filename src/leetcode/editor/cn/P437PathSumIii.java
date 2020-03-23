//给定一个二叉树，它的每个结点都存放着一个整数值。
//
// 找出路径和等于给定数值的路径总数。
//
// 路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
//
// 二叉树不超过1000个节点，且节点数值范围是 [-1000000,1000000] 的整数。
//
// 示例：
//
// root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
//
//      10
//     /  \
//    5   -3
//   / \    \
//  3   2   11
// / \   \
//3  -2   1
//
//返回 3。和等于 8 的路径有:
//
//1.  5 -> 3
//2.  5 -> 2 -> 1
//3.  -3 -> 11
//
// Related Topics 树


package leetcode.editor.cn;

//Java：路径总和 III
public class P437PathSumIii {
    public static void main(String[] args) {
        Solution solution = new P437PathSumIii().new Solution();
        // TO TEST
        //解答失败: 测试用例:[10,5,-3,3,2,null,11,3,-2,null,1] 8
        // 测试结果:0 期望结果:3 stdout:
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
        int paths = 0;

        public int pathSum(TreeNode root, int sum) {
            if (root == null) {
                return 0;
            }
            //题目说不会超过1000个
            pathSum(root, sum, new int[1000], 0);
            return paths;
        }

        public void pathSum(TreeNode root, int sum,int[] array,int index) {
            if (root == null) {
                return ;
            }

            array[index] = root.val;
            int temp = 0;
            for (int i = index; i >= 0; i--) {
                temp += array[i];
                if (temp == sum) {
                    paths++;
                }
            }

            // 这里不要直接index++，不然会影响下一步的pathSum
            pathSum(root.left, sum, array, index+1);
            pathSum(root.right, sum, array, index+1);

        }
        /*public int pathSum(TreeNode root, int sum) {
            if (root == null) {
                return 0;
            }
            extendPath(root,sum);
            return paths;

        }

        private void extendPath(TreeNode root, int sum) {
            if (root == null) {
                return ;
            }

            addPath(root,sum);
            extendPath(root.left, sum);
            extendPath(root.right, sum);
        }


        private void addPath(TreeNode root, int sum) {
            if (root == null) {
                return ;
            }

            sum -= root.val;
            if (sum == 0) {
                paths++;
            }

            addPath(root.left, sum);
            addPath(root.right, sum);
        }*/
    }
//leetcode submit region end(Prohibit modification and deletion)

}
