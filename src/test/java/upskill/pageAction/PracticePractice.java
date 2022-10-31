package upskill.pageAction;

public class PracticePractice {

	public static void main(String[] args) {
		
		String str= "institute";
		StringBuilder sd1= new StringBuilder();
		
		str.chars().distinct().forEach(c->sd1.append((char)c));
	
		System.out.println(sd1);
	}

}
