## Java 기본 문법
### :runner: Day 2
- 변수 선언과 할당
- 변수가 없다면  

### :bulb: 변수란 ?
---
 데이터를 담는 컨테이너 

### :bulb: 변수의 선언과 할당
---
- 정수
> 변수를 선언하고 정수를 할당해주는 예제
```java
int a;   // a라는 변수 선언

a = 1;
System.out.println(a+1); // 결과 : 2

a = 2;
System.out.println(a+1); // 결과 : 3
```
> 자바에서 ;(세미콜론)은 생략할 수 없다.  

- 실수
> 변수를 선언하고 실수를 할당해주는 예제
```java
Double a = 1.1;
System.out.println(a+1.1) // 결과 : 2.2

a = 2.1;
System.out.println(a+1.1) // 결과 : 3.2
```

- 문자열
> 변수의 값이 꼭 숫자만 오지 않아도 된다.
```java
String first = "Hello";
System.out.println(first" "+ "Everyone");  // Hello Everyone
```
여러개 변수 동시 선언가능
```java
String a, b;
a = "Hello"
b = "Everyone";

System.out.pirntln(a + b)
```

- 자바 스크립트에서는 ? 
```javascript
a = 10;
b = 22.2;
alert(a+b);  // 32.2
```
 > 자바스크립트에서는 변수의 타입을 신경쓰지 않아도 된다. 다만, 상황에 맞게 사용하는게 중요하다.
 > ex) a = 'ten'; b = 22.2;  라면 ten22.2
 
 ### :bulb: 변수가 없다면 ?
 ---
 - 변수의 효용성   
 아래 코드 비교 
 ```java
 System.out.println(100 + 10);
 System.out.println((100 + 10) / 10);
 System.out.println(((100 + 10) / 10) - 10);
 System.out.println((((100 + 10) / 10) - 10) * 10);
 ```
 > 변수를 사용함으로써 100을 수정할 때 변수에 할당된 값만 변경해주면 된다.
 ```java
 int a = 100
 System.out.println(a + 10);
 System.out.println((a + 10) / 10);
 System.out.println(((a + 10) / 10) - 10);
 System.out.println((((a + 10) / 10) - 10) * 10);
 ``` 
 
