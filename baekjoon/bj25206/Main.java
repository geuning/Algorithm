package baekjoon.bj25206;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double sumnumxscore = 0;
        double sumnum  = 0;

        for(int i = 0; i < 20; i++){
            st = new StringTokenizer(br.readLine());
            String object = st.nextToken();
            double num = Double.parseDouble(st.nextToken());
            String alpha = st.nextToken();
            double score = 0;

            if(!(alpha.equals("P"))){
                switch (alpha){
                    case "A+":
                        score = 4.5;
                        break;
                    case "A0":
                        score = 4.0;
                        break;
                    case "B+":
                        score = 3.5;
                        break;
                    case "B0":
                        score = 3.0;
                        break;
                    case "C+":
                        score = 2.5;
                        break;
                    case "C0":
                        score = 2.0;
                        break;
                    case "D+":
                        score = 1.5;
                        break;
                    case "D0":
                        score = 1.0;
                        break;
                    case "F":
                        score = 0.0;
                        break;
                }
                sumnumxscore += (num*score);
                sumnum += num;
            }
        }
        System.out.printf("%.6f", sumnumxscore/sumnum);
        br.close();
    }
}