package ��ָoffer;
/**
 * ����һ���ַ���������ӡ��������ַ�����������ʽ
 * @author HOU
 *ͨ��ʹ�õݹ�ķ�ʽ�����ַ�����Ϊ����������ӡ���´�ӡ��һ����ĸ���ڴ�ӡ�ڶ�����ĸ
 */
public class Permutation {
 public void permutation(String s){
	 if(s==null)
		 return;
	 permutation(s,0);
 }
 private void permutation(String s,int i){
	 String s1="";
	 for(int x=0;x<s.length();x++){
		 s+=s.charAt(x);
		 
	 }
 }
}
