package com.tree;

//输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
public class verifySequenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        //什么叫是不是二叉搜索树的后序遍历
        if(sequence == null || sequence.length == 0){
            return false;
        }
        return VerifySquenceOfBST(sequence, 0, sequence.length - 1);
    }
    private boolean VerifySquenceOfBST(int [] sequence, int left, int right){
        if(left >= right){
            return true;
        }
        int val = sequence[right];
        int split = left;
        for(; split < right && sequence[split] < val; split++);
        for(int i = split; i < right; i++){
            if(sequence[i] < val){
                return false;
            }
        }
        return VerifySquenceOfBST(sequence, left, split - 1) && VerifySquenceOfBST(sequence, split, right - 1);
    }
}
