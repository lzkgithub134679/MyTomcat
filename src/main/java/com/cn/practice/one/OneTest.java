package com.cn.practice.one;

import java.util.ArrayList;
import java.util.Stack;

/** 
 * @Description : 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * 一个链表，是由多个链表节点，连接组成，每个链表节点，都有一个数值，和下个节点的引用
 *
 * 
 * @Author : lizhikang@youngyedu.com, 2019年5月16日 上午10:15:59
 * @Modified :lizhikang@youngyedu.com, 2019年5月16日
 */
public class OneTest {
	public static void main(String[] args) {
		ListNode nodeList= new ListNode();
		nodeList.insertFirst(1);
		nodeList.insertFirst(2);
		nodeList.insertFirst(3);
		nodeList.insertFirst(4);
		nodeList.insertFirst(5);
		ArrayList<Integer> printListFromTailToHead = printListFromTailToHead(nodeList);
		System.out.println(printListFromTailToHead);
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(45);
        while(!stack.empty()) {
        	System.out.println(stack.pop());
        }
	}
	
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> inList = new ArrayList<>();
		Node node = listNode.getFirst();
		while(node != null) {
			inList.add(node.getData());
			node = node.getNext();
		}
		return inList;
    }
}

