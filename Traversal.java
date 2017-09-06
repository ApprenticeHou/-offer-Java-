package ��ָoffer;

import java.util.LinkedList;

/**
 * ���������������,����������������
 * @author DELL
 *���õݹ����
 */
public class Traversal {
	/*
	 * �������
	 */
public void Preorder(BinaryTreeNode b){
	if(b==null){
		System.out.println("�ڵ�Ϊ��");
	}
	System.out.print(b.value);
	if(b.left!=null)
		Preorder(b.left);
	if(b.right!=null)
		Preorder(b.right);
}
/*
 * �������
 */
public void Order(BinaryTreeNode b){
	if(b==null){
		System.out.println("������Ϊ��");
		return;
	}
	//System.out.println("�������");
	if(b.left!=null)
		Order(b.left);
	System.out.print(b.value);
	if(b.right!=null)
		Order(b.right);
}
/*
 * ��������
 */
public void Postorder (BinaryTreeNode b){
	if(b==null){
		System.out.println("������Ϊ��");
		return ;
	}
	if(b.left!=null)
		Postorder(b.left);
	if(b.right!=null)
		Postorder(b.right);
	System.out.print(b.value);
}
/*
 * ʵ��
 */
public static void main(String[] args) {
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
	Traversal p=new Traversal();
	p.Preorder(b);
	System.out.println("�������");
	p.Order(b);
	System.out.println("�������");
	p.Postorder(b);
	System.out.println("��������");
}
}
