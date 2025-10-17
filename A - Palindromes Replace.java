import java.util.Scanner;
 
public class codeforce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        int n = chars.length;
        
        boolean possible = true;
        for (int i = 0; i < n / 2; i++) {
            int j = n - 1 - i; 
            
            if (chars[i] == '?' && chars[j] == '?') {
                chars[i] = 'a';
                chars[j] = 'a';
            } else if (chars[i] == '?') {
                chars[i] = chars[j];
            } else if (chars[j] == '?') {
                chars[j] = chars[i];
            } else if (chars[i] != chars[j]) {
                possible = false;
                break;
            }
        }
        
        if (n % 2 == 1 && chars[n / 2] == '?') {
            chars[n / 2] = 'a'; 
        }
        
        if (!possible) {
            System.out.println(-1);
        } else {
            System.out.println(new String(chars));
        }
        
        sc.close();
    }
}
