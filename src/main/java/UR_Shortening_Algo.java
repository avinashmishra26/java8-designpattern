/**
 * Created by avinash on 18/10/20.
 */


import java.lang.*;
import java.io.*;
import java.security.cert.PKIXRevocationChecker;
import java.util.Arrays;
import java.util.*;

class UR_Shortening_Algo
{
    public static void main (String[] args) throws Error {
        Optional Got = Optional.of("Game of Thrones");

        String str[] = new String[10];
        Optional str1 = Optional.ofNullable(str[9]);

        System.out.print(str1.isPresent());
        System.out.print(Got.isPresent());
    }


}
