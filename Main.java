public class Main {
    public static void main(String[] args) {
        boolean menu = true;
        Calculator c = new Calculator();
        String a = "!a  t  !2  3  s";
        a = a.replaceAll("\\s","");
        if(c.notValid(a)){
            //lógica
        }else{
            menu = false;
        }

    }
}
