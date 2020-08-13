## Java 기본 문법
### :runner: Day 6
- 클래스와 인스턴스

### :bulb: 클래스와 인스턴스 이전의 프로그래밍
```java 
package java_tutorial;
 
public class CalculatorDemo {
 
    public static void main(String[] args) {
        // 아래의 로직이 1000줄 짜리의 복잡한 로직이라고 가정하자.
        System.out.println(10 + 20);
        System.out.println(20 + 40);
    }
 
}
```
> 실행 결과는 30과 60이다. 프로그래밍의 기본은 중복을 제거하는것.

### :bulb: 메소드화
- 중복을 제거하기 위한 방법으로 고려해볼 수 있는 기능이 메소드다.
위 코드를 메소드화 시킨 코드.
```java
package java_tutorial;
 
public class CalculatorDemo2 {
 
    public static void sum(int left, int right) {
        System.out.println(left + right);
    }
 
    public static void main(String[] args) {
        sum(10, 20);
        sum(20, 40);
    }
 
}
```
- 똑같은 수를 이용해서 더하기,빼기,평균도 구해야 한다면 어떻게 해야하나 ?
> 입력값을 변수화시키고 메소드들이 값을 사용하면 코드의 양을 줄일 수 있다.
```java
pakage java_tutorial;

public class CalculatorDemo3 {
  
    public static void sum(int left, int right) {
        System.out.println(left + right);
    }
    
    public static void sub(int left, int right) {
        System.out.println(left - right);
    }
    
    public static void avg(int left, int right) {
        System.out.println((left + right) / 2) ;
    }
    
    public static void main(String[] args) {
        int left, right;
        
        left = 10;
        right = 20;
        
        sum(left, right);
        sub(left, right);
        avg(left, right); 
    }
    
}
```

        
