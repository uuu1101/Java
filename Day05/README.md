## Java 기본 문법
### :runner: Day 5
- 배열 ?
 > 변수가 하나의 데이터를 저장하기 위한 거싱라면 배열은 여러 개의 데이터를 저장하기 위한 것
 
### 배열의 생성과 사용
```java
package java_tutorial;

public class DeifneDemo {
  public static void main(String[] args) {
  
      String[] classGroup = { "김태형", "김경환", "임리나", "주지수" };
      System.out.println(classGroup[0]);
  }
}
```
결과

```java
김태형
```

### 배열과 반복문
```java
package java_tutorial;

public class ArrayLoopDemo {
  
  public static void main(String[] args) {
    
      String[] members = { "김태형","김경환","임리나","주지수"};
      for (int i = 0; i < members.length; i++) {
          String member = members[i];
          System.out.println(member + "이 상담을 받았습니다.");
          }
    }
}
```
결과
```java
김태형이 상담을 받았습니다.
김경환이 상담을 받았습니다.
임리나이 상담을 받았습니다.
주지수이 상담을 받았습니다.
```

### for-each
> 배열의 내용을 탐색할 때 for 문을 좀 더 간결하게 사용하는 방법
```java
pakage java_tutorial;

public class ForEachDemo {

    public static void main(String[] args) {
        String[] members = { "김태형", "김경환", "임리나", "주지수"};
        for (String e : members) {
            System.out.println(e + "이 상담을 받았습니다.");
        }
   }
}
```

### 오류 
> 배열의 존재하지 않는 인덱스를 사용하려는 경우 
```java
String[] members = {"개", "고양이"}
System.out.println(members[2];
```
> Index는 0,1이 존재하는데 2를 사용하려하면 오류가 발생

### 배열의 한계
> 배열은 초기화할 때 그 크기가 정해진다. 
> 자바에는 Collection 이라는 기능이 있다. Container라고도 부르는 이 기능을 이용하면 유연하게 배열을 사용할 수 있다.
