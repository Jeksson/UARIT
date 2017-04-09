<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="_header.jsp"/>


<!-- Main Content -->
<section class="main-content col-lg-9 col-md-9 col-sm-9 col-lg-push-3 col-md-push-3 col-sm-push-3">

    <%--<section class="slider">--%>
    <%--<div class="tp-banner-container">--%>
    <%--<div class="tp-banner">--%>
    <%--<ul>--%>
    <%--<!-- SLIDE  -->--%>
    <%--<li data-transition="fade" data-slotamount="7" data-masterspeed="1500">--%>
    <%--<!-- MAIN IMAGE -->--%>
    <%--<img src="http://www.microtron.ua/pictures/products_pictures/113/picorig_113228.jpg"--%>
    <%--alt="slidebg1" data-bgfit="cover" data-bgposition="left top"--%>
    <%--data-bgrepeat="no-repeat">--%>
    <%--<!-- LAYERS -->--%>
    <%--<div class="tp-caption skewfromrightshort fadeout"--%>
    <%--data-x="40"--%>
    <%--data-y="60"--%>
    <%--data-speed="500"--%>
    <%--data-start="1200"--%>
    <%--data-easing="Power4.easeOut"><h2>The New <strong>Laptop</strong></h2>--%>
    <%--</div>--%>
    <%--<div class="tp-caption skewfromrightshort fadeout"--%>
    <%--data-x="40"--%>
    <%--data-y="140"--%>
    <%--data-speed="500"--%>
    <%--data-start="1200"--%>
    <%--data-easing="Power4.easeOut"><h3>All the power in your hands!</h3>--%>
    <%--</div>--%>
    <%--<div class="tp-caption skewfromrightshort fadeout"--%>
    <%--data-x="40"--%>
    <%--data-y="250"--%>
    <%--data-speed="500"--%>
    <%--data-start="1200"--%>
    <%--data-easing="Power4.easeOut"><span>From <span class="price">$960.00</span></span>--%>
    <%--</div>--%>
    <%--<div class="tp-caption skewfromrightshort fadeout"--%>
    <%--data-x="40"--%>
    <%--data-y="300"--%>
    <%--data-speed="500"--%>
    <%--data-start="1200"--%>
    <%--data-easing="Power4.easeOut"><a class="button big red" href="#">Buy Now</a>--%>
    <%--</div>--%>
    <%--</li>--%>
    <%--<!-- SLIDE  -->--%>
    <%--<li data-transition="zoomout" data-slotamount="7" data-masterspeed="1000">--%>
    <%--<!-- MAIN IMAGE -->--%>
    <%--<img src="http://www.microtron.ua/pictures/products_pictures/108/picorig_108156.jpg"--%>
    <%--alt="darkblurbg" data-bgfit="cover" data-bgposition="left top"--%>
    <%--data-bgrepeat="no-repeat">--%>
    <%--<!-- LAYERS -->--%>
    <%--<div class="tp-caption skewfromrightshort fadeout"--%>
    <%--data-x="40"--%>
    <%--data-y="60"--%>
    <%--data-speed="500"--%>
    <%--data-start="1200"--%>
    <%--data-easing="Power4.easeOut"><h2><strong>The New Studio<br>Original--%>
    <%--Headphones</strong></h2>--%>
    <%--</div>--%>
    <%--<div class="tp-caption skewfromrightshort fadeout"--%>
    <%--data-x="40"--%>
    <%--data-y="190"--%>
    <%--data-speed="500"--%>
    <%--data-start="1200"--%>
    <%--data-easing="Power4.easeOut"><h3>Lorem ipsum dolor</h3>--%>
    <%--</div>--%>
    <%--<div class="tp-caption skewfromrightshort fadeout"--%>
    <%--data-x="40"--%>
    <%--data-y="300"--%>
    <%--data-speed="500"--%>
    <%--data-start="1200"--%>
    <%--data-easing="Power4.easeOut"><span>Only <span class="price">$399.00</span></span>--%>
    <%--</div>--%>
    <%--<div class="tp-caption skewfromrightshort fadeout"--%>
    <%--data-x="40"--%>
    <%--data-y="347"--%>
    <%--data-speed="500"--%>
    <%--data-start="1200"--%>
    <%--data-easing="Power4.easeOut"><a class="button big red" href="#">Shop Now</a>--%>
    <%--</div>--%>
    <%--</li>--%>
    <%--<!-- SLIDE  -->--%>
    <%--<li data-transition="zoomout" data-slotamount="7" data-masterspeed="1000">--%>
    <%--<!-- MAIN IMAGE -->--%>
    <%--<img src="http://www.microtron.ua/pictures/products_pictures/112/picorig_112488.jpg"--%>
    <%--alt="darkblurbg" data-bgfit="cover" data-bgposition="left top"--%>
    <%--data-bgrepeat="no-repeat">--%>
    <%--<!-- LAYERS -->--%>
    <%--<div class="tp-caption skewfromrightshort fadeout"--%>
    <%--data-x="40"--%>
    <%--data-y="60"--%>
    <%--data-speed="500"--%>
    <%--data-start="1200"--%>
    <%--data-easing="Power4.easeOut"><h2><strong>Lorem Ipsum Dolor</strong></h2>--%>
    <%--</div>--%>
    <%--<div class="tp-caption skewfromrightshort fadeout"--%>
    <%--data-x="40"--%>
    <%--data-y="140"--%>
    <%--data-speed="500"--%>
    <%--data-start="1200"--%>
    <%--data-easing="Power4.easeOut"><h3>All the power in your hands!</h3>--%>
    <%--</div>--%>
    <%--<div class="tp-caption skewfromrightshort fadeout"--%>
    <%--data-x="40"--%>
    <%--data-y="250"--%>
    <%--data-speed="500"--%>
    <%--data-start="1200"--%>
    <%--data-easing="Power4.easeOut"><span>From <span class="price">$990.00</span></span>--%>
    <%--</div>--%>
    <%--<div class="tp-caption skewfromrightshort fadeout"--%>
    <%--data-x="40"--%>
    <%--data-y="300"--%>
    <%--data-speed="500"--%>
    <%--data-start="1200"--%>
    <%--data-easing="Power4.easeOut"><a class="button big red" href="#">Buy Now</a>--%>
    <%--</div>--%>
    <%--</li>--%>

    <%--</ul>--%>
    <%--</div>--%>
    <%--</div>--%>
    <%--</section>--%>


    <!-- рекомендуемые товары -->
        <jsp:include page="recomendedProd.jsp"/>
    <!-- /рекомендуемые товары -->


    <!-- Новые товары -->
        <jsp:include page="newProd.jsp"/>
    <!-- /Новые товары -->


    <!-- Random товары -->
        <jsp:include page="randomProd.jsp"/>
    <!-- /Random товары -->


    <!-- Product Brands -->
        <jsp:include page="brandProd.jsp"/>
    <!-- /Product Brands -->


