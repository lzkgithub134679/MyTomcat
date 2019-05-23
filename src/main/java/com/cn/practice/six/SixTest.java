package com.cn.practice.six;
/** 
 * @Description : 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）
 * 
 * @Author : lizhikang@youngyedu.com, 2019年5月16日 下午5:21:53
 * @Modified :lizhikang@youngyedu.com, 2019年5月16日
 */
public class SixTest {
	
	public static void main(String[] args) {
		System.out.println(JumpFloor(4));
	}
	
	public static int JumpFloor(int target) {
		if(target<= 0) {
			return 0;
		}else if(target ==1 ) {
			return 1;
		}else if(target ==2 ) {
			return 2;
		}else {
		int a = 1 ,b = 2,temp =0;
		for(int i =2;i<target;i++) {
			temp = a+b;
			a = b;
			b = temp;
		}
		return temp;
		}
    }
}

