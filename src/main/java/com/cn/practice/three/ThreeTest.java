package com.cn.practice.three;

import java.util.Stack;

/** 
 * @Description : 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * @Author : lizhikang@youngyedu.com, 2019年5月16日 下午4:06:19
 * @Modified :lizhikang@youngyedu.com, 2019年5月16日
 */
public class ThreeTest {
	public static void main(String[] args) {
		Solution solu = new Solution();
		solu.push(1);
		solu.push(2);
		solu.push(3);
		solu.push(654);
		solu.push(657);
		solu.push(234);
		while(!solu.stack1.isEmpty()) {
			System.out.print(solu.pop()+",");
		}
	}
	
}

//栈,先进后出
class Solution {
  Stack<Integer> stack1 = new Stack<Integer>();
  Stack<Integer> stack2 = new Stack<Integer>();
  public void push(int node) {
	  stack1.push(node);
  }
  
  public int pop() {
	  while(!stack1.isEmpty()) {
		  stack2.push(stack1.pop());
	  }
	  int num =stack2.pop();
	  while(!stack2.isEmpty()){
          stack1.push(stack2.pop());
      }
	  return num;
  }
}