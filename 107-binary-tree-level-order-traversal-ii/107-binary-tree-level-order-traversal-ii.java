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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        addLevelWise(root,map,0);
        System.out.println(map);
        List<List<Integer>> result=new ArrayList<>();
        for(int i=map.size()-1;i>=0;i--){
            result.add(map.get(i)); 
        }
        return result;
    }
    public void addLevelWise(TreeNode root,Map<Integer,List<Integer>> map,int level){
        if(root==null){
            return;
        }
        List<Integer> temp=new ArrayList<>();
        List<Integer> def=map.getOrDefault(level,temp);
        def.add(root.val);
        map.put(level,def);
        addLevelWise(root.left,map,level+1);
        addLevelWise(root.right,map,level+1);
    }
}