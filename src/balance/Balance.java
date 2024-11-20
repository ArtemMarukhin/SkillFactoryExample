package balance;

import java.util.Scanner;

public class Balance {

    public int l = 0;
    public int r = 0;

    public void addRight(int n){
        r += n;
    }

    public void addLeft(int n){
        l += n;
    }

    public char getSituation(){
        if(r == l) return '=';
        else if (r > l) return 'R';
        else return 'L';
    }
}
