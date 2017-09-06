package ��ָoffer;

import java.util.Arrays;

/**
 * ��дһ�����������е�����k��Ԫ��
 * @author Hou
 *ʵ�ֲ�ͬ����
 */
public class FindMaxK {
/*
 * ����һ�����������ڿ�����˳�ķ���������һ��Ԫ�ؽ���������
 * �ҵ�kλ�õ�Ԫ�أ��ŵ��ܵ��������ٶȴﵽ��ȱ����Ҫ�ı�ԭ�������飬����k��Ԫ���п��ܲ����ź����
 */
	public int[] findK(int[] i,int k){
		int[] res =new int[k];
		if(i==null)
			res=null;
		if(i.length<=k)
			res=i;
		else
		{
			int start=0;
			int end=i.length-1;
			int middle=partition(i, start, end);
			if(middle!=k-1){
				if(middle>k-1){
					end=middle-1;
					middle=partition(i, start, end);
				}
				if(middle<k-1){
					start=middle+1;
					middle=partition(i, start, end);
				}
			}
			for(int j=0;j<k;j++){
				res[j]=i[j];
			}
		}
		return res;
	}
	/*
	 * ������һ�ַ���������ȡŦ��Ԫ,����
	 * ��ȡ����ȡ����Ԫ�ص��м�Ԫ��
	 */
	private int partition(int[] i,int start,int end){
		if(i.length<=0){
			System.out.println("���������������");
			return -1;
			}
		if(end<start){
			System.out.println("start���ܴ���end");
		}
		int middle=(start+end)>>>1;
		if(i[start]>i[middle])
			swap(i,start,middle);
		if(i[start]>i[end])
			swap(i,start,end);
		if(i[middle]>i[end])
			swap(i,middle,end);
		swap(i,middle,end-1);//���м�Ԫ���뵹���ڶ���Ԫ�ػ���
		int last=end-1;//�������Ľ���
		boolean b=end>start;
		end=end-2;//�ӵ���������Ԫ�ؿ�ʼ����
		while(b){
			while(i[end]>i[last])
				end--;
			while(i[start]<i[last])
				start++;
			b=end>start;
			if(b){
				swap(i,start,end);//����λ�ò���ȷ��Ԫ��
				start++;
				end--;
			}	
		}
		swap(i,last,start);//����Ŧ��Ԫ
		return start;
	}
	/*
	 * �����ı������е�Ԫ��λ��
	 */
	private void swap(int[] arr,int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void main(String[] args) {
		int[] i={5,6,3,6,7,3,6,97,7,3,6,3,4,4,543,1,3,43,3,43};
		FindMaxK f=new FindMaxK();
		System.out.println(Arrays.toString(f.findK(i, 7)));
	}
}
