# s2s22-Delivery-API
## 프로젝트 
### Spring 기반 나만의 배달 어플 API
### 개발기간 : 2023.02 ~ 2023.03

## 설계 
1. 음식관리API    

1-1 )ERD    

![image](https://user-images.githubusercontent.com/22412397/226183488-4cceece4-4526-4ef8-a0c1-9cad1eae84f0.png)

1-2) url 설정   
  음식 : 구분을 위해 클래스에 @RequestMapping("/food")를 선언   
  음식조회 : @GetMapping("/foods")   
  음식등록 : @PostMapping("/save")    
  음식수정 : @PutMapping("/{foodId}")    
  음식삭제 : @DeleteMapping("/{foodId}")    



