/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeexample;

import java.util.ArrayList;

/**
 *
 * @author zhuan
 */
class TreeNode {
    Object value=null;
    TreeNode parent=null;
    ArrayList<TreeNode> children=new ArrayList();
    
    public TreeNode(Object value) {
        this.value=value;
    }
    
    public void addChild(TreeNode node) {
        this.children.add(node);
        node.parent=this;
    }
    
    public boolean removeByValue(Object v) {
        TreeNode node=findNodeByValue(v);
        if (node==null) return false;
        
        if (node.parent==null) {
            return false;
        } 
        
        node.parent.children.remove(node);
        return true;
    }

    private TreeNode findNodeByValue(Object v) {
        if (this.value.equals(v)) {
            return this;
        }
        
        for (TreeNode node:this.children) {
            TreeNode findNode=node.findNodeByValue(v);
            if (findNode!=null) return findNode;
        }
        
        return null;
    }
    
    @Override
    public boolean equals(Object o) {
        return this.value.equals(((TreeNode)o).value);
    }
}
