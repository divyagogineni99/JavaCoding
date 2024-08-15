package JavaConcepts;

import java.util.Stack;

public class Strings {
    public static void main(String[] args) {
        String name = "abba";
        //int indexValue=5;
        //int indexValue=1;
        //ToUpperCase(name,indexValue);
        //String result = ToUpperCase(name,indexValue);
        //String result = reverseString1(name);
        //System.out.println(result);
        boolean result = palindromeUSingStack("nanan");
        //String n = reverseStringInplace("divya");
        System.out.println(result);
    }

    public static boolean palindromeUSingStack(String s){
        Stack<Character> stack=new Stack<Character>();
        char[] charArray = s.toCharArray();
        for(int i=0;i<charArray.length; i++){
            stack.push(charArray[i]);
        }
        System.out.println(stack);
        int stackSize=stack.size();
        for(int j=0;j<stackSize;j++){
            charArray[j]=stack.peek();
            stack.pop();
        }
        System.out.println(stack);

        String newString = new String(charArray);
        if(newString.equals(s)){
            return true;
        }
        return false;
    }

    public static boolean palindrome(String s) {
        if (s == null || s.length() <= 1) {
            return false;
        }
        char[] stringArray = s.toCharArray();
        int arrayLength = stringArray.length;
        for (int i = 0; i < arrayLength / 2; i++) {
            char temp = stringArray[i];
            stringArray[i] = stringArray[arrayLength - (i + 1)];
            stringArray[arrayLength - (i + 1)] = temp;
        }
        String reverseStrings = new String(stringArray);
        if(s.equals(reverseStrings)){
            return true;
        } else{
            return false;
        }
    }
    public static boolean palindromeWhile(String s) {
        if (s == null || s.length() <= 1) {
            return false;
        }
        char[] stringArray = s.toCharArray();
        int arrayLength = stringArray.length;
        int i = 0;
        while(i<arrayLength/2){
            char temp = stringArray[i];
            stringArray[i] = stringArray[arrayLength - (i + 1)];
            stringArray[arrayLength - (i + 1)] = temp;
            i++;
        }
        String reverseStrings = new String(stringArray);
        if(s.equals(reverseStrings)){
            return true;
        }else{
            return false;
        }
    }
    public static String reverseString1(String name) {
        if (name == null || name.length() <= 1) {
            return name;
        }
        char[] nameArray = name.toCharArray();
        int arrayLength = nameArray.length;
        for (int i = 0; i < arrayLength / 2; i++) {
            char temp = nameArray[i];
            nameArray[i] = nameArray[arrayLength - (i + 1)];
            nameArray[arrayLength - (i + 1)] = temp;
        }
        String reverseStrings = new String(nameArray);
        return reverseStrings;

    }

    public static String ToUpperCase(String name, int indexValue) {
        if (name == null || name.length() == 0 || indexValue >= name.length() || indexValue < 0) {
            return name;
        }
        char[] nameArray = name.toCharArray();
        nameArray[indexValue] = Character.toUpperCase(nameArray[indexValue]);
        String updatedString = new String(nameArray);
        return updatedString;
    }

    public static String reverseString(String name) {
        if (name == null || name.length() == 0) {
            return name;
        }
        char[] nameArray = name.toCharArray();
        char[] newArray = new char[nameArray.length];
        int j = 0;
        for (int i = nameArray.length - 1; i >= 0; i--) {
            newArray[j] = nameArray[i];
            j++;
        }
        String reverseStrings = new String(newArray);
        return reverseStrings;
    }

    public static String reverseStringInplace(String name){
        if(name == null || name.length()==0){
            return name;
        }
        char[] nameArray=name.toCharArray();
        int first =0, last=nameArray.length-1;
        int mid= (0+ (nameArray.length-1))/2;
        for(int i=first;i<=mid;i++){
            char temp= nameArray[first];
            nameArray[first] = nameArray[last];
            nameArray[last]=temp;
            first++;
            last--;
        }
        String reverseName= new String(nameArray);
        return reverseName;
    }


}

