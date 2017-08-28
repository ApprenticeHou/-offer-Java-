package ��ָoffer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


/**
 * �ж�һ�������Ƿ������һ�����е�һ��·��(������ֻ����������)
 * @author HOU
 *ͨ��һ������ջ�����ݽṹ���洢���ݣ���ͨ�����������������
 */
public class IsSumTree {
	int current=0;
	ArrayList<BinaryTreeNode> s=new ArrayList<BinaryTreeNode>();
public void isSum(BinaryTreeNode b,int sum){
	if(b==null){
		System.out.println("�����鲻����");
		return;
	}
	
	current+=b.value;
	s.add(b);
//	System.out.println(s.size());
	if(current==sum){
		Iterator<BinaryTreeNode> i=s.iterator();
		while(i.hasNext()){
		BinaryTreeNode b1=i.next();
			System.out.println(b1.value);
		}
	}
	else if(current<sum){
		if(b.left!=null)
			isSum(b.left, sum);
		if(b.right!=null)
			isSum(b.right, sum);
	}

	current-=b.value;
	s.remove(b);
}
public static void main(String[] args) {
	IsSumTree is=new IsSumTree();
	BinaryTreeNode b=new BinaryTreeNode(0);
	LinkedList<BinaryTreeNode> s=new LinkedList <>();
	s.add(b);
	for(int i=1;i<10;i++){
		BinaryTreeNode b1=s.remove();
		b1.left=new BinaryTreeNode(i);
		b1.right=new BinaryTreeNode(++i);
		if(b1.left!=null)
			s.add(b1.left);
		if(b1.right!=null)
			s.add(b1.right);
	}
	is.isSum(b, 15);
}
}
