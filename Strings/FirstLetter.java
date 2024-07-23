public class FirstLetter {

    // all the first characters in the string should be uppercase 
    public static void upperCase(String str)
    {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch); 

        for(int i=1; i<str.length(); i++)
        {
            if (str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
               sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
        
    }
    public static void main(String[] args) {
        // String str = "my name is rohan dubey and i am a graduated student.";
        // upperCase(str);
       
        // StringBuilder sb  = new StringBuilder("hello");
        // String s = " world";
        // sb.append(s);
        // System.out.println(sb.toString());

        // String str1 = "narendra";
        // System.out.println(str1.toUpperCase()); // converts full string to uppercase

        // converts first character to uppercase
        // char ch = Character.toUpperCase(str1.charAt(0)); 
        // System.out.println(ch);     

        // converted last character of string to uppercase 
        // System.out.println(Character.toUpperCase(str1.charAt(str1.length()-1))); 



       


    }
}
