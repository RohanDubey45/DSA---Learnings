public class StringCompression {

    // public static String CompressedString(String str){
    //     String newstr = "";
    //     for(int i=0; i<str.length(); i++)
    //     {
    //         Integer count = 1;
    //         while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
    //             count++;
    //             i++;
    //         }
    //         newstr += str.charAt(i);
    //         if (count > 1) {
    //             newstr += count.toString();
    //         }
    //     }
    //     return newstr;
    // }
    public static void main(String[] args) {

        String str = "abcdefg";
        System.out.println(CompressedString2(str));

    }
    
    public static String CompressedString2(String str)
    {

        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<str.length(); i++)
        {
            Integer count = 1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count>1) {
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

}