</section>
<!-- /Main Content -->


<!-- Sidebar -->
<aside class="sidebar col-lg-3 col-md-3 col-sm-3  col-lg-pull-9 col-md-pull-9 col-sm-pull-9">

    <!--  категории -->
    <div class="row sidebar-box purple">

        <jsp:include page="sider-boxcategories.jsp"/>

    </div>
    <!-- /категории -->


    <%--<!-- Сравнение товаров -->--%>
    <%--<div class="row sidebar-box blue">--%>

    <%--<div class="col-lg-12 col-md-12 col-sm-12">--%>

    <%--<div class="sidebar-box-heading">--%>
    <%--<i class="icons icon-docs"></i>--%>
    <%--<h4>Сравнение товаров</h4>--%>
    <%--</div>--%>

    <%--<div class="sidebar-box-content sidebar-padding-box">--%>
    <%--<p>У вас ничего нет в сравнении товаров</p>--%>
    <%--</div>--%>

    <%--</div>--%>

    <%--</div>--%>
    <%--<!-- Сравнение товаров -->--%>


    <%--<!-- Carousel -->--%>
    <%--<div class="row sidebar-box">--%>

    <%--<div class="col-lg-12 col-md-12 col-sm-12 sidebar-carousel">--%>

    <%--<!-- Slider -->--%>
    <%--<section class="sidebar-slider">--%>
    <%--<div class="sidebar-flexslider">--%>
    <%--<ul class="slides">--%>
    <%--<li>--%>
    <%--<a href="#"><img src="img/sidebar-slide1.jpg" alt="Slide1"/></a>--%>
    <%--</li>--%>
    <%--<li>--%>
    <%--<a href="#"><img src="img/sidebar-slide2.jpg" alt="Slide1"/></a>--%>
    <%--</li>--%>
    <%--<li>--%>
    <%--<a href="#"><img src="img/sidebar-slide3.jpg" alt="Slide1"/></a>--%>
    <%--</li>--%>
    <%--</ul>--%>
    <%--</div>--%>
    <%--<div class="slider-nav"></div>--%>
    <%--</section>--%>
    <%--<!-- /Slider -->--%>

    <%--</div>--%>

    <%--</div>--%>
    <%--<!-- /Carousel -->--%>


    <!-- Лучшие товары -->
    <div class="row sidebar-box red">

        <div class="col-lg-12 col-md-12 col-sm-12">

            <div class="sidebar-box-heading">
                <i class="icons icon-award-2"></i>
                <h4>Бестселлеры</h4>
            </div>

            <div class="sidebar-box-content">
                <table class="bestsellers-table">

                    <c:forEach var="randomProd" items="${randomProd}">
                        <tr>
                            <td class="product-thumbnail">
                                <a href="/productpage/${randomProd.id}"><img src="${randomProd.picture}" alt="Product1">
                                </a>
                            </td>
                            <td class="product-info">
                                <c:if test="${randomProd.name.length() < 25}">
                                    <p><a href="/productpage/${randomProd.id}">${randomProd.name}</a></p>
                                </c:if>
                                <c:if test="${randomProd.name.length() > 25}">
                                    <p><a href="/productpage/${randomProd.id}">${randomProd.name.substring(0,25)}</a></p>
                                </c:if>
                                <span class="price">${randomProd.price}</span><span class="price-a"> грн.</span>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>

        </div>


    </div>
    <!-- Лучшие товары -->


    <%--<!-- Облако тегов -->--%>
    <%--<div class="row sidebar-box green">--%>

    <%--<div class="col-lg-12 col-md-12 col-sm-12">--%>

    <%--<div class="sidebar-box-heading">--%>
    <%--<i class="icons icon-tag-6"></i>--%>
    <%--<h4>Tags Cloud</h4>--%>
    <%--</div>--%>

    <%--<div class="sidebar-box-content sidebar-padding-box">--%>
    <%--<a href="#" class="tag-item">digital camera</a>--%>
    <%--<a href="#" class="tag-item">lorem</a>--%>
    <%--<a href="#" class="tag-item">gps</a>--%>
    <%--<a href="#" class="tag-item">headphones</a>--%>
    <%--<a href="#" class="tag-item">ipsum</a>--%>
    <%--<a href="#" class="tag-item">laptop</a>--%>
    <%--<a href="#" class="tag-item">smartphone</a>--%>
    <%--<a href="#" class="tag-item">tv</a>--%>
    <%--</div>--%>

    <%--</div>--%>

    <%--</div>--%>
    <%--<!-- Облако тегов -->--%>


    <!-- Specials -->
    <%--<div class="row products-row sidebar-box orange">--%>

    <%--<div class="col-lg-12 col-md-12 col-sm-12">--%>

    <%--<!-- Carousel Heading -->--%>
    <%--<div class="carousel-heading no-margin">--%>

    <%--<h4><i class="icons icon-magic"></i> Specials</h4>--%>
    <%--<div class="carousel-arrows">--%>
    <%--<i class="icons icon-left-dir"></i>--%>
    <%--<i class="icons icon-right-dir"></i>--%>
    <%--</div>--%>

    <%--</div>--%>
    <%--<!-- /Carousel Heading -->--%>

    <%--</div>--%>

    <%--<!-- Carousel -->--%>
    <%--<div class="carousel owl-carousel-wrap col-lg-12 col-md-12 col-sm-12">--%>

    <%--<div class="owl-carousel" data-max-items="1">--%>

    <%--<!-- Slide -->--%>
    <%--<div>--%>
    <%--<!-- Carousel Item -->--%>
    <%--<div class="product">--%>

    <%--<div class="product-image">--%>
    <%--<img src="img/products/sample1.jpg" alt="Product1">--%>
    <%--<a href="products_page_v1.jsp" class="product-hover">--%>
    <%--<i class="icons icon-eye-1"></i> Quick View--%>
    <%--</a>--%>
    <%--</div>--%>

    <%--<div class="product-info">--%>
    <%--<h5><a href="products_page_v1.jsp">Lorem ipsum dolor sit amet</a></h5>--%>
    <%--<span class="price">$281.00</span>--%>
    <%--<div class="rating readonly-rating" data-score="4"></div>--%>
    <%--</div>--%>

    <%--<div class="product-actions">--%>
    <%--<span class="add-to-cart">--%>
    <%--<span class="action-wrapper">--%>
    <%--<i class="icons icon-basket-2"></i>--%>
    <%--<span class="action-name">Add to cart</span>--%>
    <%--</span>--%>
    <%--</span>--%>
    <%--<span class="add-to-favorites">--%>
    <%--<span class="action-wrapper">--%>
    <%--<i class="icons icon-heart-empty"></i>--%>
    <%--<span class="action-name">Add to wishlist</span>--%>
    <%--</span>--%>
    <%--</span>--%>
    <%--<span class="add-to-compare">--%>
    <%--<span class="action-wrapper">--%>
    <%--<i class="icons icon-docs"></i>--%>
    <%--<span class="action-name">Add to Compare</span>--%>
    <%--</span>--%>
    <%--</span>--%>
    <%--</div>--%>

    <%--</div>--%>
    <%--<!-- /Carousel Item -->--%>
    <%--</div>--%>
    <%--<!-- /Slide -->--%>


    <%--<!-- Slide -->--%>
    <%--<div>--%>
    <%--<!-- Carousel Item -->--%>
    <%--<div class="product">--%>

    <%--<div class="product-image">--%>
    <%--<img src="img/products/sample2.jpg" alt="Product1">--%>
    <%--<a href="products_page_v1.jsp" class="product-hover">--%>
    <%--<i class="icons icon-eye-1"></i> Quick View--%>
    <%--</a>--%>
    <%--</div>--%>

    <%--<div class="product-info">--%>
    <%--<h5><a href="products_page_v1.jsp">Lorem ipsum dolor sit amet</a></h5>--%>
    <%--<span class="price">$281.00</span>--%>
    <%--<div class="rating readonly-rating" data-score="4"></div>--%>
    <%--</div>--%>

    <%--<div class="product-actions">--%>
    <%--<span class="add-to-cart">--%>
    <%--<span class="action-wrapper">--%>
    <%--<i class="icons icon-basket-2"></i>--%>
    <%--<span class="action-name">Add to cart</span>--%>
    <%--</span>--%>
    <%--</span>--%>
    <%--<span class="add-to-favorites">--%>
    <%--<span class="action-wrapper">--%>
    <%--<i class="icons icon-heart-empty"></i>--%>
    <%--<span class="action-name">Add to wishlist</span>--%>
    <%--</span>--%>
    <%--</span>--%>
    <%--<span class="add-to-compare">--%>
    <%--<span class="action-wrapper">--%>
    <%--<i class="icons icon-docs"></i>--%>
    <%--<span class="action-name">Add to Compare</span>--%>
    <%--</span>--%>
    <%--</span>--%>
    <%--</div>--%>

    <%--</div>--%>
    <%--<!-- /Carousel Item -->--%>
    <%--</div>--%>
    <%--<!-- /Slide -->--%>

    <%--</div>--%>

    <%--</div>--%>
    <%--<!-- / Carousel -->--%>


    <%--</div>--%>
    <!-- /Specials -->


