package test;

import java.util.Scanner;

/**
 * ����һ��ʮ���Ƶ�������number��ѡ�������ȥ��һ�������֣�ϣ������������������ɵ���������� 
 * @author DELL
 *������ѡǰ��λ����ԭ��
 */
public class SouHu0 {
	/**
	 * �µ��㷨�����ȿ��ǵ�һλ����
	 * @param s
	 * @param n
	 */
	public static void getMaxNum1(String s,int n){
		int[] i=new int[s.length()];
		for(int x=0;x<i.length;x++){
			i[x]=s.charAt(x)-'0';
		}
		int[] res=new int[s.length()-n];
		int start=0,end=n;
		int max=0;
		int x=0;
		/*
		 *�ҵ�ǰnλ�����е�������֣���Ϊ��λ���� 
		 */
		for(;x<n+1&&start<=end;x++){
			max=getMax(i, start, end++);
			res[x]=i[max];
		//	System.out.println(res[x]+"res"+"start"+start);
			start=max+1;
		}
		max++;
		for(;x<res.length;x++,max++){
			res[x]=i[max];
		}
		for(int y=0;y<res.length-1;y++){
			System.out.print(res[y]+" ");
		}
		System.out.println(res[res.length-1]);
	}

/**
 * �ҵ���������СԪ�ص�λ��
 * @param i ����
 * @param start ��ʼ��
 * @param end ��ֹ��
 * @return �����������СԪ�ص�λ��
 */
private static int getMax(int[] i,int start,int end){
	if(end>i.length||i==null||i.length==1||start>=end)
		return start;
	int x=start;
	for(int j=start+1;j<=end;j++){
		if(i[x]<i[j])
			x=j;
	}
	for(int j=x;j<=end;j++){
		if(i[j]==i[x]&&i[getMax(i, x+1, end)]<i[getMax(i, j+1, end)]){
			x=j;
		}
	}
	return x;
}
/**
 * ��������Ԫ�ص�λ��
 * @param i
 * @param x
 * @param y
 */
private static void swap(int[] i,int x,int y){
	int temp=i[x];
	i[x]=i[y];
	i[y]=temp;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int n=Integer.parseInt(sc.nextLine());
	getMaxNum1(s, n);
}
}
