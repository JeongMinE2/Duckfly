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

- D6 요구 : 고무오리가 반응이 좋습니다. 고무2오리를 추가하고 날게 해주세요.

- D7 요구 : 고무오리계열에서 날다 메서드의 중복을 제거해주세요.
*/

class Duck4 {
    void fly() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
}

class ThunderDuck4 extends Duck4 { }

class WhiteDuck4 extends Duck4 { }

class RubberDuck3 {
    void fly() {
        System.out.println("저는 날 수 없어요. ㅜㅠ");
    }
}

class RubberDuck4 extends RubberDuck3 {

}

public class java6 {
    public static void main(String[] args) {
        ThunderDuck4 thunderDuck = new ThunderDuck4();
        thunderDuck.fly();
        // 출력 : 오리가 날개로 날아갑니다.

        WhiteDuck4 whiteDuck = new WhiteDuck4();
        whiteDuck.fly();
        // 출력 : 오리가 날개로 날아갑니다.

        RubberDuck3 rubberDuck1 = new RubberDuck3();
        rubberDuck1.fly();
        // 출력 : 저는 날 수 없어요. ㅜㅠ

        RubberDuck4 rubberDuck2 = new RubberDuck4();
        rubberDuck2.fly();
        // 출력 : 저는 날 수 없어요. ㅜㅠ
    }
}










