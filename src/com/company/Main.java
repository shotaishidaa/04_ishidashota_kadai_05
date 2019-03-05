package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        System.out.println("石田　将太　との相性診断ゲーム！！！");
        System.out.println("該当する番号を入力してください");
        System.out.println("");




        String[] questions = {"私は野球が好きだ",
                "私は担々麺が好きだ",
                "私はカメラが好きだ",
                "私は映画が好きだ",
                "私は体を動かすことが好きだ"};

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        int answer_count = 0;

        int input_num = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println("1　:　あてはまらない　2　:　あまりあてはまらない　3　:　まあまああてはまる　4　:　あてはまる");

            input_num = sc.nextInt();

            if (input_num == 99) {
                break;
            }

            sum += input_num;
            answer_count++;
        }


        System.out.println("");
        System.out.println("診断結果");

        if (sum <= 4 * answer_count && sum > 3 * answer_count){
            System.out.println("最高です！！！！！！");
            }
            else if(sum <= 3 * answer_count && sum > 2 * answer_count) {
            System.out.println("まあまあ！！！");
            }
            else if(sum <= 2 * answer_count && sum > 1 * answer_count) {
            System.out.println("微妙！");
            }
            else if(sum <= 1 * answer_count && sum > 0 * answer_count){
                System.out.println("最悪...");
            }

        }
}
