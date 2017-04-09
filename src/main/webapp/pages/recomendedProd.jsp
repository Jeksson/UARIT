<%--
  Created by IntelliJ IDEA.
  User: jekss
  Date: 07.04.17
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>




<div class="products-row row">

    <!-- Carousel Heading -->
    <div class="col-lg-12 col-md-12 col-sm-12">

        <div class="carousel-heading">
            <h4>Рекомендуемые товары</h4>
            <div class="carousel-arrows">
                <i class="icons icon-left-dir"></i>
                <i class="icons icon-right-dir"></i>
            </div>
        </div>

    </div>
    <!-- /Carousel Heading -->

    <!-- Carousel -->
    <div class="carousel owl-carousel-wrap col-lg-12 col-md-12 col-sm-12">
        <div class="owl-carousel" data-max-items="3">
            <c:forEach var="rp" items="${recomendedProd}">
                <!-- Slide -->
                <div>
                    <!-- Carousel Item -->
                    <div class="product">

                        <div class="product-image">
                            <img src="${rp.picture}" alt="Product1">
                        </div>

                        <div class="product-info">
                            <h5><a href="/productpage/${rp.id}">
                                <c:if test="${rp.name.length() < 25}">
                                    <h5><a href="/productpage/${rp.id}">${rp.name}</a></h5>
                                </c:if>
                                <c:if test="${rp.name.length() > 25}">
                                    <h5><a href="/productpage/${rp.id}">${rp.name.substring(0,25)}</a></h5>
                                </c:if>
                            </a></h5>
                            <span class="price">${rp.price}</span><span class="price-a"> грн.</span>
                        </div>
                        <div class="product-actions">

												<span class="add-to-cart" onclick="addProductInBucket(${rp.id})">
													<span class="action-wrapper">
                                                        <i class="icons icon-basket-2"></i>
                                                            <span class="action-name">Добавить в корзину</span>
													</span>
												</span>

												<span class="add-to-favorites">
													<span class="action-wrapper">
														<i class="icons icon-heart-empty"></i>
														<span class="action-name">Добавить в список желаний</span>
													</span>
												</span>
												<span class="add-to-compare">
													<span class="action-wrapper">
														<i class="icons icon-docs"></i>
														<span class="action-name">Добавить в сравнение</span>
													</span>
												</span>
                        </div>
                    </div>
                    <!-- /Carousel Item -->
                </div>
                <!-- /Slide -->

            </c:forEach>


        </div>
    </div>
    <!-- /Carousel -->

</div>
