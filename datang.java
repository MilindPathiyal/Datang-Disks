//Milind Pathiyal

// Disks of Datang and isPalindrome and isAlphabetical

public class datang
{
    public void driver()
    {
        datang(3, 'A', 'B', 'C');       
    }
    //Pre: Must have a valid base case, algorithm must be heading towards base case, and have at least 1 base case, there must be valid variables
    //Post: Follows the myth of the disks of datang
    public void datang(int numDisks, char from, char to, char extra)
    {
        if(numDisks > 0)
        {
            datang(numDisks-1, from, extra, to);
            System.out.println("Move disk from" + from + "to" + to);
            datang(numDisks-1, extra, to, from);
        }
    }
    //Pre: Must have a valid base case, algorithm must be heading towards base case, and have at least 1 base case, vaild variables
    //Post: Returns a boolean if the string parameter is a palindrome
    public static boolean isPalindrome(String s) 
    {
        int len = s.length();
        if (len <= 1) 
            return true;
        return (s.charAt(0) == s.charAt(len - 1)) &&
        isPalindrome(s.substring(1, len - 1));
    }
    //Pre:Must have a valid base case, algorithm must be heading towards base case, and have at least 1 base case, vaild variable
    //Post:Returns a boolean to whether letters in word are in alphabetical order
   public static boolean isAlphabetical(String word)
   {
       boolean order = false;
       if(word.length() < 2)
       {
           order = true;
        }
        else if(word.charAt(0) <= word.charAt(1))
        {
            return isAlphabetical(word.substring(1, word.length()));
        } 
       return order;
    }
}
       
       
       
       
       
       
    

    
    
    
    
    
    

        
        