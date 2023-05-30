package baekjoon.bj10988;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder(s);

        if(s.equals(sb.reverse().toString())){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}