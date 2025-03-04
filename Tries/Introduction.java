// package Tries;


// ***----->>>> insert and search function can be ask directly by various companies <<<<<-----

public class Introduction {
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;

        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }

    public static Node root=new Node();

    //Insert function
    public static void insert(String word){
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if (curr.children[idx]==null) {
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }

    //search function
    public static boolean search(String key){
        Node curr=root;
        for(int level=0;level<key.length();level++){
            int idx=key.charAt(level)-'a';
            if (curr.children[idx]==null) {
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.eow=true;
    }
    public static void main(String[] args) {
        String words[]={"there","a","the","their","any","thee"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }

        System.out.println(search("thee"));
        System.out.println(search("thor"));
    }
}
