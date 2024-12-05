# 반복자 & 컴포지트 패턴

##  MenuTest.java
- [x] `branchMenu()` 메서드 생성하기
  - 아점 메뉴를 출력한다.
- [x] `dinerMenu()` 메서드 생성하기
  - 저녁 메뉴를 출력한다.
- [x] `printMenu()` 메서드 생성하기
  - 통합 메뉴를 출력한다.
- [x] ` vegeterianMenu()` 메서드 생성하기
  - 비건 메뉴를 출력한다.

## Iterator Pattern 적용
- [x] `PancakeHouseMenuIterator` class
- [x] `DinerMenuIterator` class
- [x] `printMenu()`를 개선
  - for-each 사용
- [x] `vegeterianMenu()` 개선

## Composite Pattern 적용
- [x] `Item` class 생성
  - 이를 상속 받는 `Menu` class를 composite component로 정의

## Composite Pattern 활용
- [ ] `PancakeHouseMenuIterator`와 `DinerMenuIterator`를 Item class의 subclass로 만든다.
- [ ] composite pattern의  The `operation()` 을 메뉴 출력 또는 MenuItem을 차례로 전달하는 메소드를 정의하여 통합 메뉴를 출력한다.


## REFACTOR
-[ ] 맨 처음에 적용한 것을 Iterator와 Composite를 적용하여 테스트 한다.
