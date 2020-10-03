## Chapter 1. 간단하게 알아보기 :runner:
- 선언문 
> 뭔가를 하는 것 : 선언, 대입, 메소드 호출등
```java
int x = 3;
Sting name = "dirk";
System.out.print("x는 "+ x +"입니다");
double d = Math.random();
```
- 순환문
> 뭔가를 여러 번 반복하는 것 : for, while
```java
while (x > 12) {
  x = x - 1 ;
}

for (int x - 0; x < 10; x = x + 1) {
  System.out.print("x의 값은 "+ x + "입니다.");
}
``` 

- 분기문
> 조건에 따라 뭔가를 하는 것
```java
if (x == 10) {
    System.out.print("x가 10이군요.");
} else {
    System.out.print("x는 10이 아닙니다.");
}
if ((x < 3) & (name.equals("Dirk"))) {
    System.out.println("Gently");
}
System.out.print("이 선언문은 무조건 실행됩니다.");
```
## :bulb: Tip
print, println 다른점 : 개행의 유무
자바는 객체 지향언어이기에 모든 것이 클래스 안에 있어야 함.  
main 메소드는 프로그램 실행하는 클래스 하나에만 있으면 됨.
자바에서는 부울과 정수가 호환되지 않음. 따라서, while(x) { } 는 불가능.  
쓰려면 boolean x = true; 가 있어야함.
