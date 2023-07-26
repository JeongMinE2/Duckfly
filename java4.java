package javaEX;

/* 가정
우리는 게임개발회사에 입사했다.
우리에게는 성격좋은 사수 한명이 있다.
내가 개발할 게임은 오리시뮬레이션 게임이다.
선임이 나의 개발을 도와주진 않지만 조언은 해준다.
*/

/* 요구사항
- D1 요구 : 오리를 생성하고 날게하시오.

- D2 요구 : 게임의 디테일을 살리기 위해서 `thunderDuck `과 `whiteDuck `를 생성하고 날게하시오.

- D3 요구 : 오리 계열의 클래스에 날다 메서드가 중복되었습니다. 중복을 제거해주세요.

- D4 요구 : 게임의 재미를 위하여 고무오리를 추가하고 날게 하시오.
*/

class Duck2 {
    void fly() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
}

class WhiteDuck2 extends Duck2 { }

class ThunderDuck2 extends Duck2 { }

class RubberDuck1 extends Duck2 { }

public class java4 {
    public static void main(String[] args) {
        Duck2 duck = new Duck2();
        duck.fly();

        ThunderDuck2 thunderDuck = new ThunderDuck2();
        thunderDuck.fly();
        // 출력 : 오리가 날개로 날아갑니다.

        WhiteDuck2 whiteDuck = new WhiteDuck2();
        whiteDuck.fly();
        // 출력 : 오리가 날개로 날아갑니다.

        RubberDuck1 rubberDuck = new RubberDuck1();
        rubberDuck.fly();
    }
}
