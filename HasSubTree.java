package ��ָoffer;
/**
 * ���ڼ���һ�����Ƿ�������һ����
 * @author DELL
 *ͨ�� �ݹ�ĵ������ж�
 */
public class HasSubTree {
public boolean hasTree(BinaryTreeNode b1,BinaryTreeNode b2){
	boolean res=false;
	if(b1!=null&&b2!=null){
	if(b1.value==b2.value)
		res=hasSub(b1,b2);//���������ͬ��Ԫ����ʼ�ж�������Ƿ���ͬ
//��û�����������ӣ�ͨ���ݹ鷽ʽʵ��	
	if(!res)
		hasTree(b1.left,b2);
	if(!res)
		hasTree(b1.right,b2);
	}
	return res;
}
public boolean hasSub(BinaryTreeNode b1,BinaryTreeNode b2){
	if(b2==null)
		return true;//С��Ϊ����϶�������˵�������Ѿ��������
	if(b1==null)
		return false;//��������Ϊ�գ����Ǵ���Ϊ�գ���һ����������
	if(b1.value==b2.value)
		return hasSub(b1.left, b2.left)&&hasSub(b1.right,b2.right);
	//ͨ���ݹ�ĵ�����ʵ������
	return false;
}
}
/*
 * ��������
 */
class BinaryTreeNode{
	int value;
	public BinaryTreeNode(int i){
		value=i;
	}
	BinaryTreeNode left;
	BinaryTreeNode right;
}