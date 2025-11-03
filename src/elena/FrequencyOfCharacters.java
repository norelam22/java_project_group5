package elena;

public class FrequencyOfCharacters {
     /*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
     public static void main(String[] args) {

         String frequenceofChars = "AAABBCDD";
         String result="";

         for (int i = 0; i < frequenceofChars.length(); i++) {
             //each letter
             char ch=frequenceofChars.charAt(i);
             //index of letter
             if(frequenceofChars.indexOf(ch)==i){
                 int count=0;
                 for (int j = 0; j < frequenceofChars.length(); j++) {
                     if(frequenceofChars.charAt(j)==ch){
                         count++;
                     }


                 }
                 result+=ch+""+count;

             }


         }
         System.out.println(result);


     }

}
