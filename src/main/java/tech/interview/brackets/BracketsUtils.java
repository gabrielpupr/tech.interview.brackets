package tech.interview.brackets;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class BracketsUtils {
    
    private static final char[] roundBrackets = {'(', ')'};
    private static final char[] brackets = {'[', ']'};
    private static final char[] curlyBrackets = {'{', '}'};

    public static boolean isOpenBracketChar(char ch){
        return (roundBrackets[0] == ch || brackets[0] == ch || curlyBrackets[0] == ch);
    }

    public static boolean isCloseBracketChar(char ch){
        return (roundBrackets[1] == ch || brackets[1] == ch || curlyBrackets[1] == ch);
    }

    private static boolean isValidBracketChar(char openBracketChar, char closedBracketChar){
        if(openBracketChar == roundBrackets[0] && closedBracketChar == roundBrackets[1])
            return true;
        if(openBracketChar == brackets[0] && closedBracketChar == brackets[1])
            return true;
        if(openBracketChar == curlyBrackets[0] && closedBracketChar == curlyBrackets[1])
            return true;
        return false;
    }
    /**
     * A Simple yet more readable solution.
     * @param str
     * @return
     */
    public static boolean hasValidBrackets(String str){
        Stack<Character> stack = new Stack<>();
        if(str == null)
            return true;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(isOpenBracketChar(ch)){
                // We only wantto store open Bracket so that we can find the matching closing Bracket
                stack.push(ch);
            }
            else if(isCloseBracketChar(ch)){
                if(!stack.isEmpty()){
                    // Store into Character for reability
                    // So we found a closing Bracket, does it close the first item in the stack?
                    if(isValidBracketChar(stack.peek().charValue(), ch)){
                        stack.pop(); // we don't need to keep this in the stack anymore since its valid
                    }
                    else{
                        return false; // quick failure - its not a match so its not valid
                    }
                }
                else{
                    // the stack is empty and the stack only contains open Brackets
                    // In othere words, since we found a closing Bracket 1st its not valid
                    return false;
                }
            }
        }
        // so it should be safe to say its valid, but what if we never found the closing Bracket?
        // if said case was true then the stack should have something in it, therefore if the stack is empty then
        // its valid:
        return stack.isEmpty();
    }
    /**
     * An alternate solution that allows you to expand the list of valid Brackets however comments
     * are needed to help with readability.
     * @param str
     * @return
     */
    public static boolean hasValidBrackets_alt(String str){
        final Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Stack<Character> stack = new Stack<>();
        if(str == null)
            return true;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                // all keys are open Brackets
                // We only want to store open Bracket so that we can find the matching closing Bracket
                stack.push(ch);
            }
            else if(map.containsValue(ch)){ // all values in map are closed Brackets
                if(!stack.isEmpty()){
                    // Store into Character for reability
                    // So we found a closing Bracket, does it close the first item in the stack?
                    Character expectedMatch = map.get(stack.peek());
                    if(expectedMatch.charValue() == ch){
                        stack.pop(); // we don't need to keep this in the stack anymore since its valid
                    }
                    else{
                        return false; // quick failure - its not a match so its not valid
                    }
                }
                else{
                    // the stack is empty and the stack only contains open Brackets
                    // In othere words, since we found a closing Bracket 1st its not valid
                    return false;
                }
            }
        }
        // so it should be safe to say its valid, but what if we never found the closing Bracket?
        // if said case was true then the stack should have something in it, therefore if the stack is empty then
        // its valid:
        return stack.isEmpty();

    }
}