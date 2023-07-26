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

- D5 요구 : 주말 주주회의에서 고무오리가 하늘을 날아다니는 것에 대해서 태클이 들어왔습니다.
  고무오리 계열은 하늘을 날 수 없게 해주세요.
*/

class Duck3 {
    void fly() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
}

class ThunderDuck3 extends Duck3 { }

class WhiteDuck3 extends Duck3 { }

class RubberDuck2 {
    void fly() {
        System.out.println("저는 날 수 없어요. ㅜㅠ");
    }
}

public class java5 {
    public static void main(String[] args) {
        ThunderDuck3 thunderDuck = new ThunderDuck3();
        thunderDuck.fly();
        // 출력 : 오리가 날개로 날아갑니다.

        WhiteDuck3 whiteDuck = new WhiteDuck3();
        whiteDuck.fly();
        // 출력 : 오리가 날개로 날아갑니다.

        RubberDuck2 rubberDuck = new RubberDuck2();
        rubberDuck.fly();
        // 출력 : 저는 날 수 없어요. ㅜㅠ
    }
}