</aside>
<!-- /Sidebar -->

</div>
<!-- /Content -->


<!-- News -->
<div class="products-row row">

    <!-- Carousel Heading -->
    <div class="col-lg-12 col-md-12 col-sm-12">

        <div class="carousel-heading">
            <h4>Latest news &amp; Reviews</h4>
            <div class="carousel-arrows">
                <i class="icons icon-left-dir"></i>
                <i class="icons icon-right-dir"></i>
            </div>
        </div>

    </div>
    <!-- /Carousel Heading -->


    <!-- Carousel -->
    <div class="carousel owl-carousel-wrap col-lg-12 col-md-12 col-sm-12">

        <div class="owl-carousel" data-max-items="2">

            <!-- Slide -->
            <div>
                <!-- Carousel Item -->
                <article class="news">

                    <div class="news-background">

                        <div class="row">
                            <div class="col-lg-6 col-md-6 col-sm-6 news-thumbnail">
                                <a href="#"><img src="img/news/sample1.jpg" alt="News1"></a>
                            </div>
                            <div class="col-lg-6 col-md-6 col-sm-6 news-content">
                                <h5><a href="blog_post.html">Lorem Ipsum</a></h5>
                                <span class="date"><i class="icons icon-clock-1"></i> 23 April, 2012</span>
                                <p>Duis ac turpis. Integer rutrum ante eu lacus. Vestibulum libero nisl, porta vel,
                                    scelerisque eget, malesuada at, neque. Vivamus eget nibh.</p>
                            </div>
                        </div>

                    </div>

                </article>
                <!-- /Carousel Item -->
            </div>
            <!-- /Slide -->


            <!-- Slide -->
            <div>

                <!-- Carousel Item -->
                <article class="news">

                    <div class="news-background">

                        <div class="row">
                            <div class="col-lg-6 col-md-6 col-sm-6 news-thumbnail">
                                <a href="#"><img src="img/news/sample2.jpg" alt="News1"></a>
                            </div>
                            <div class="col-lg-6 col-md-6 col-sm-6 news-content">
                                <h5><a href="blog_post.html">Lorem Ipsum</a></h5>
                                <span class="date"><i class="icons icon-clock-1"></i> 23 April, 2012</span>
                                <p>Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia
                                    Curae. Suspendisse sollicitudin.</p>
                            </div>
                        </div>

                    </div>

                </article>
                <!-- /Carousel Item -->

            </div>
            <!-- /Slide -->


            <!-- Slide -->
            <div>

                <!-- Carousel Item -->
                <article class="news">

                    <div class="news-background">

                        <div class="row">
                            <div class="col-lg-6 col-md-6 col-sm-6 news-thumbnail">
                                <a href="#"><img src="img/news/sample2.jpg" alt="News1"></a>
                            </div>
                            <div class="col-lg-6 col-md-6 col-sm-6 news-content">
                                <h5><a href="blog_post.html">Lorem Ipsum</a></h5>
                                <span class="date"><i class="icons icon-clock-1"></i> 23 April, 2012</span>
                                <p>Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia
                                    Curae. Suspendisse sollicitudin.</p>
                            </div>
                        </div>

                    </div>

                </article>
                <!-- /Carousel Item -->

            </div>
            <!-- /Slide -->


            <!-- Slide -->
            <div>

                <!-- Carousel Item -->
                <article class="news">

                    <div class="news-background">

                        <div class="row">
                            <div class="col-lg-6 col-md-6 col-sm-6 news-thumbnail">
                                <a href="#"><img src="img/news/sample2.jpg" alt="News1"></a>
                            </div>
                            <div class="col-lg-6 col-md-6 col-sm-6 news-content">
                                <h5><a href="blog_post.html">Lorem Ipsum</a></h5>
                                <span class="date"><i class="icons icon-clock-1"></i> 23 April, 2012</span>
                                <p>Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia
                                    Curae. Suspendisse sollicitudin.</p>
                            </div>
                        </div>

                    </div>

                </article>
                <!-- /Carousel Item -->

            </div>
            <!-- /Slide -->


            <!-- Slide -->
            <div>

                <!-- Carousel Item -->
                <article class="news">

                    <div class="news-background">

                        <div class="row">
                            <div class="col-lg-6 col-md-6 col-sm-6 news-thumbnail">
                                <a href="#"><img src="img/news/sample2.jpg" alt="News1"></a>
                            </div>
                            <div class="col-lg-6 col-md-6 col-sm-6 news-content">
                                <h5><a href="blog_post.html">Lorem Ipsum</a></h5>
                                <span class="date"><i class="icons icon-clock-1"></i> 23 April, 2012</span>
                                <p>Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia
                                    Curae. Suspendisse sollicitudin.</p>
                            </div>
                        </div>

                    </div>

                </article>
                <!-- /Carousel Item -->

            </div>
            <!-- /Slide -->


        </div>

    </div>
    <!-- /Carousel -->

