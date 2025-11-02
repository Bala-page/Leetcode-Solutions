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
    List<Integer> list=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        return check(root,1);
    }
    public List<Integer> check(TreeNode root ,int level){
        if(root==null){
            return list;
        }
        if(level>list.size()){
            list.add(root.val);
        }
        check(root.right,level+1);
        check(root.left,level+1);
        return list;
    }
}