package javaEX;

// 문제 : 아래와 같이 출력되도록 해주세요.
// 조건 : `Breath` 기능을 중복하지 말아주세요.

class Animal {
    void breath() {
        System.out.println("숨쉬다.");
    }
}

class Man extends Animal {

}

public class java1 {
    public static void main(String[] args) {
        Man man = new Man();
        man.breath();
    }
}
