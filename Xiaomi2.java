package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Xiaomi2 {


/*������������������ʵ����ĿҪ��Ĺ���
��Ȼ����Ҳ���Բ������������ģ����������ȫ�����Լ����뷨�� ^-^ 
******************************��ʼд����******************************/
    static boolean fun(String str) {
       //����ͨ��ɾ��һ���ַ��ж��Ƿ�Ϊ�������ķ������ж�
    	boolean res=false;
    	List<Character> list=new ArrayList<>();
    	for(int x=0;x<str.length();x++){//ת��Ϊ����
    		list.add(str.charAt(x));
    	}
    	List<Character> copy;
    	List<Character> rev;//��ת
    	boolean b=true;
    	for(int x=0;x<str.length();x++){
    		copy=list;
    		copy.remove(x);
    		rev=copy;
    		Collections.reverse(rev);
    		for(int y=0;y<rev.size();y++){
    			if(rev.get(x)!=copy.get(x)){
    				b=false;
    				break;
    			}
    		}
    		if(b){//�����˻����������
    			res=true;
    		return res;
    		}
    	}
return res;
    }
/******************************����д����******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean res;
            
        String _str;
        try {
            _str = in.nextLine();
        } catch (Exception e) {
            _str = null;
        }
  
        res = fun(_str);
        System.out.println(String.valueOf(res ? 1 : 0));  
    }
}
