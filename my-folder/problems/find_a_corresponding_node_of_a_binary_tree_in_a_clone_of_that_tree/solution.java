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
    TreeNode g=null;
    TreeNode t1 = null;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        g=target;
        test2(cloned);
        return t1;
    }
    
    public TreeNode test2(TreeNode t){
        if(t!=null){
            if(t.val == g.val) {
                t1=t;
                return t;
            }
            if(t.left!=null){
                test2(t.left);
            }
            if(t.right!=null){
                test2(t.right);
            } 
        }
        return null;
    }
}