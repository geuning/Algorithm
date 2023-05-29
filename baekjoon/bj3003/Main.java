package baekjoon.bj3003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = 1;
        int q = 1;
        int l = 2;
        int b = 2;
        int n = 2;
        int p = 8;

        StringTokenizer st = new StringTokenizer(br.readLine());

        k = k - Integer.parseInt(st.nextToken());
        q = q - Integer.parseInt(st.nextToken());
        l = l - Integer.parseInt(st.nextToken());
        b = b - Integer.parseInt(st.nextToken());
        n = n - Integer.parseInt(st.nextToken());
        p = p - Integer.parseInt(st.nextToken());

        System.out.print(k + " ");
        System.out.print(q + " ");
        System.out.print(l + " ");
        System.out.print(b + " ");
        System.out.print(n + " ");
        System.out.print(p);

    }
}