package day0108;

import java.util.Scanner;

public class Quiz_18 {

   //public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      //quiz_1();
      //quiz_2();

   //}
   
   //public static void quiz_1() {
   
      /*Q. 반복해서 숫자를 입력하여 양수의 갯수와 음수의 갯수를 구하시오(0입력시 종료)
       *
       * 6
       * -10
       * 88
       * 120
       * -120
       * 0
       * 양수의 갯수: 3개
       * 음수의 갯수: 2개
       * while true문 이용*/
      
      static Scanner sc = new Scanner(System.in);
      public static void main(String[] args) {
         
         quiz_1();
         quiz_2();
      }
      public static void quiz_1() {
         System.out.println("양수 갯수와 음수 갯수 구하시오 (0 입력시 종료)");
         int num;
         int i=0, n1=0, n2=0;
         while(true) {
            num = sc.nextInt();
            if(num==0) break;
            if(num>0) {
               n2++;
            } 
            else 
               n1++;
         }
         System.out.println("양수 : "+n2);
         System.out.println("음수 : "+n1);
         }

   
   public static void quiz_2() {
      
      //Q. 반복해서 점수를 입력하는데 (1~100) 0을 입력시 빠져나와 갯수와 합계와 평균을 구하시오
      //범위에 맞지 않는 점수는 횟수에서 제외되어야 한다
      
      System.out.println("반복해서 점수를 입력(1~100 사이 / (0입력 시 종료)");
      int num, sum=0;
      
      while(true) {
         num = sc.nextInt();
         if(num==0) break;
         sum+=num;
      }
      System.out.println("합계 : "+ sum);
      
      }
      
   }

