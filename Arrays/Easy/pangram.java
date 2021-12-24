public class pangram {
    public static void main(String[] args) {
        String a ="kelvimanavaadaria";
        System.out.println(checkIfPangram(a));
    }
    public static boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
          for(int i=97;i<=122;i++){
            if(sentence.indexOf((char)i)!=-1){
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
    
}
