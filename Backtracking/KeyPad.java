public class KeyPad {

    // Exponential Complexity

    static void letterCombinations(String str, char[][] L){
        int len = str.length();
        if (len == 0) {
            System.out.println("");
            return;
        }
        recursion(L, 0, len, new StringBuilder(""), str);
    }

    static void recursion(char[][] L, int i, int len, StringBuilder sb, String str){
        if (i == len) {
            System.out.println(sb.toString());
            return;
        }

        char[] letters = L[Character.getNumericValue(str.charAt(i))];
        for(int j=0; j<letters.length; j++){
            sb.append(letters[j]); 
            recursion(L, i+1, len, sb, str); 
            sb.deleteCharAt(sb.length()-1); 
        }
    }

    public static void main(String[] args) {

        char[][] L = {
            {}, {}, {'a','b','c'}, {'d','e','f'}, {'g','h','i'},
            {'j','k','l'}, {'m','n','o'}, {'p','q','r','s'}, {'t','u','v'}, {'w','x','y','z'},
        };

        letterCombinations("23", L);
    }
}

// public class KeyPad {

//     // Method to initiate letter combinations for the given input string
//     static void letterCombinations(String str, char[][] L){
//         int len = str.length();
//         if (len == 0) {
//             System.out.println("");
//             return;
//         }
//         // Start the recursion with an empty StringBuilder
//         recursion(L, 0, len, new StringBuilder(""), str);
//     }

//     // Recursive method to generate letter combinations
//     static void recursion(char[][] L, int i, int len, StringBuilder sb, String str){
//         // Base case: if the current index reaches the length of the string, print the combination
//         if (i == len) {
//             System.out.println(sb.toString());
//             return;
//         }

//         // Get the corresponding letters for the current digit
//         char[] letters = L[Character.getNumericValue(str.charAt(i))];
//         // Loop through each letter and recurse
//         for (int j = 0; j < letters.length; j++) {
//             sb.append(letters[j]);  // Append the current letter to the StringBuilder
//             recursion(L, i + 1, len, sb, str);  // Recurse to the next digit
//             sb.deleteCharAt(sb.length() - 1);  // Backtrack by removing the last letter
//         }
//     }

//     public static void main(String[] args) {
//         // Define the mapping of digits to letters
//         char[][] L = {
//             {}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'},
//             {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}
//         };

//         // Test with the input "23"
//         letterCombinations("23", L);
//     }
// }
