package day14;

public class study00 {
	public static void main(String[] args) {
		���� a���� = new ����();
	    a����.����();
	    a����.�����ϴ�();
	    
	    System.out.println("==õ�տ���==");
	    õ�տ��� aõ�տ��� = new õ�տ���();
	    aõ�տ���.����();
	    aõ�տ���.�����ϴ�();
	    System.out.println("==�����==");
	    ����� a����� = new �����();
	    a�����.����();
	    a�����.�����ϴ�();
	    System.out.println("==������==");
	    ������ a������ = new ������();
	    a������.����();
	    a������.�����ϴ�();
	    System.out.println("==��2����==");
	    ��2���� a��2���� = new ��2����();
	    a��2����.����();
	    a��2����.�����ϴ�();
	}
}
class ���� {
	void ����() {
		System.out.println("������ ������ ���ư��ϴ�!!!");
	}
	void �����ϴ�() {
		System.out.println("������ �������� �����մϴ�");
	}
}
class õ�տ��� extends ���� {
}
class ����� extends ���� {
}
class ������ extends ���� {
	void ����() {
	    System.out.println("�������� �� �� �����. �̤�");
	  }
}

class ��2���� extends ������ {
	void ����() {
	    System.out.println("��2������ �� �� �����. �̤�");
	  }
}