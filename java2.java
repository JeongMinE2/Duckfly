package javaEX;

/* 가정
우리는 게임개발회사에 입사했다.
우리에게는 성격좋은 사수 한명이 있다.
내가 개발할 게임은 오리시뮬레이션 게임이다.
선임이 나의 개발을 도와주진 않지만 조언은 해준다.
*/

/* 요구사항
- D1 요구 : 오리를 생성하고 날게하시오.
*/

class Duck1 {
    void fly() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
}

public class java2 {
    public static void main(String[] args) {
        Duck1 duck = new Duck1();
        duck.fly();
        // 출력 : 오리가 날개로 날아갑니다.
    }
}
