/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeexample;

/**
 *
 * @author zhuan
 */
public class TreeExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TreeNode tree=new TreeNode(0);
        
        TreeNode node1=new TreeNode(1);
        tree.addChild(node1);
        TreeNode node2=new TreeNode(2);
        tree.addChild(node2);
        
        TreeNode node3=new TreeNode(3);
        node1.addChild(node3);
        
        TreeNode node4=new TreeNode(4);
        node1.addChild(node4);
        
        TreeNode node5=new TreeNode(5);
        node2.addChild(node5);
        
        TreeNode node6=new TreeNode(6);
        node2.addChild(node6);
        
        tree.removeByValue(2);
        
        
        
        
    }
    
}
