package baekjoon.bj8393;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int s = 0;

        for (int i = 1; i <= a; i++){
            s += i;
        }
        System.out.println(s);
    }
}