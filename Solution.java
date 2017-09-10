package test;

import java.util.Scanner;
public class Solution {
	    /**
	     * ����������ζ����Ʊ��λ����ͬ������
	     * 
	     * @param m ����m
	     * @param n ����n
	     * @return ����
	     */
	    public int countBitDiff(int m, int n) {
	        int temp=(m^n);
	        int res=0;
	        while(temp!=0){
	        	res+=(temp&1);
	        	temp=(temp>>>1);
	        }
	        return res;
	    }
	    public static void main(String[] args) {
	    	Solution s=new Solution();
	        Scanner sc=new Scanner(System.in);
	        int m=sc.nextInt();
	        int n=sc.nextInt();
	        System.out.println(s.countBitDiff(m,n));
	    }
	}
