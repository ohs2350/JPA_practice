# JPA_practice

JPA : ORM(Object Relational Mapping) 기술
1. 자바 ORM의 기술 표준
2. 대표적인 오픈소스로 Hibernate
3. CRUD 메소드 기본 제공
4. 쿼리를 만들지 않아도 됨
5. 1차 캐싱, 쓰기지연, 변경감지, 지연로딩 제공
6. MyBatis는 쿼리가 수정되어 데이터 정보가 바뀌면 그에 사용 되고 있던 DTO와 함께 수정해주어야 하는 반면에, JPA 는 객체만 바꾸면 된다.
7. 즉, 객체 중심으로 개발 가능
8. but 복잡한 쿼리는 해결이 어려움


MyBatis : Object Mapping 기술
1. 자바에서 SQL Mapper를 지원해주는 프레임워크
2. SQL문을 이용해서 RDB에 접근, 데이터를 객체화 시켜줌
3. SQL을 직접 작성하여 쿼리 수행 결과를 객체와 매핑
4. 쿼리문을 xml로 분리 가능
5. 복잡한 쿼리문 작성 가능
6. 데이터 캐싱 기능으로 성능 향상
7. but 객체와 쿼리문 모두 관리해야함, CRUD 메소드를 직접 다 구현해야함.

[출처] : https://velog.io/@rladuswl/ORM%EC%9D%98-%EA%B0%9C%EB%85%90-JPA%EC%99%80-MyBatis-%EC%B0%A8%EC%9D%B4
