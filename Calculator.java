public class Calculator {

    public Calculator(){

    }

    // return true if the String is a valid input (not parentheses check)
    public boolean notValid(String arithInput){
        int largo = arithInput.length();
        for(int i=0; i<40; i++){
            for(int b=0; b<largo; b++){
                //System.out.println(i);
                if(arithInput.charAt(b) == i){
                    return false;
                }
            }
        }
        for(int i=58; i<127; i++){
            for(int b=0; b<largo; b++){
                //System.out.println(i);
                if(arithInput.charAt(b) == i){
                    return false;
                }
            }
        }
        return true;
    }

}
