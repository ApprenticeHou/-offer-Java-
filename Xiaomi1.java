package test;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Xiaomi1 {


/*������������������ʵ����ĿҪ��Ĺ���
��Ȼ����Ҳ���Բ������������ģ����������ȫ�����Լ����뷨�� ^-^ 
******************************��ʼд����******************************/
    static long fun(long x) {
        long res=1;
        List<Long> l=new ArrayList<>();//�����洢��Ҫ�������ֵ�����
        if(x<1)
        	return 1;
        int y=0;
        while(y==0){
        	y=(int) (x>>>1-1);
        	if(x%y==0)
        		break;
        	else{
        		y=0;
        	}
        }
        //�ҵ�x���������
        if(y==0){//����Ϊ�����������
        	res=x+1;
        }
        else//��Ϊ�����������
        {
        	res=y+1;
        }
        return res;
    }
/******************************����д����******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long res;
            
        long _x;
        _x = Long.parseLong(in.nextLine().trim());
  
        res = fun(_x);
        System.out.println(String.valueOf(res));  

    }
}
