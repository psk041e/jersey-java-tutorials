#Jersey를 이용한 Java(JAX-RS) REST
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
	- jersey-media-json-jackson 2.25.1
3. 클래스 생성
4. web.xml에 Jersey Servlet Dispatcher 정의
5. 서버실행 후 테스트 
	- URL: http://localhost:8088/vogella-jersey-project/rest/hello