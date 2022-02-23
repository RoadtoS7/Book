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
