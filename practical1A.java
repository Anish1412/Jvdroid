import java.util.Scanner;

class Practical1A
{
    int total_alphabets = 26, key = 3;
    String encrypted = " ", decrypted = " ";
    char ch;
    public String encrypt(String plain)
    {
        for (int i = 0; i < plain.length(); i++)
        {
            ch = plain.charAt(i);
            if (ch == ' ')
                encrypted += "-";
            else if (ch >= 'A' && ch <= 'Z')
            {
                if (ch <= 'Z' - key)
                    encrypted += String.valueOf((char)(ch + key));
                else
                    encrypted += String.valueOf((char)(ch - (total_alphabets - key)));
            }
            else
                encrypted += String.valueOf(ch);
        }
        return encrypted;
    }
    public String decrypt(String cipher)
    {
        for (int i = 0; i < cipher.length(); i++)
        {
            ch = cipher.charAt(i);
            if (ch == '-')
                decrypted += " ";
            else if (ch >= 'A' && ch <= 'Z')
            {
                if (ch >= 'A' + key)
                    decrypted += String.valueOf((char)(ch - key));
                else
                    decrypted += String.valueOf((char)(ch + (total_alphabets - key)));
            }
            else
                decrypted += String.valueOf(ch);
        }
        return decrypted;
    }
    public static void main(String[] args)
    {
        String plaintext, ciphertext;
        Practical1A cc = new Practical1A();
        System.out.println("Enter text: ");
        plaintext = new Scanner(System.in).nextLine().toUpperCase();
        ciphertext = cc.encrypt(plaintext);
        System.out.println("\nEncrypted text: " + ciphertext);
        plaintext = cc.decrypt(ciphertext);
        System.out.println("\nDecrypted text: " + plaintext);
    }
}
