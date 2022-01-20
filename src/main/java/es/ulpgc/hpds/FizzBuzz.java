package es.ulpgc.hpds;

public class FizzBuzz {

    public String value(int i) {
        if(isFizz(i)) {
            if(isBuzz(i)){
                return "fizzbuzz";
            }else{
                return "fizz";
            }
        }else if(isBuzz(i)){
            return "buzz";
        }else {
            return String.valueOf(i);
        }
    }

    public boolean isFizz(int n){
        if(n % 3 == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean isBuzz(int n){
        if(n % 5 == 0){
            return true;
        }else{
            return false;
        }
    }
}
