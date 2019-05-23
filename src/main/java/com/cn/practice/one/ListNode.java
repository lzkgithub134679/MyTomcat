package com.cn.practice.one;
/** 
 * @Description : 链表类
 * @Author : lizhikang@youngyedu.com, 2019年5月16日 上午10:17:35
 * @Modified :lizhikang@youngyedu.com, 2019年5月16日
 */
public class ListNode {
	//第一个节点
	private Node first;
	public ListNode() {
		this.first = null;
	}
	//判断链表是否为空
	public boolean isEmpty() {
		return this.first == null;
	}
	//插入链表头节点
	public void insertFirst(int data) {
		Node node = new Node(data);
		node.setNext(this.first);
		this.first = node;
	}
	
	 //删除链头
    public void deleteFirst(){
        this.first = this.first.getNext();
    }
	
	  public void displayLinkList(){
	        Node current = this.first;//从链头开始遍历
	        while (current != null){
	            //当前链结点不为空即输出内容
	            System.out.println(current.getData());
	            //将当前链结点指向下一个链结点
	            current = current.getNext();
	        }
	    }
	public Node getFirst() {
		return first;
	}
	public void setFirst(Node first) {
		this.first = first;
	}
	  
}

