package ��ָoffer;

/**
 * ����һ���ַ���������ӡ��������ַ�����������ʽ,���е�ʵ��
 * @author HOU
 *ͨ��ʹ�õݹ�ķ�ʽ�����ַ�����Ϊ����������ӡ���´�ӡ��һ����ĸ���ڴ�ӡ�ڶ�����ĸ
 */
public class Permutation {
 public void permutation(String s){
	 if(s==null)
		 return;
	 char[] c=s.toCharArray();//��ԭ�����ַ���ת��Ϊ�ַ�����
	 permutation(c,0);
 }
 private void permutation(char[] s,int start){
//	 char[] res=new char[s.length];//���յ�����
	 if(start==s.length){
		 for(char c:s)
			 System.out.print(c);
		 System.out.println();//��ӡ
		 return;
	 }
	 //�������õ�Ԫ�أ�������ʹ�ù���Ԫ���滻����ǰ��start��λ��
	 for(int x=start;x<s.length;x++){
		 char tem=s[x];
		 s[x]=s[start];
		 s[start]=tem;//�滻����
		/* res[start]=tem;
		 System.out.println(res[start]+"   start   "+start);*/
		 permutation(s,start+1);//�ݹ����
		 tem=s[x];
		 s[x]=s[start];
		 s[start]=tem;//�滻���֮����Ҫ��ԭ�����ݻָ�,�Ա�����һ�����ݵĴ�ӡ
	 }
 }
/*
 * ����
 */
 public static void main(String[] args) {
	Permutation p=new Permutation();
	p.permutation("abc");
}
}
