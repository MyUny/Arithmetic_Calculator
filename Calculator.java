public class Calculator {

    public Calculator(){

    }

    // add 44
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
