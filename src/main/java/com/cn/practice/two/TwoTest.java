package com.cn.practice.two;

/**
 * @Description : 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 *              假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}
 *              和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * @Author : lizhikang@youngyedu.com, 2019年5月16日 上午11:28:22
 * @Modified :lizhikang@youngyedu.com, 2019年5月16日
 */
public class TwoTest {
	public static void main(String[] args) {
		int [] pre ={1,2,4,7,3,5,6,8};
		int [] in ={4,7,2,1,5,3,8,6};
		reConstructBinaryTree(pre,in);
	}

	public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		
		return null;
	}
}
