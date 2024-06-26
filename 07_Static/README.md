## 7장 정리

### 자바 메모리 구조 - 비유
자바의 메모리 구조는 크게 메서드 영역, 스택 영역, 힙 영역 3개로 나눌 수 있다.
- 메서드 영역: 클래스 정보를 보관, 이 클래스 정보가 붕어빵 틀
- 스택 영역: 실제 프로그램이 실행되는 영역, 메서드를 실행할 때 마다 하나씩 쌓임
- 힙 영역: 객체(인스턴스)가 생성되는 영역, new 명령어를 사용하면 이 영역을 사용 (붕어빵 틀로부터 생성된 붕어빵이 존재하는 공간) (참고로 배열도 이 영역에 생성된다)


### 자바 메모리 구조 - 실제
- 메서드 영역(Method Area): 메서드 영역은 프로그램을 실행하는데 필요한 공통 데이터를 관리한다. 이 영역은 프로그램의 모든 영역에서 공유한다.
  - 클래스 정보: 클래스의 실행 코드(바이트 코드), 필드, 메서드와 생성자 코드등 모든 실행 코드가 존재한다.
  - static 영역: static 변수들을 보관한다. 뒤에서 자세히 설명한다.
  - 런타임 상수 풀: 프로그램을 실행하는데 필요한 공통 리터럴 상수를 보관한다. 예를 들어서 프로그램에 "hello" 라는 리터럴 문자가 있으면 이런 문자를 공통으로 묶어서 관리한다. 이 외에도 프로그램을 효율적으로 관리하기 위한 상수들을 관리한다.
- 스택 영역(Stack Area): 자바 실행 시, 하나의 실행 스택이 생성된다. 각 스택 프레임은 지역 변수, 중간 연산 결과, 메서드 호출 정보 등을 포함한다.
스택 프레임: 스택 영역에 쌓이는 네모 박스가 하나의 스택 프레임이다. 메서드를 호출할 때 마다 하나의 스택 프레임이 쌓이고, 메서드가 종료되면 해당 스택 프레임이 제거된다.
- 힙 영역(Heap Area): 객체(인스턴스)와 배열이 생성되는 영역이다. 가비지 컬렉션(GC)이 이루어지는 주요 영역이며, 더 이상 참조되지 않는 객체는 GC에 의해 제거된다.
  
참고: 스택 영역은 더 정확히는 각 쓰레드별로 하나의 실행 스택이 생성된다. 따라서 쓰레드 수 만큼 스택 영역이 생성된다. 지금은 쓰레드를 1개만 사용하므로 스택 영역도 하나이다.

**메서드 코드는 메서드 영역에**
자바에서 특정 클래스로 100개의 인스턴스를 생성하면, 힙 메모리에 100개의 인스턴스가 생긴다. 각각의 인스턴스는 내부에 변수와 메서드를 가진다. 같은 클래스로부터 생성된 객체라면 **메서드는 공통된 코드를 공유한다**. 
따라서 객체가 생성될 때, 멤버 변수에는 메모리가 할당되지만, **메서드에 대한 새로운 메모리 할당은 없다. 메서드는 메서드 영역에서 공통으로 관리되고 실행된다**.
정리하면 인스턴스의 메서드를 호출하면 실제로는 메서드 영역에 있는 코드를 불러서 수행한다.

### 스택, 큐 구조
**후입 선출(LIFO, Last In First Out)**
나중에 넣은 것이 가장 먼저 나오는 것을 후입 선출이라 하고, 이런 자료 구조를 스택이라 한다.

**선입 선출(FIFO, First In First Out)**
후입 선출과 반대로 가장 먼저 넣은 것이 가장 먼저 나오는 것을 선입 선출이라 한다. 이런 자료 구조를 큐(Queue)라 한다.

### 스택 영역
- 자바는 스택 영역을 사용해서 메서드 호출과 지역 변수(매개변수 포함)를 관리한다.
- 메서드를 계속 호출하면 스택 프레임이 계속 쌓인다.
- 지역 변수(매개변수 포함)는 스택 영역에서 관리한다.
- 스택 프레임이 종료되면 지역 변수도 함께 제거된다.
- 스택 프레임이 모두 제거되면 프로그램도 종료된다.
- 지역 변수는 스택 영역에, 객체(인스턴스)는 힙 영역에 관리되는 것을 확인했다.


### static 키워드
`static` 키워드는 주로 멤버 변수와 메서드에 사용된다.

`static` 키워드를 사용하면 공용으로 함께 사용하는 변수를 만들 수 있다.

멤버 변수에 `static` 을 붙이게 되면 static 변수, 정적 변수 또는 클래스 변수라 한다.

**멤버 변수(필드)의 종류**
- 인스턴스 변수: static 이 붙지 않은 멤버 변수, 예) name
  - static 이 붙지 않은 멤버 변수는 인스턴스를 생성해야 사용할 수 있고, 인스턴스에 소속되어 있다. 따라서 인스턴스 변수라 한다.
  - 인스턴스 변수는 인스턴스를 만들 때 마다 새로 만들어진다.
