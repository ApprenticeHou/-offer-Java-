package ��ָoffer;
/**
 * ��һ�����������ת��Ϊһ���ź�˳���˫������
 * @author HOU
 *ͨ��ʹ���ڵ����ڵ�Ϊ�������������ڵ㣬�ҽڵ�Ϊ������������С�ڵ㡣
 *ͨ��ʹ�õݹ�ķ�����ʵ��
 */
public class TreeToLinkedList {
	/*
	 * �����������ת��Ϊ˫������
	 */
public BinaryTreeNode convert(BinaryTreeNode b){
	BinaryTreeNode head=null;
	BinaryTreeNode last=null;
	if(b!=null){
		conConvert(b, last);
	}
	//������˵�Ԫ�ر�����������
	if(b.left!=null&&b!=null)
		head=b.left;
	return head;
}
/*
 * ���Ĵ���ͬ����¼�źõ�˳���¼�����һ��Ԫ�أ�Ȼ����������һ��Ԫ��
 */
private void conConvert(BinaryTreeNode b,BinaryTreeNode last){
	if(b==null)
		return;
	if(b.left!=null)
		conConvert(b.left,last);
	b.left=last;//���ұߵ���СԪ������������һ��Ԫ������
	last=b;//�ı��������һ��Ԫ��
	if(last!=null)
		last.right=b;//ͬ����˫������
	if(last.right!=null)//����������
		conConvert(b.right, last);
}
}
