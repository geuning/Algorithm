package baekjoon.bj2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (b < 45){
            a--;
            b = (b-45) + 60;
            if (a < 0) {
                a = 23;
            }
            System.out.println(a + " "+ b);
        } else {
            System.out.println(a + " "+ (b-45));
        }
    }
}