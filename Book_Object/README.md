### 무엇이 문제인가?
- 변경이 어렵다.  
  b) Theater가 TicketSeller와 Audience의 세부사항에 직접 접근한다.
  - Theater의 enter는 Audience가 Bag을 가지고 있다는 사실을 알고 있다.   
  = Theater가 Audience의 세부적인 사항까지 알고 있어야 한다.
  - Audience가 Bag을 가지고 있지 않다면? Theater 코드를 바꾸어야 한다.

- 코드를 이해하기 어렵다.  
  b) 우리의 예상을 벗어난 코드이다.

- 해결 방법
    - Theater가 Audience와 TicketSeller의 세부 사항을 모르게 차단하라.  
    => 관람객이 스스로 현금, 초대장을 처리한다.
    - TicketSeller가 스스로 매표소의 티켓과 판매요금을 다루게 한다.  
    => **객체를 자율적인 존재로 만들어라**

### 해결 방법 :one:
1. TicketOffice에 대한 접근은 ticketSeller에서만 할 수 있게 한다.
  - TicketSeller를 private 로 함으로써 Theater는 TicketSeller에 접근할 수 없다.  
> => 객체 내부의 세부사항을 감추는 것: 캡슐화 
  - 캡슐화의 목적: 변경하기 쉬운 객체를 만드는 것 
  -> 결합도를 낮춰서 변경하기 쉬워진다.
- Theater는 TicketSeller의 인터페이스에만 의존한다.  
- TicketSeller의 내부에 TicketOffice가 존재하다는 사실은 **TicketSeller의 구현에 속한다.**
> 객체를 인터페이스와 구현으로 나누고,  
> 인터페이스에만 의존하도록 하는 것 
> 결합도를 낮추어 변경하기 쉬운 코드를 만들기 위해 따라야 하는 기본‼️

2. TicketSeller에서 Audience에 대한 의존성 낮추기 = Audience 캡슐화 하기
- TicketSeller가 Audience의 구현에 의존하고 있다. (Audience의 Bag에 직접 접근한다.)  
=> Audience가 스스로 자신의 가방에 초대장이 존재하는지 확인하고, 돈을 처리한다.  
=> 외부에서는 Audience가 Bag을 소유하고 있다는 사실을 알 필요가 없다.  
=> Audience의 구현을 수정하더라도 TicketSeller는 영향 받지 않는다.

### 무엇이 개선되었는가?
- Audience와 TicketSeller는 자신의 소지품을 자신이 관리한다.  
=> 우리의 예상과 일치한다.
=> 이해하기 쉬운 코드

- Audience나 TicketSeller의 내부 구현을 변경해도 Theater를 변경하지 않아도 된다.
=> 변경에 용이하다.

### :bulb: 어떻게 한 것인가?
1. **각 객체가 자기 자신의 문제를 스스로 해결하도록 했다.**
= **자기 자신의 데이터는 스스로 처리하는 객체를 자율적인 존재로 만들었다.**  
= 캡슐화를 했다.  
= 객체 간에 메시지를 통해서만 의사소통 하도록 했다. 
= **인터페이스만 알뿐 세부 구현을 알지 못한다.** 

2. 도메인의 로직에 따라서 코드를 구현했다. (각 객체가 예상가능한 동작을 하도록 구현했다.)





