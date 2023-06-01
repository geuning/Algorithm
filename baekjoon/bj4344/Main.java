package baekjoon.bj4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr;

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());

            int m = Integer.parseInt(st.nextToken());
            arr = new int[m];

            double sum = 0;

            for(int j = 0; j < m; j++){
                int val = Integer.parseInt(st.nextToken());
                arr[j] = val;
                sum += val;
            }

            double mean = (sum / m);
            double count = 0;

            for(int j = 0; j < m; j++){
                if(arr[j] > mean){
                    count ++;
                }
            }
            System.out.printf("%.3f%%\n", (count/m)*100);
        }
    }
}