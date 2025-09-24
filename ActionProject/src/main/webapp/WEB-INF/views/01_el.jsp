<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.kh.el.model.vo.Person" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL구문 짱좋아요~~~이히히</title>
</head>
<body>

	<h1>EL구문 배울거임 진짜 좋음</h1>

	<h3>기존방식 사용</h3>
	<%-- 
	<%
		// requestScope => classRoom, student
		String classRoom = (String)request.getAttribute("classRoom");
		Person student = (Person)request.getAttribute("student");
		
		// sessionScope => academy, lecture
		String academy = (String)session.getAttribute("academy");
		Person lecture = (Person)session.getAttribute("lecture");
	%>
	
	<p>
		학원명 : <%= academy %> <br>
		강의장 : <%= classRoom %> <br>
		강사정보 : <%= lecture.getName() %>, <%= lecture.getAge() %>, <%= lecture.getAddress() %> <br>
		수강생의 정보
		<ul>
			<li>이름 : <%= student.getName() %></li>
			<li>나이 : <%= student.getAge() %></li>
			<li>주소 : <%= student.getAddress() %></li>
		</ul>
	</p>
	--%>
	
	<hr>
	
	<h3>EL 구문을 이용해서 request / session에 담긴 값들을 출력</h3>
	
	<p>
		학원명 : ${ academy } <br>
		강의장 : ${ classRoom } <br>
		강사정보 : ${ lecture.name }, ${ lecture.age }, ${ lecture.address } <br>
		<!--  
			실제로 필드에 직접 접근한게 아님
			name -> getName()
			내부적으로 getter메소드를 찾아서 호출해서 값을 출력해주는 구조

			lecture에 접근했을 때 value는 Person타입 객체
			해당 Person객체의 각 필드값을 출력하려고 한다면 키값.필드명을 작성하면
			해당 필드에 네이밍컨벤션에 부합하는 getter를 찾아서 호출해줌
		-->
	</p>
	
	<%--
		int num = (int)request.getAttribute("num");
	--%>
	
	<p>없는 키값을 출력하는 경우</p>
	<p>출력식을 사용함 : &lt;%=  %> </p>
	<p>EL구문을 사용함 : ${ sdfsdfsd } </p>
	
	<h3>3. EL 사용 시 키 값이 동일한 경우</h3>

	key 라는 키 값에 담긴 밸류 : ${ key } <br>

	<%
		// pageScope에 속성추가
		pageContext.setAttribute("key", "pageKey");
	%>

	다시 출력해보기 : ${ key }	<br>
	
	<!-- 
		EL 구문은 가장 작은 범위의 scope부터 키값을 검색함
		
		page => request => session => application 순으로 키값을 찾음
		
		모든 영역에 키가 존재하지 않았다?
		아무일도 일어나지 않음 오류 안남~
	-->
	
	pageScope에 값이 담겨있는데, 다른 Scope의 값을 사용하고 싶다면? <br>
	
	==> Scope에 직접 접근하기 <br>
	
	requestScope : ${ requestScope.key } <br>
	sessionScope : ${ sessionScope.key } <br>
	applicationScope : ${ applicationScope.key } <br>
	
	<hr>
	
	<h2>EL 구문을 이용해서 연산해보기</h2>
	
	<p>
		산술연산
		
		big + small = ${ big + small } <br>
		big - small = ${ big - small } <br>
		big X small = ${ big * small } <br>
		big / small = ${ big / small } 또는 ${ big div small }<br>
		big % small = ${ big % small } 또는 ${ big mod small }<br>
	</p>
	
	<hr>
	
	<h3>숫자간의 대소비교 연산</h3>
	
	<p>
		big이 small보다 크니? : ${ big > small } 또는 ${ big gt small }<br>
		big이 small보다 작니? : ${ big < small } 또는 ${ big lt small }<br>
		big이 small보다 크거나 같니? : ${ big >= small } 또는 ${ big ge small }<br>
		big이 small보다 작거나 같니? : ${ big <= small } 또는 ${ big le small }<br>
	</p>
	
	<hr>
	
	<h3>동등비교 연산</h3>
	
	<p>
		big과 small이 같습니까? : ${ big == small } 또는 ${ big eq small } <br>
		big과 10이 같습니까? : ${ big == 10 } 또는 ${ big eq 10 } <br>
		strOne과 strTwo가 같습니까? : ${ strOne == strTwo }
	</p>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>