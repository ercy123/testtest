package java0524;
import java.util.Scanner;
public class MorsePractice1 {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("���ܾ �Է����ֽÿ�.");
		String s = sc.nextLine();
		
		String mose[] = {".-", "-...", "-.-.","-..",".","..-.","--.","....","..",".---",
				"-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
				".--","-..-","-.--","--.."};
		char alphabet[] = new char[s.length()];		// 
		System.out.println();
		for(int i = 0; i < s.length(); i++)
		{
			
			alphabet[i] = s.charAt(i); // 
			if(" ".equals(Character.toString(alphabet[i])))
			{
				mose[i] = Character.toString(alphabet[i]);
				System.out.print(mose[i]);
			}
			else if(alphabet[i] >= 'A' && alphabet[i] <= 'Z') // 
				System.out.print(mose[alphabet[i]-'A']);
			else if(alphabet[i] >= 'a' && alphabet[i] <= 'z')
				System.out.print(mose[alphabet[i]-'a']);
			
		}
	}
}