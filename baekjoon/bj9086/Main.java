package baekjoon.bj9086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++){
            String text = br.readLine();

            System.out.print(text.charAt(0));
            System.out.print(text.charAt(text.length()-1));
            System.out.println();
        }
    }
}