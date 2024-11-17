public class Main {

    static class Node{
        Node[] children;
        boolean eow;
        public Node(){
            children = new Node[26];  // a to z
            for(int i=0; i<26; i++){
                children[i] = null;  // initialize the array
            }
            eow = false;
        }
    }
    static Node root = new Node();
    public static void insert(String word){
        Node curr = root;

        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx] == null){
                //add new node
                curr.children[idx] = new Node();
            }

            if(i == word.length() - 1){
                //end of word
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }

    public static boolean search(String key){
        Node curr = root;

        for(int i=0; i<key.length(); i++){
            int idx = key.charAt(i) - 'a';

            if(curr.children[idx] == null){
                return false;
            }

            if(i == key.length()-1 && curr.children[idx].eow == false){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    //Word Break Problem
    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }

        for(int i=1; i<=key.length(); i++){
            String firstPart = key.substring(0, i);
            String secondPart = key.substring(i);

            if(search(firstPart) && wordBreak(secondPart)){
                return true;
            }
        }
        return false;
    }

    //Starts With Prefix
    public static boolean startsWith(String prefix){
        Node curr =root;
        for(int i=0; i<prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
//        String words[] = {"the", "there", "their", "a", "any"};
//        for(int i=0; i< words.length; i++){
//            insert(words[i]);
//        }
//
//        System.out.println(search("their"));
//        System.out.println(search("thor"));
//        System.out.println(search("an"));

        //Word Break Problem
//        String word[] = {"i", "like","sam", "samsung"};
//        String key = "ilikesamsung";
//
//        for(int i=0; i<word.length; i++){
//            insert(word[i]);
//        }
//        System.out.println(wordBreak(key));

        //Start with prefix problem
        String word[] = {"a", "app", "man", "mango", "woman"};
        String prefix = "ap";
        for(int i=0; i< word.length; i++){
            insert(word[i]);
        }
        System.out.println(startsWith(prefix));
    }
}