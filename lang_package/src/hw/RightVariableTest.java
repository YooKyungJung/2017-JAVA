package hw;

class Rvariable {
	public static void isRightVariable(String s) {
		//�����
		String reserved[] ={"abstract", "const","finally","interface","return",
				"transient","assert","continue","float","long","short","true",
				"boolean","default","for","native","static","try","break","do",
				"goto","new","super","void","byte","double","if","null","switch",
				"volatile","cast","else","implements","package","synchronized",
				"while","catch","extends","import","private","this","char",
				"false","instanceof","protected","throw","class","final","int",
				"public","throws"};
		boolean result=false;
		if(s.length()<=10) {//���� ���� ����
			//����� �ִ��� Ȯ��
			for(int i=0; i<reserved.length; i++) {
				if(reserved[i]==s) {
					System.out.println(result); return;
				}
				
			//�ձ��� �̻��Ҷ�
			if(!(Character.isJavaIdentifierStart(s.charAt(0)))) {
					System.out.println(result); return;
			}
				
			//�ձ��� �빮��
			if(Character.isUpperCase(s.charAt(0))) {
					System.out.println(result); return;
			}
				
			//Ư��
			for(int j=0; j<s.length(); j++) { //�ĺ���
				if(!(Character.isJavaIdentifierPart(s.charAt(j)))) {
					System.out.println(result); return;
					}//if
				}//for
			
			}//for
			//���� �� �������� �� true �����
			result=true;
			System.out.println(result);
		} else System.out.println(result);//������ ���� ���� ����X
		
	}
}

public class RightVariableTest {
	public static void main(String[] args) {
		Rvariable.isRightVariable("fdsfafasdfasf");
		Rvariable.isRightVariable("9aaa"); 
		Rvariable.isRightVariable("aa  ");  
	}
}