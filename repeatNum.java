package ��ָoffer;
/**
 * ��������������Ƿ�����ظ�����
 * @author Hou
 * ʱ�临�Ӷ�O(n)���ռ临�Ӷ�ΪO(1)
 * ֻӦ���������е�����С�ڸ�����ĳ���
 */
public class repeatNum {
public static void repeat(int[] i){
	int l=i.length;
	if(l<=1){
		System.out.println("û���ظ�����");
	}
	else{
		for(int x=0;x<l;x++){
			int temp=i[x];//��¼��ǰi��x��Ϊ����
			if(temp!=x){//�����λ�ò�Ϊ����Ӧ����������иĻ�
				if(i[temp]==temp)
					System.out.println(temp+"���ظ�����");
				else{
				i[x]=i[temp];
				i[temp]=temp;
				}
			}
		}
	}
}
public static void main(String[] args) {
	int[] i={1,1,2,3,3,5};
	repeat(i);
}
}
