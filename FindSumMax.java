package ��ָoffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * �ҵ������������������ּӺ͵����ֵ����Ȼ���а�������
 * @author HOU
 *���õ��Ƕ�̬�滮�ķ���
 */
public class FindSumMax {
public int finsum(List<Integer> i){
	if(i==null)
		return 0;
	int sum=0;
	int res=0x80000000;
	System.out.println(res);
	for(int x:i){
		if(sum<=0)//����Ӻ�С������Ҫ��ֵ
			sum=x;
		else
			sum+=x;//����Ӻ�û��С����������仹�����ü�ֵ��������ϵ�ǰֵ
		if(sum>res)
			res=sum;//����Ӻʹ��ڼ�¼�����Ӻ����滻
	}
	return res;
}
public static void main(String[] args) {
	FindSumMax fs=new FindSumMax();
	List<Integer> l=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()){
		l.add(sc.nextInt());
	}
	System.out.println(fs.finsum(l));
}
}
