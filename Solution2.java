package test;

import java.util.Scanner;

public class Solution2 {
	/**
     * ����git�������������ָ��
     * 
     * @param matrix ���ھ��󣬱�ʾgit����matrix[i][j] == '1' ���ҽ���git���е�i���͵�j���ڵ������ӣ��ڵ�0Ϊgit���ĸ��ڵ�
     * @param indexA �ڵ�A��index
     * @param indexB �ڵ�B��index
     * @return ����
     */
	public int getSplitNode(String[] matrix, int indexA, int indexB) {
		int[][] i=new int[matrix.length][matrix[0].length()];
		for(int x=0;x<i.length;x++){
			for(int y=0;y<i.length;y++){
				i[x][y]=matrix[x].charAt(y)-'0';//��Ԫ�ص��뵽��ά������ȥ
			}
		}
		boolean[] b=new boolean[matrix.length];
		int res=indexA;
		for(int x=indexA;x>=0;x--){
			if(i[x][indexA]==1){
			b[x]=true;//�ҵ����׽ڵ�
			indexA=x;//ת����ǰ�ڵ�
			}
		}
		//System.out.println(i[indexB][res]);
		if(i[indexB][res]==1)
			return indexB<res?indexB:res;
		for(int x=indexB;x>=0;x--){
			if(b[x]==true){//��������˸��׽ڵ�
				//System.out.println("����");
			return x;
			}
		}
		
		for(int x=0;x<b.length;x++){
			System.out.println(b[x]);
		}
		return 0;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String[] s1=s.split("]");
	String s2=s1[0].substring(1, s1[0].length());
	String[] matrix=s2.split(",");
	String s3=s1[1].substring(1,s1[1].length());
	String[] A=s3.split(",");
	int a=Integer.parseInt(A[0]);
	int b=Integer.parseInt(A[1]);
	Solution2 so=new Solution2();
	System.out.println(so.getSplitNode(matrix, a, b));
}
}
