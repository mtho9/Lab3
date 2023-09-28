import java.util.Scanner;
import java.util.Stack;

/**
 * class myXMLValidator can take a IStack or Stack<String> and check if it is in valid XML format
 * @author maxrogers
 * @version sep 27 2023
 */

public class myXMLValidator  implements IXMLValidator{

	
	public boolean validateXML(IStack stack) {
		Scanner sc = new Scanner((Readable) stack);
		Stack<String> s1 = new Stack<String>();
		while(sc.hasNext())
			s1.push(sc.next());
		Stack<String> s2 = new Stack<String>();	
		for(int i = 0; i < s1.size(); i++) {
			if(!s1.peek().startsWith("<"))
				return false;
			if(s1.peek().contains("</")&&s1.peek().contains(">"));
				s2.push(s1.pop());
		}
//		System.out.println(s2.toString());
		
		//checks to see if stack is even or odd
		if(s2.size()%2==0) {
			for(int i = 0; i < s1.size(); i++) {
				if(s1.peek().contains("<")&&s1.peek().contains(">"));
					s2.pop();
			}
		}
		//if odd, removes the string with tags <> and </>
		else
			s2.pop();
			for(int i = 0; i < s1.size(); i++) {
				if(s1.peek().contains("<")&&s1.peek().contains(">"));
					s2.pop();
		}
//		System.out.println(s2.toString());
		if(s2.empty())
			return true;		
		return false;
	}

	public static boolean validateXML(Stack<String> s1) {
		Stack<String> s2 = new Stack<String>();	
		for(int i = 0; i < s1.size(); i++) {
			if(!s1.peek().startsWith("<"))
				return false;
			if(s1.peek().contains("</")&&s1.peek().contains(">"));
				s2.push(s1.pop());
		}
//		System.out.println(s2.toString());
		
		//checks to see if stack is even or odd
		if(s2.size()%2==0) {
			for(int i = 0; i < s1.size(); i++) {
				if(s1.peek().contains("<")&&s1.peek().contains(">"));
					s2.pop();
			}
		}
		//if odd, removes the string with tags <> and </>
		else
			s2.pop();
			for(int i = 0; i < s1.size(); i++) {
				if(s1.peek().contains("<")&&s1.peek().contains(">"));
					s2.pop();
		}
//		System.out.println(s2.toString());
		if(s2.empty())
			return true;		
		return false;
	}

	@Override
	public boolean validateXML(IStack stack, String inputXML) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
