package day15;

public class study01 {
	public static void main(String[] args) {
		 ���� a���� = new ����();
		 
		 a����.����("����̾�","Į"); 
		    // ����̾���(��) Į(��)�� �����մϴ�.
		 
		 a����.����("�ʸ�","â"); 
		    // �ʸ���(��) â(��)�� �����մϴ�.
		 
		 a����.����("��ũ","������"); 
		    // ��ũ(��) ������(��)�� �����մϴ�.
	}
}
class ���� {
	void ����(String name, String wp) {
		System.out.printf("%s" +"��(��)" + "%s" +"(��)�� �����մϴ�\n",name,wp);
	}	
}
