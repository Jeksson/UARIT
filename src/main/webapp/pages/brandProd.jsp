<%--
  Created by IntelliJ IDEA.
  User: jekss
  Date: 07.04.17
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>




<div class="products-row row">

    <!-- Carousel Heading -->
    <div class="col-lg-12 col-md-12 col-sm-12">

        <div class="carousel-heading">
            <h4>Бренды</h4>
            <div class="carousel-arrows">
                <i class="icons icon-left-dir"></i>
                <i class="icons icon-right-dir"></i>
            </div>
        </div>

    </div>
    <!-- /Carousel Heading -->

    <!-- Carousel -->
    <div class="carousel owl-carousel-wrap col-lg-12 col-md-12 col-sm-12">

        <div class="owl-carousel" data-max-items="5">
            <c:forEach var="rb" items="${randomBrand}">
                <!-- Slide -->
                <div>
                    <div class="product">
                        <a href="#">${rb} </a>
                    </div>
                </div>
                <!-- /Slide -->
            </c:forEach>

        </div>

    </div>
    <!-- /Carousel -->

</div>

