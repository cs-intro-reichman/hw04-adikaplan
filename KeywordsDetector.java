public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for(int i = 0 ; i < sentences.length; i++){
            String line = lowerCase(sentences[i]);
            for(int j = 0; j < keywords.length; j++){
                if(contains(line, keywords[j]) == true){
                    System.out.println(sentences[i]);

                }
            }
        }
    }



    public static String lowerCase(String str) {
       if( str == null){
        return "";
       }
        String strLower = "";
        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
               strLower = strLower + (char)(str.charAt(i) + 32);
            }else{
                strLower = strLower + (str.charAt(i));
            }
        }
        return strLower;
    }

    public static boolean contains(String str1, String str2) {
        if(str2.length() == 0){
            return true;
        }
        if(str1 == null){
            return false;
        }
        if(str1.length() < str2.length()){
            return false;
        }
        for(int i =0; i<str1.length(); i++){
            if (str1.charAt(i) == str2.charAt(0)){
               if(stringMatch(str1,str2,i) == true){
                return true;
               }
            } 
            }
        return false;
    }



    public static boolean stringMatch(String str1, String str2, int startIndex) {
        if((str1.length()-startIndex) < str2.length()){
            return false;
        }
        int j=1;
        for(int i = startIndex+1; i < startIndex + str2.length(); i++){
            if(str1.charAt(i) != str2.charAt(j)){
                return false;
            }
            j++;
        }
    return true;
}
}



