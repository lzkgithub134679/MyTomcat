package com.cn.practice.seven;
/** 
 * @Description :一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * n=0    1种
 * n=1    1种
 * n=2    2种 
 * n=3    4种     
 * n=4    8种
 * n=5    16种
 * 算法是n = 
 * @Author : lizhikang@youngyedu.com, 2019年5月17日 上午9:08:44
 * @Modified :lizhikang@youngyedu.com, 2019年5月17日
 */
public class SevenTest {
	
	public static void main(String[] args) {
		int jumpFloorII = JumpFloorII(4);
		System.out.println(jumpFloorII);
	}
		
	public static int JumpFloorII(int target) {
		if(target < 0) {
			return 0;
		}else if(target == 0 || target == 1) {
			return 1;
		}else {
			int sum = 1;
			for(int i=1;i<target;i++) {
			    sum +=JumpFloorII(i);
			}
			return sum;
		}
    }
}	

