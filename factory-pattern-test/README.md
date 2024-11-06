# Factory Pattern 실습

> 주어진 코드를 실행시켜 그 결과를 캡처하여 "제출문서"에 저장한다.

1. 3가지 Pizza: **Clam Pizza**, **Cheese Pizza**, **Pepperoni Pizza**를 생산하는 `PizzaFactory` 클래스를 만들어라.
    - `PizzaFactory` 클래스에는 Clam Pizza 생성을 위해 `getClamPizza()`, Cheese Pizza 생성을 위해 `getCheesePizza()`, Pepperoni Pizza 생성을 위해 `getPepperoniPizza()` 메서드가 있다.

2. `PizzaFactory`를 상속받아 `NYPizzaFactory` 클래스를 만들어라.
    - `NYPizzaFactory`는 `ClamPizza`를 `NYStyleClamPizza`로, `CheesePizza`를 `NYStyleCheesePizza`로, `PepperoniPizza`를 `NYStylePepperoniPizza`로 생성한다.

3. `PizzaFactory`를 상속받아 `ChicagoPizzaFactory` 클래스를 만들어라.
    - `ChicagoPizzaFactory`는 `ClamPizza`를 `ChicagoStyleClamPizza`로, `CheesePizza`를 `ChicagoStyleCheesePizza`로, `PepperoniPizza`를 `ChicagoStylePepperoniPizza`로 생성한다.

4. 2번, 3번을 참고하여 `HeadStorePizzaFactory`를 만들어라.
    - `HeadStore`에서는 오리지널 `ClamPizza`, `CheesePizza`, `PepperoniPizza`를 만든다.

5. `MyPizzaStore.java`에 `PizzaFactory` 객체를 위한 Attribute `pizzaFactory`를 만들고 `HeadStorePizzaFactory` 객체를 생성하여 `pizzaFactory`에 할당한다.

6. `createPizza()` 메서드의 각 Pizza 객체 인스턴스 생성(`new`)을 `Factory`의 `getInstance()`로 모두 바꾸어라.
    - 예를 들어 `new ClamPizza()`를 `pizzaFactory.getClamPizza()`로 바꾼다.
    - 여기까지 작업 후 **App.java**를 실행해서 결과를 캡처하고 "1"로 표시하여 제출문서에 포함한다.

7. Chicago Style Pizza들에 사각형으로 피자를 자른다.
    - 사각형으로 피자를 자르는 때는 `cut()` 메서드를 변경하여 **ChicagoStyle Pizza**는 `Cutting the pizza into square slices` 문자를 출력하게 변환한다.
    - 여기까지 작업 후 **App.java**를 실행해서 결과를 캡처하여 제출문서에 포함한다.

8. `PizzaFactory`를 확장하여 **HeadStore**, **NYStore**, **ChicagoStore**를 만들어라.
    - 여기까지 작업 후 **App.java**를 실행해서 그 결과를 캡처하여 "2"로 표시하여 제출문서에 포함한다.

9. Factory Method Pattern을 적용하여 `MyPizzaStore` 클래스가 **HeadStore**, **NYStore**, **ChicagoStore**를 만들도록 수정한다.
    - **App**에서 **myPizzaStore와 NYStore**를 할당하여 수행 후 결과를 캡처하고 "3"으로 표시하여 제출문서에 포함한다.