</div>
<!-- /News -->


<!-- Banner -->
<section class="banner">

    <div class="left-side-banner banner-item icon-on-right gray">
        <h4>8(802)234-5678</h4>
        <p>Monday - Saturday: 8am - 5pm PST</p>
        <i class="icons icon-phone-outline"></i>
    </div>

    <a href="#">
        <div class="middle-banner banner-item icon-on-left light-blue">
            <h4>Free shipping</h4>
            <p>on all orders over $99</p>
            <span class="button">Learn more</span>
            <i class="icons icon-truck-1"></i>
        </div>
    </a>

    <a href="#">
        <div class="right-side-banner banner-item orange">
            <h4>Crazy sale!</h4>
            <p>on selected items</p>
            <span class="button">Shop now</span>
        </div>
    </a>

</section>
<!-- /Banner -->


<!-- Footer -->
<jsp:include page="_footer.jsp"/>
<!-- Footer -->


<div id="back-to-top">
    <i class="icon-up-dir"></i>
</div>

</div>
<!-- Container -->


<!-- JavaScript -->

<script src="${pageContext.request.contextPath}/pages/js/modernizr.min.js"></script>
<script src="${pageContext.request.contextPath}/pages/js/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/pages/js/jquery-ui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/pages/js/jquery.raty.min.js"></script>


