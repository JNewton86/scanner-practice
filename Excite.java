public class Excite {
    public static void main(String[] args){
        //take argument inputs
        String allWords = String.join("-", args);
        //identify last characters to repeat
        int indexStart = allWords.lastIndexOf(str: "-");
        
        String lastChars = allWords.substring(allWords.length() - 1, allWords.length());      
        // String excitedAllWords = allWords.toUpperCase() + "!!!";
        String excitedAllWords = allWords.toUpperCase() + lastChar + lastChar;
        System.out.println(excitedAllWords);
    }
}