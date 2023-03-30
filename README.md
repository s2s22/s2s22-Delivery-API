# s2s22-Delivery-API
## 프로젝트 
### Spring 기반 나만의 배달 어플 API
### 개발기간 : 2023.02 ~ 2023.03

## 설계 
1. 음식관리API    

1-1 )ERD    

![image](https://user-images.githubusercontent.com/22412397/226937079-4f9beea3-0a56-4d49-bcdf-664116c0cff4.png)

1-2) URL 설정   
  음식 : 구분을 위해 클래스에 @RequestMapping("/food")를 선언   
  음식전체 조회 : @GetMapping("/foods")  
  음식 Id로 조회 : @GetMapping("/{foodId}")
  음식등록 : @PostMapping("/save")    
  음식수정 : @PutMapping("/{foodId}")    
  음식삭제 : @DeleteMapping("/{foodId}")   
  
2. 주문관리API

2-1 ) ERD

2-2 ) URL 설정
  주문 : 구분을 위해 클래스에 @RequestMapping("order")를 선언
  주문 전체 조회 : @GetMapping("/orders")
  주문 Id로 조회 : @GetMapping("/{orderId}")
  주문등록 : @PostMapping("/save")
  주문수정 : 
  주문삭제 : @DeleteMapping("/{orderId}")



