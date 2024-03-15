package Searching.linearSearching;

public class StringSearch {
    public static void main(String[] args) {
        String name = "Ramanathan";
        char target = 't';
        System.out.println(search(name, target));
    }

    // to find the element ?
    static boolean search(String name, int target){
        if(name.length() == 0){
            return false;
        }
        for(int i = 0 ; i < name.length() ; i++){
            if(target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }

    // For Each loop
    static boolean search1(String name, int target){
        if(name.length() == 0){
            return false;
        }
        for(char ch : name.toCharArray()){      // string array to char array
            if(target == ch){
                return true;
            }
        }
        return false;
    }

    // to find the index position in string
    static int search2(String name, int target){
        if(name.length() == 0){
            return -1;
        }
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == target){
                return i;
            }
        }
        return -1;
    }
}
