package com.cn.practice.five;
/** 
 * @Description : 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
n<=39
F(n)=F(n-1)+F(n-2)
 * @Author : lizhikang@youngyedu.com, 2019年5月16日 下午5:04:23
 * @Modified :lizhikang@youngyedu.com, 2019年5月16日
 */
public class FiveTest {
	public static void main(String[] args) {
		int fibonacci = Fibonacci(13);
		System.out.println(fibonacci);
	}
	
	public static int Fibonacci(int n) {
		int a=1,b=1,c=0;
		if(n<0) {
			return 0;
		}else if(n == a || n == b ) {
			return 1;
		}else {
			for(int i=2;i<n;i++) {
				c = a+b;
				b = a;
				a = c;
			}
		}
		
		return c;
    }
}

