package ��ָoffer;

import java.util.ArrayList;
import java.util.List;

/**
 * �����������ַ����飬������е������ʽ
 * @author DELL
 *���õݹ�ķ�ʽ�����
 */
public class Combination {
	private List<Character> arr=new ArrayList<>();//���ڴ�����Ҫ��ӡ������
public void combination(char[] c){
	if(c.length==0)
		System.out.println("û��Ԫ��");//��׳��
	//�������λ���������ʽ
	for(int i=1;i<=c.length;i++){
		combine(c,0,i);
	}
}
/*
 * ���Ĵ���
 * c �����������
 * start ��ʼ��λ��
 * num ��Ҫ�Ĵ�ӡ������λ��
 */
private void combine(char[] c,int start,int num){
	if(num==0)//���������Ѿ���ӡ�����Ҫ��λ��
	{
		System.out.println(arr.toString());
		return;
	}
		if(start==c.length)
		return;//��ʼ�����Ѿ������˷�Χ
		arr.add(c[start]);//��ӵ�ǰԪ�أ���ʱ�ݹ��������ʽΪ����ģ����������֣����߲�����������
//		System.out.println(c[start]);
		//���������ֵ��������ʱ��λ����������Ѿ���һ�����ֽ����������������Ԫ������һ��
		combine(c,start+1,num-1);
		//�ݹ���ɺ��������
		arr.remove((Character)c[start]);
		//�ڶ�����������в�Ҫ��ǰԪ��
		combine(c,start+1,num);
}
/*
 * ����
 */
public static void main(String[] args) {
	char[] c={'l','o','v','e'};
	Combination com=new Combination();
	com.combination(c);
}
}
