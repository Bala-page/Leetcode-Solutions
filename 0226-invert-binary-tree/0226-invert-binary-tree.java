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
    public TreeNode invertTree(TreeNode root) {
        TreeNode temp=root;
        if(root==null){
            return null;
        }
        root.right=invertTree(root.right);
        root.left=invertTree(root.left);
        swap(root,root.left,root.right);
        return root;
    }
    public static TreeNode swap(TreeNode root,TreeNode l,TreeNode r){
        TreeNode temp=r;
        root.right=l;
        root.left=temp;
        return root;
    }
}