- 클래스 변수: static 이 붙은 멤버 변수, 예) count
  - 클래스 변수, 정적 변수, static 변수등으로 부른다. 용어를 모두 사용하니 주의하자
  - static 이 붙은 멤버 변수는 인스턴스와 무관하게 클래스에 바로 접근해서 사용할 수 있고, 클래스 자체에 소속되어 있다. 따라서 클래스 변수라 한다.
  - 클래스 변수는 자바 프로그램을 시작할 때 딱 1개가 만들어진다. 인스턴스와는 다르게 보통 여러곳에서 공유하는 목적으로 사용된다.
  - 정적 변수는 클래스에서 공용으로 관리하기 때문에 클래스를 통해서 접근하는 것이 더 명확하다. ex) `Data3.count`
  
### 변수와 생명주기
- **지역 변수(매개변수 포함)**: 지역 변수는 **스택 영역** 내의 스택 프레임 안에 보관된다. 메서드가 종료되면 스택 프레임도 제거 되는데, 이때 해당 스택 프레임에 포함된 지역 변수도 함께 제거된다. 따라서 지역 변수는 생존 주기가 짧다.
- **인스턴스 변수**: 인스턴스에 있는 멤버 변수를 인스턴스 변수라 한다. 인스턴스 변수는 **힙 영역**을 사용한다. 힙 영역은 GC(가비지 컬렉션)가 발생하기 전까지는 생존하기 때문에 보통 지역 변수보다 생존 주기가 길다.
- **클래스 변수**: 클래스 변수는 **메서드 영역의 static 영역**에 보관되는 변수이다. 메서드 영역은 프로그램 전체에서 사용하는 공용 공간이다. 클래스 변수는 해당 클래스가 JVM에 로딩 되는 순간 생성되고 JVM이 종료될 때 까지 생명주기가 어어진다. 따라서 가장 긴 생명주기를 가진다.

`static` 이 정적이라는 이유는 바로 여기에 있다. 힙 영역에 생성되는 인스턴스 변수는 동적으로 생성되고, 제거된다. 
반면에 `static` 인 정적 변수는 거의 프로그램 실행 시점에 딱 만들어지고, 프로그램 종료 시점에 제거된다. 정적 변수는 이름 그대로 정적이다.


### 클래스 메서드와 인스턴스 메서드
- 인스턴스 메서드: `static` 이 붙지 않은 멤버 메서드
- 클래스 메서드: `static` 이 붙은 멤버 메서드 (클래스 메서드, 정적 메서드, static 메서드 ..)
`static` 이 붙지 않은 멤버 메서드는 인스턴스를 생성해야 사용할 수 있고, 인스턴스에 소속되어 있다. 따라서 인스턴스 메서드라 한다. `static` 이 붙은 멤버 메서드는 인스턴스와 무관하게 클래스에 바로 접근해서 사용할 수 있고, 클래스 자체에 소속되어 있다. 따라서 클래스 메서드라 한다.
이 내용은 멤버 변수에도 똑같이 적용된다.

### 정적 메서드 사용법
- `static` 메서드는 `static` 만 사용할 수 있다.
  - 클래스 내부의 기능을 사용할 때, 정적 메서드는 `static` 이 붙은 **정적 메서드나 정적 변수만 사용할 수 있다.**
  - 클래스 내부의 기능을 사용할 때, 정적 메서드는 인스턴스 변수나, 인스턴스 메서드를 사용할 수 없다.
- 반대로 모든 곳에서 `static` 을 호출할 수 있다.
  - 정적 메서드는 공용 기능이므로, 접근 제어자만 허락한다면 클래스를 통해 모든 곳에서 `static` 을 호출할 수 있다.
- 정적 메서드는 객체 생성이 필요 없이 메서드의 호출만으로 필요한 기능을 수행할 때 주로 사용한다.
  - 예를 들어 간단한 메서드 하나로 끝나는 유틸리티성 메서드에 자주 사용한다. 
  - 수학의 여러가지 기능을 담은 클래스를 만들 수 있는데, 이 경우 인스턴스 변수 없이 입력한 값을 계산하고 반환하는 것이 대부분이다. 이럴 때 정적 메서드를 사용해서 유틸리티성 메서드를 만들면 좋다.


### main() 메서드는 정적 메서드
인스턴스 생성 없이 실행하는 가장 대표적인 메서드가 바로 `main()` 메서드이다.

`main()` 메서드는 프로그램을 시작하는 시작점이 되는데, 생각해보면 객체를 생성하지 않아도 `main()` 메서드가 작동했다. 이것은 `main()` 메서드가 `static` 이기 때문이다.

정적 메서드는 정적 메서드만 호출할 수 있다. 따라서 정적 메서드인 `main()` 이 호출하는 메서드에는 정적 메서드를 사용했다.

물론 더 정확히 말하자면 정적 메서드는 같은 클래스 내부에서 정적 메서드만 호출할 수 있다. 따라서 정적 메서드인 `main()` 메서드가 같은 클래스에서 호출하는 메서드도 정적 메서드로 선언해서 사용했다.