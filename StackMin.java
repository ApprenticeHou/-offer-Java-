package ��ָoffer;

import java.util.Stack;
/**
 * ����һ������ջ�е���СԪ�صĳ��򣬲�����ʱ�临�Ӷ�ΪO(1)
 * @author DELL
 *����һ�������ռ佫���ڴ洢��СԪ��
 */
public class StackMin {
	Stack<Integer> s=new Stack<Integer>();
	Stack<Integer> min=new Stack<Integer>();
@SuppressWarnings("null")
public int min(){
	int t;
	if(min.isEmpty())
		t=(Integer) null;
	else 
		t=min.pop();
	return t;
}
/*
 * ������ѹ��ջ��
 */
public void push(int t){
	s.push(t);
	//�������Ԫ��С��ջ�Ķ���Ԫ�صģ�����Ԫ��ѹ��ջ��
	if(min.isEmpty()||t<min.peek())
		min.push(t);
	//��û����ԭ����СԪ��ѹ��
	else
		min.push(min.peek());
}
public int pop(){
	if(s.isEmpty()||min.isEmpty()){
		System.out.println("�Ѿ�����");
		return 0;
	}
	else
	{
	s.pop();
	return min.pop();
	}
	
}
}
