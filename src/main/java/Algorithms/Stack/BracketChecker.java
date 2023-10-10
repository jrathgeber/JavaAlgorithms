/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Stack;

import java.io.IOException;

public class BracketChecker {
  private String input;

  public BracketChecker(String in) {
    input = in;
  }

  public void check() {
    int stackSize = input.length(); 
    Stack theStack = new Stack(stackSize); 

    for (int j = 0; j < input.length(); j++)
    {
      char ch = input.charAt(j);
      switch (ch) {
      case '{': // opening symbols
      case '[':
      case '(':
        theStack.push(ch); // push them
        break;

      case '}': // closing symbols
      case ']':
      case ')':
        if (!theStack.isEmpty()) // if stack not empty,
        {
          char chx = theStack.pop(); // pop and check
          if ((ch == '}' && chx != '{') || (ch == ']' && chx != '[')
              || (ch == ')' && chx != '('))
            System.out.println("Error: " + ch + " at " + j);
        } else
          // prematurely empty
          System.out.println("Error: " + ch + " at " + j);
        break;
      default: // no action on other characters
        break;
      }
    }
    if (!theStack.isEmpty())
      System.out.println("Error: missing right delimiter");
  }

  public static void main(String[] args) throws IOException {
    String input = "{Java [Source] (and) {[(Support)]}}";
    BracketChecker theChecker = new BracketChecker(input);
    theChecker.check(); 
  }

}

class Stack {
    
  private int maxSize;

  private char[] stackArray;

  private int top;

  public Stack(int max) {
    maxSize = max;
    stackArray = new char[maxSize];
    top = -1;
  }

  public void push(char j) {
    stackArray[++top] = j;
  }

  public char pop() {
    return stackArray[top--];
  }

  public char peek() {
    return stackArray[top];
  }

  public boolean isEmpty() {
    return (top == -1);
  }
  
}