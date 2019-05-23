package com.cn.practice.one;
/** 
 * @Description : 链表的节点类
 * @Author : lizhikang@youngyedu.com, 2019年5月16日 上午10:28:34
 * @Modified :lizhikang@youngyedu.com, 2019年5月16日
 */
public class Node {
	private int data;
	private Node next;
	
	public Node() {}
	public Node(int data) {
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}

