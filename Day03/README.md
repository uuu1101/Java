## Java 기본 문법
### :runner: Day 3
- 데이터의 크기
- 정수형
- 실수형
- 문자

### :bulb: 데이터의 크기 ?
---
- 8bit = 1byte
- 1024bye = 1kilobyte ...

### :bulb: 정수형
---
|데이터 타입|메모리의 크기|표현 가능 범위|
|------|---|---|
|byte|1byte|-128 ~ 127|
|short|2byte|-32,768 ~ 32,767|
|int|4byte|-2,147,483,648 ~ 2,147,483,647|
|long|8byte|-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807|
* 데이터 타입에 따라 메모리의 크기가 달라지기 때문에 적절하게 사용하는게 좋다. 
> 결과적으로 정수를 사용할때는 Int형을 사용하면 된다.

### :bulb: 실수형
---
|데이터 타입|메모리의 크기|표현 가능 범위|
|------|---|---|
|float|4byte|±(1.40129846432481707e-45 ~ 3.40282346638528860e+38)|
|double|8byte|±(4.94065645841246544e-324d ~ 1.79769313486231570e+308d)|
* 실수형에는 float과 double이 있다. 실수를 사용할 때는 double을 사용하자.

### :bulb: 문자
---
|데이터 타입|메모리의 크기|표현 가능 범위|
|------|---|---|
|char|2byte|모든 유니코드 문자|
* 문자와 문자열은 다르다. 문자 = char, 문자열 = String
> char = 2byte, String = 12byte 공간을 차지

### :bulb: 상수와 데이터 타입
---
* 실수의 표현 
```java
double = 2.2;
float = 2.2F;

// 2.2는 float이 아니고 double 따라서, float형은 명시해줘야한다.
```

* 정수의 표현
```java
int a = 2147483647;
long b = 2147483648; // 에러발생

// 변수는 long타입이지만 변수에 대입되는 상수가 int이기 때문에 아래처럼 명시해야한다.
long b = 2147483648L;
```
- short, byte는 int형을 허용하기 때문에 오류가 발생하지 않음
```java
short a = 100;
byte b = 200;
```
