## Java 기본 문법
### :runner: Day 6
- 클래스와 인스턴스

### :bulb: 클래스와 인스턴스 이전의 프로그래밍
---
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
---
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

### :bulb: 객체화
---
위 코드에서 메소드를 추가했고 메소드에서 동일한 입력값(10,20)을 사용하고 있기 때문에 변수를 이용해서 좌(left),우(right)에 값을 담았다. 그러다 누군가 변수 left, right의 의미를 계산을 위한 좌항,우항이 아니라 그래프의 디자인을 변경하는 코드로 사용하거나, 메소드 sum을 더하기가 아니라 요약(summary)정보를 표시하는 의미로 사용한다면 어떻게 될까? 
> 하나의 프로그램 안에서 메소드나 변수의 의미가 달라진다.  
이런 맥락에서 객체 지향이라는 개념이 등장  
  
- 연관된 로직들을 물리적으로 응집된 하나의 객체로 만드는 법을 설명한 코드
```java
package java_tutorial;

class Calculator{
  int left, right;
  
  public void setOprands(int left, int right){
    this.left = left;
    this.right = right;
  }
  
  public void sum(){
    System.out.println(this.left + this.right);
  }
  
  public void sub(){
    System.out.println(this.left - this.right);
  }
  
  public void avg(){
    System.out.println((this.left + this.right) / 2);
  }
  
  public void div(){
    System.out.println(this.left / this.right);
  }
  
  public void mul(){
    System.out.println(this.left * this.right);
  }
  
public class CalculatorDemo4{

  public static void main(String[] args) {
  
    Calculator c1 = new Calculator();
    c1.setOprnads(20, 10);
    c1.sum();
    c1.sub();
    
    Calculator c2 = new Calculator();
    c2.setOprands(40, 20);
    c2.div();
    c2.mul();
    c2.avg();
  }
  
}
```

### :bulb: 클래스
---
```java
class Calculator {
```
> 위 코드에서 변수와 메소드들은 연관되어 있는 로직이다. 이 로직들은 계산을 하기 위한 것. 따라서 로직들을 대표하는 Calculator라고 정하고 이것들을 Calculator라는 이름으로 그룹핑한 것.
>> 클래스는 연관되어 있는 변수와 메소드의 집합.

### :bulb: 인스턴스
---
클래스를 사용하는 방법. 클래시는 일종의 설계도이기 때문에 클래스 자체를 정의하는 것으로는 할 수 있는 일이 많지 않다.  
설계도를 구체적으로 제품으로 만들 때 사용하는 키워드가 ***new***이다.
```java
Calculator c1 = new Calculator();
```
new Calculator()는 클래스 Calculator를 구체적인 제품으로 만드는 명령. 이 구체적 제품을 ***인스턴스(instance)*** 라고 부른다. **아래의 관계를 기억하자.**  
> 클래스 : 설계도   
> 인스턴스 : 제품  
  
- 다양한 형태의 변수 선언  

|데이터 타입|변수명|
|------|---|
|int|a;|
|String|a;|
|float|a;|
|long|a;|
|char|a;|
  
아래와 같은 구문은 변수명 c1의 데이터 타입은?
```java
Calculator c1
```
Calculator라는 의미이다. 즉, **클래스를 만든다는 것은 사용자 정의 데이터 타입을 만드는 것**과 같다.  
> 클래스와 인스턴스는 설계도와 제품. 객체는 ? 클래스와 인스턴스  
> 다만, 일반적으로 설계도인 클래스가 구체적인 실체인 인스턴스가 되었을 때 객체라고 한다.
> 클래스, 인스턴스 구분없이 포괄적으로 객체라고 하기도 함
  
우리가 객체를 만들어서 사용하는 이유는 **재활용성**을 높이기 위해서이다.
```java 
Calculator c1 = new Calculator();
c1.setOprands(20,10);
c1.sum();

Calculator c2 = new Calculator();
c2.setOprands(40,20);
c2.sum();
```
위 코드를 보면 두 개의 인스턴스를 c1과 c2에 담았다. 각각의 인스턴스는 메소드 setOprands를 통해서 변수 left,right의 값을 설정하고있다. 그 결과 **인스턴스 C1과 C2는 아래와 같이 서로 다른 변수의 값을 내부적으로 가지고 있게 된다.**
```java
public void setOprands(int left, int right){
    this.left = left;
    this.right = right;
}
```
이 때, 메소드 setOprands 내에 **this**라는 것이 있다. this는 **클래스를 통해 만들어진 인스턴스 자신을 가리킨다.**
  
  - 변수는 다른말로 상태(state)라고도 표현한다. 메소드는 다른 말로 행동(behave)라고도 표현한다.
  > 변수 : 상태  
  > 메소드 : 행동
    
  ***즉, 하나의 클래스를 바탕으로 서로 다른 상태를 가진 인스턴스를 만들면 서로 다른 행동을 하게 된다는것을 알 수 있다.***
  > ex) c1.sum의 결과는 30, c2.sum의 결과는 60 
