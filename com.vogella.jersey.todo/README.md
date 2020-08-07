#Jersey를 이용한 Java(JAX-RS) REST - CRUD RESTful 웹 서비스
[REST with Java (JAX-RS) using Jersey - Tutorial](https://www.vogella.com/tutorials/REST/article.html)

#Softwares and Tools
	- jdk 1.8 64bit
	- apache maven 3.5.3
	- tomcat 8.5.57 64bit
	- eclipse IDE for Java EE 2018-09 64bit
	- jersey 2.25.1
	
#step
1. Dynamic Java Project 생성
	- maven 프로젝트로 변환
2. dependency 추가
	- jersey-container-servlet 2.25.1
	- javax.servlet-api 4.0.0-b07
3. 클래스 생성
4. web.xml에 Jersey Servlet Dispatcher 정의
5. 서버실행 후 테스트 
	- URL: http://localhost:8088/vogella-jersey-todo-project/rest/todos => XML 표시
	- URL: http://localhost:8088/vogella-jersey-todo-project/rest/todos/count => TODO 항목수
	- URL: http://localhost:8088/vogella-jersey-todo-project/rest/todos/{id} => 기존  TODO 사용
		- ex) http://localhost:8088/vogella-jersey-todo-project/rest/todos/1
		- id로 TODO를 확인한다. 현재 ID가 1과 2인 TODO만 있으면 다른 모든 요청은 HTTP 오류 코드를 발생시킨다.
		- 브라우저에서는 HTTP GET 요청만 발생할수 있다.
6. 서비스를 테스트 해보기 위한 클라이언트 생성: Tester
	
