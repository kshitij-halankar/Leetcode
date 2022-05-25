/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int s=0;
    int l=0,h=0;
    TreeNode t1=null;
    public int rangeSumBST(TreeNode root, int low, int high) {
        l=low;
        h=high;
        t1=root;
        test(root);
        return s;
    }
    public TreeNode test(TreeNode t) {
        
        if(t!=null){
            if(t.val < l){
                return test(t.right);
            }
            if(t.val > h){
                return test(t.left);
            }
            s+=t.val;
            test(t.left);
            test(t.right);
            return null;
        }else{
            return null;
        }
    }
}
