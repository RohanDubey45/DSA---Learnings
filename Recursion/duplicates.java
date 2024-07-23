public class duplicates {

    public static void removeDuplicates(String str, StringBuilder newStr, int i, boolean[] map)
    {
        // if we reach the last element + 1 ie. length of string it means we have traversed the whole string 
        // so now we will print the newStr so this is the base case
        if (i==str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(i);

        // Duplicate character case :-
        if (map[currChar-'a'] == true) {
            // duplicate character so we will not add it to newStr and move to next char
            removeDuplicates(str, newStr, i+1, map);
        }

        // New character case :-
        else{
            map[currChar-'a'] = true;
            // new character we will add it to newStr and go for next char ie. i+1
            removeDuplicates(str, newStr.append(currChar), i+1, map);
        }

    }
    public static void main(String[] args) {

        String str = "appnnacollege";  //apncoleg

        StringBuilder sb = new StringBuilder("");
        boolean[] map = new boolean[26];
        int idx = 0;
        
        removeDuplicates(str, sb, idx, map);


        // To find the index position of the character
        // int[] map1 = new int[26];
        // System.out.println(map1['c'-'a']);
    }
}

// map['a'-'a']