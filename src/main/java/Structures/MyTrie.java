package Structures;

/*
    Trie from : https://www.baeldung.com/trie-java


    And :

    https://github.com/eugenp/tutorials/blob/master/data-structures/src/main/java/com/baeldung/trie/Trie.java

 */

import java.util.HashMap;
import java.util.Map;

class TrieNode {

    private final Map<Character, TrieNode> children = new HashMap<>();

    private boolean endOfWord;

    Map<Character, TrieNode> getChildren() {
        return children;
    }

    boolean isEndOfWord() {
        return endOfWord;
    }

    void setEndOfWord(boolean endOfWord) {
        this.endOfWord = endOfWord;
    }
}


public class MyTrie {

    // Usual Single Pointer to the root
    private TrieNode root;

    // Constructor
    MyTrie() {
        root = new TrieNode();
    }

    // Insert
    public void insert(String word) {
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            current = current.getChildren().computeIfAbsent(word.charAt(i), c -> new TrieNode());
        }
        current.setEndOfWord(true);
    }

    boolean delete(String word) {
        return delete(root, word, 0);
    }

    boolean containsNode(String word) {
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.getChildren().get(ch);
            if (node == null) {
                return false;
            }
            current = node;
        }
        return current.isEndOfWord();
    }

    boolean isEmpty() {
        return root == null;
    }

    private boolean delete(TrieNode current, String word, int index) {
        if (index == word.length()) {
            if (!current.isEndOfWord()) {
                return false;
            }
            current.setEndOfWord(false);
            return current.getChildren().isEmpty();
        }
        char ch = word.charAt(index);
        TrieNode node = current.getChildren().get(ch);
        if (node == null) {
            return false;
        }
        boolean shouldDeleteCurrentNode = delete(node, word, index + 1) && !node.isEndOfWord();

        if (shouldDeleteCurrentNode) {
            current.getChildren().remove(ch);
            return current.getChildren().isEmpty();
        }
        return false;
    }


    /*
        Test it
     */
    public static void main(String...args) {

        MyTrie trie = new MyTrie();

        trie.insert("Programming");
        trie.insert("is");
        trie.insert("a");
        trie.insert("way");
        trie.insert("of");
        trie.insert("life!");


        System.out.println(trie.containsNode("3"));
        System.out.println(trie.containsNode("vida"));
        System.out.println(trie.containsNode("life!"));
        System.out.println(trie.containsNode("Programming"));

        trie.delete("Programming");

        System.out.println(trie.containsNode("Programming"));
    }


    //@Test
    //public void givenATrie_WhenAddingElements_ThenTrieNotEmpty() {
    //    Trie trie = createTrie();
    //
    //    assertFalse(trie.isEmpty());
    //}


}
