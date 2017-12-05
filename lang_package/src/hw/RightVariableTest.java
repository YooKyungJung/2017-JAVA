package hw;

class Rvariable {
	public static void isRightVariable(String s) {
		//예약어
		String reserved[] ={"abstract", "const","finally","interface","return",
				"transient","assert","continue","float","long","short","true",
				"boolean","default","for","native","static","try","break","do",
				"goto","new","super","void","byte","double","if","null","switch",
				"volatile","cast","else","implements","package","synchronized",
				"while","catch","extends","import","private","this","char",
				"false","instanceof","protected","throw","class","final","int",
				"public","throws"};
		boolean result=false;
		if(s.length()<=10) {//변수 길이 제한
			//예약어 있는지 확인
			for(int i=0; i<reserved.length; i++) {
				if(reserved[i]==s) {
					System.out.println(result); return;
				}
				
			//앞글자 이상할때
			if(!(Character.isJavaIdentifierStart(s.charAt(0)))) {
					System.out.println(result); return;
			}
				
			//앞글자 대문자
			if(Character.isUpperCase(s.charAt(0))) {
					System.out.println(result); return;
			}
				
			//특문
			for(int j=0; j<s.length(); j++) { //식별자
				if(!(Character.isJavaIdentifierPart(s.charAt(j)))) {
					System.out.println(result); return;
					}//if
				}//for
			
			}//for
			//조건 다 충족했을 때 true 찍어줌
			result=true;
			System.out.println(result);
		} else System.out.println(result);//변수명 길이 제한 충족X
		
	}
}

public class RightVariableTest {
	public static void main(String[] args) {
		Rvariable.isRightVariable("fdsfafasdfasf");
		Rvariable.isRightVariable("9aaa"); 
		Rvariable.isRightVariable("aa  ");  
	}
}