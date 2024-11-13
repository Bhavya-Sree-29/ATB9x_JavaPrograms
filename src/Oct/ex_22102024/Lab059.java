package Oct.ex_22102024;
import java.util.*;

public class Lab059 {
    public static void main(String[] args) {
        //2. Count vowels and consonants in a String.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.next();
        int vowel = 0;
        int consonant = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                System.out.println(ch+ " is vowel");
                vowel++;
            }
            else
            {
                System.out.println(ch+ " is consonant");
                consonant++;
            }
        }
    }
}
