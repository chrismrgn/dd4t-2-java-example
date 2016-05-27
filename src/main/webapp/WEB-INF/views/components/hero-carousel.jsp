<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="pageModel" type="org.dd4t.contentmodel.Page" scope="request"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="dd4t" uri="http://www.dd4t.org/tags/2.0" %>
<jsp:useBean id="Carousel" type="org.chrismrgn.models.Carousel" scope="request"/>

<div style="background-color:green;">
	<h2>Hero Carousel</h2>
	<h3>Page Title: ${pageModel.title}</h3>
	
	<c:if test="${empty Carousel.slides}">
		<h3>Slides Count: 0</h3>
	</c:if>
	<c:if test="${!empty Carousel.slides}">
		<h3>Slides Count: ${Carousel.slides.size()}</h3>
	</c:if>
	
	<c:forEach var="slide" items="${Carousel.slides}">
		<jsp:include page="partial/hero-carousel-slide.jsp">
			<jsp:param value="${slide.title}" name="slideTitle"/>
			<jsp:param value="${slide.introduction}" name="slideIntroduction"/>
			<jsp:param value="${slide.link}" name="slideLink"/>
			<jsp:param value="${slide.image.url}" name="slideImage"/>
        </jsp:include>
        <p>test ${slide.image.url}</p>
	</c:forEach>
</div>