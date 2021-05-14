//Question: https://www.hackerrank.com/challenges/30-queues-stacks/problem



public class Solution {
    Stack<Character> st= new Stack<>();
    Queue<Character> qu = new LinkedList<>();
 
    void pushCharacter(char ch){
        st.push(ch);
    }
    void enqueueCharacter(char ch){
        qu.add(ch);
    }
    char popCharacter(){
       return st.pop();
    }
    char dequeueCharacter(){
        return qu.remove();
    }


