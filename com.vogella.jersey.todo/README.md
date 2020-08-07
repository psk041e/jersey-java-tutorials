#Jersey�� �̿��� Java(JAX-RS) REST - CRUD RESTful �� ����
[REST with Java (JAX-RS) using Jersey - Tutorial](https://www.vogella.com/tutorials/REST/article.html)

#Softwares and Tools
	- jdk 1.8 64bit
	- apache maven 3.5.3
	- tomcat 8.5.57 64bit
	- eclipse IDE for Java EE 2018-09 64bit
	- jersey 2.25.1
	
#step
1. Dynamic Java Project ����
	- maven ������Ʈ�� ��ȯ
2. dependency �߰�
	- jersey-container-servlet 2.25.1
	- javax.servlet-api 4.0.0-b07
3. Ŭ���� ����
4. web.xml�� Jersey Servlet Dispatcher ����
5. �������� �� �׽�Ʈ 
	- URL: http://localhost:8088/vogella-jersey-todo-project/rest/todos => XML ǥ��
	- URL: http://localhost:8088/vogella-jersey-todo-project/rest/todos/count => TODO �׸��
	- URL: http://localhost:8088/vogella-jersey-todo-project/rest/todos/{id} => ����  TODO ���
		- ex) http://localhost:8088/vogella-jersey-todo-project/rest/todos/1
		- id�� TODO�� Ȯ���Ѵ�. ���� ID�� 1�� 2�� TODO�� ������ �ٸ� ��� ��û�� HTTP ���� �ڵ带 �߻���Ų��.
		- ������������ HTTP GET ��û�� �߻��Ҽ� �ִ�.
6. ���񽺸� �׽�Ʈ �غ��� ���� Ŭ���̾�Ʈ ����: Tester
	
