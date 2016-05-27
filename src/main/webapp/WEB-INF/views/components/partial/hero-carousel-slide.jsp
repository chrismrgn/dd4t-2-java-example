<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="pageModel" type="org.dd4t.contentmodel.Page" scope="request"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="dd4t" uri="http://www.dd4t.org/tags/2.0" %>
<jsp:useBean id="Carousel" type="org.chrismrgn.models.Carousel" scope="request"/>

<div style="background-color:red;">
	<p>Page Title: ${pageModel.title}</p>
	<p>Carousel Slide Count: ${Carousel.slides.size()}</p>
	<p>Slide Title: ${param.slideTitle}</p>
	<p>Slide Intro: ${param.slideIntroduction}</p>
	<p>Slide Image: ${param.slideImage}</p>
	<p>Slide Link: ${param.slideLink}</p>
</div>