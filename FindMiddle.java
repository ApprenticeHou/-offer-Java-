package ��ָoffer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
/**
 * ��дһ���ҵ��������λ���ķ�������������ĳ���Ϊ������ѡ���м�����֣���Ϊż����ѡ���м���������ȡƽ��
 * @author DELL
 *δ�������������������ʱ�临�Ӷ�ΪO(1)�����ҵ�ʱ�临�Ӷ�ΪO(n)�����ǵ������򻮷ֵ������㷨
 *����ʹ����������������洢��������ʱ�临�Ӷ�ΪO(n)�����ҵĸ��Ӷ�ΪO(1)
 *Ҳ����ʹ���������������ʱ�临�Ӷ�ΪO(n)������ͨ������ָ��ָ���м����ҵ���λ����ʱ�临�Ӷ�ΪO(1)
 *Ҳ����ʹ��ƽ��AVL��������������������һ���������ʱ�临�Ӷ�ΪO(logn)�����ҵ�ʱ�临�Ӷ�ΪO(1)
 *���һ�ַ���Ϊʹ��һ�����Ѻ�һ����С�ѣ������洢Ԫ�أ����������洢ǰ�벿��Ԫ�أ���С�������洢��벿��Ԫ��
 */
public class FindMiddle {
	static List<Integer> a=new ArrayList<>();
	private static PriorityQueue<Integer> min;
	private static PriorityQueue<Integer> max;
	public void insert(int i){
		a.add(i);
		//ż����������
		if((a.size()&1)==1){
			//�����������С�ѵ�Ԫ����Ҫ����
			if(min.size()>0&&i>min.peek()){
				min.add(i);//������С��
				i=min.poll();
				//�Ƚ���СԪ���³�һ����
			}
			max.add(i);
		}
		//���������
		else
		{
			if(max.size()>0&&max.peek()>i){
				max.add(i);
				i=max.poll();
			}
			min.add(i);
		}
		//System.out.println(max.size()+"--"+"min"+min.size()+"--"+"a"+a.size());
	}
	/*
	 * �����õ�O(1)��ż��ȡƽ��������ȥ�м�
	 */
	public int findMiddle(){
		System.out.print(a.size());
		if(max==null)
			return 0;
		int res;
		if((a.size()&1)==0){
			res=(max.peek()+min.peek())>>>1;
			System.out.println("ż��");
		}
		else{
			res=max.peek();
			System.out.println("��������");}
		return res;
	}
public static void main(String[] args) {
	List<Integer> l=new ArrayList<>();
	FindMiddle fd=new FindMiddle();
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()){
		l.add(sc.nextInt());
	}
	Iterator<Integer> i=l.iterator();
	 min=new PriorityQueue<>(l.size()>>>1);
	 max=new PriorityQueue<>((l.size()+1)>>>1,new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO �Զ����ɵķ������
				return o2-o1;
			}
			
		});
	while(i.hasNext())
	fd.insert(i.next());
	System.out.println(fd.findMiddle());
}
}