<script src="${pageContext.request.contextPath}/pages/twitter/jquery.tweet.js"></script>
<script src="${pageContext.request.contextPath}/pages/js/tinynav.min.js"></script>
<!-- Scroll Bar -->
<script src="${pageContext.request.contextPath}/pages/js/perfect-scrollbar.min.js"></script>

<!-- Cloud Zoom -->
<script src="${pageContext.request.contextPath}/pages/js/zoomsl-3.0.min.js"></script>

<!-- FancyBox -->
<script src="${pageContext.request.contextPath}/pages/js/jquery.fancybox.pack.js"></script>

<!-- jQuery REVOLUTION Slider -->
<script type="text/javascript"
        src="${pageContext.request.contextPath}/pages/js/jquery.themepunch.plugins.min.js"></script>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/pages/js/jquery.themepunch.revolution.min.js"></script>

<!-- FlexSlider -->
<script defer src="${pageContext.request.contextPath}/pages/js/flexslider.min.js"></script>

<!-- IOS Slider -->
<script src="${pageContext.request.contextPath}/pages/js/jquery.iosslider.min.js"></script>

<!-- noUi Slider -->
<script src="${pageContext.request.contextPath}/pages/js/jquery.nouislider.min.js"></script>

<!-- Owl Carousel -->
<script src="${pageContext.request.contextPath}/pages/js/owl.carousel.min.js"></script>

<!-- Cloud Zoom -->
<script src="${pageContext.request.contextPath}/pages/js/zoomsl-3.0.min.js"></script>

<!-- SelectJS -->
<script src="${pageContext.request.contextPath}/pages/js/chosen.jquery.min.js" type="text/javascript"></script>

<!-- Main JS -->


<script defer src="${pageContext.request.contextPath}/pages/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/pages/js/main-script.js"></script>


</body>

</html>