public class SubStr {
    
    public static String subString(String str, int si, int ei){
        String subStr = "";
        for(int i=si; i<ei; i++){
           subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        // String str = "Helloworld";
        // System.out.println(subString(str, 0, 5));

        // System.out.println(str.substring(5, 10));

        // print largest string 
        String[] items = {"Table", "zebra", "Fan", "Mirror"};

        String largest = items[0];

        for(int i=1; i<items.length; i++)
        {
            if(largest.compareTo(items[i])<0){
                largest = items[i];
            }
        }
        System.out.println(largest);
        



    }
}
