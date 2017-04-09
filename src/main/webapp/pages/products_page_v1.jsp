<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="_header.jsp"/>


		<!-- Container -->
		<div class="container">

			<!-- Content -->
			<div class="row content">
            	
                
                <div class="col-lg-12 col-md-12 col-sm-12">
                	<div class="breadcrumbs">
                    	<p><a href="/">Главная</a> <i class="icons icon-right-dir"></i>
                            <a href="#">${prodCat1}</a> <i class="icons icon-right-dir"></i>
                            <a href="#">${prodCat2}</a> <i class="icons icon-right-dir"></i>
                            <a>${prodName}</a>
                        </p>
                    </div>
                </div>
                
                
				<!-- Main Content -->
				<section class="main-content col-lg-9 col-md-9 col-sm-9">
					
					
                    <div id="product-single">
					
						<!-- Product -->
						<div class="product-single">
							
							<div class="row">
								
								<!-- Product Images Carousel -->
								<div class="col-lg-5 col-md-5 col-sm-5 product-single-image">
									
									<div id="product-slider">
										<ul class="slides">
											<li>
												<img class="cloud-zoom" src="${prodPicture}" data-large="${prodPicture}" alt="" />
												<a class="fullscreen-button" href="${prodPicture}">
													<div class="product-fullscreen">
														<i class="icons icon-resize-full-1"></i>
													</div>
												</a>
											</li>
										</ul>
									</div>
									<%--<div id="product-carousel">--%>
										<%--<ul class="slides">--%>
											<%--<li>--%>
												<%--<a class="fancybox" rel="product-images" href="img/products/single1.jpg"></a>--%>
												<%--<img src="img/products/single1.jpg" data-large="img/products/single1.jpg" alt=""/>--%>
											<%--</li>--%>
											<%--<li>--%>
												<%--<a class="fancybox" rel="product-images" href="img/products/single2.jpg"></a>--%>
												<%--<img src="img/products/single2.jpg" data-large="img/products/single2.jpg" alt="" />--%>
											<%--</li>--%>
											<%--<li>--%>
												<%--<a class="fancybox" rel="product-images" href="img/products/single3.jpg"></a>--%>
												<%--<img src="img/products/single3.jpg" data-large="img/products/single3.jpg" alt="" />--%>
											<%--</li>--%>
											<%--<li>--%>
												<%--<a class="fancybox" rel="product-images" href="img/products/single4.jpg"></a>--%>
												<%--<img src="img/products/single4.jpg" data-large="img/products/single4.jpg" alt="" />--%>
											<%--</li>--%>
											<%--<li>--%>
												<%--<a class="fancybox" rel="product-images" href="img/products/single5.jpg"></a>--%>
												<%--<img src="img/products/single5.jpg" data-large="img/products/single5.jpg" alt="" />--%>
											<%--</li>--%>
										<%--</ul>--%>
										<%--<div class="product-arrows">--%>
											<%--<div class="left-arrow">--%>
												<%--<i class="icons icon-left-dir"></i>--%>
											<%--</div>--%>
											<%--<div class="right-arrow">--%>
												<%--<i class="icons icon-right-dir"></i>--%>
											<%--</div>--%>
										<%--</div>--%>
									<%--</div>--%>
								</div>
								<!-- /Product Images Carousel -->
								
								
								<div class="col-lg-7 col-md-7 col-sm-7 product-single-info">
									
									<h2>${prodName}</h2>
									<%--<div class="rating-box">--%>
										<%--<div class="rating readonly-rating" data-score="4"></div>--%>
										<%--<span>3 Review(s)</span>--%>
									<%--</div>--%>
									<table>
										<tr>
											<td>Производитель</td>
											<td>${prodManuf}</td>
										</tr>
                                        <tr>
                                            <td>Код</td>
                                            <td>${prodId}</td>
                                        </tr>


									</table>

									
									<span class="price">${prodPrice}</span><span class="price-a"> грн.</span>
									
									<table class="product-actions-single">
										<%--<tr>--%>
											<%--<td>Color:</td>--%>
											<%--<td>--%>
												<%--<select class="chosen-select">--%>
													<%--<option>Red +$25.00</option>--%>
													<%--<option>Red +$25.00</option>--%>
													<%--<option>Red +$25.00</option>--%>
													<%--<option>Red +$25.00</option>--%>
												<%--</select>--%>
											<%--</td>--%>
										<%--</tr>--%>
										<tr>
											<td>Количество: </td>
											<td>
												<div class="numeric-input">
													<input type="text" value="1">
													<span class="arrow-up"><i class="icons icon-up-dir"></i></span>
													<span class="arrow-down"><i class="icons icon-down-dir"></i></span>
												</div>
												<a href="#">
													<span class="add-to-cart">
														<span class="action-wrapper">
															<i class="icons icon-basket-2"></i>
															<span class="action-name">Добавить в корзину</span>
														</span >
													</span>
												</a>
											</td>
										</tr>
									</table> 
									
									<div class="product-actions">
										<span class="add-to-favorites">
											<span class="action-wrapper">
												<i class="icons icon-heart-empty"></i>
												<span class="action-name">Add to wishlist</span>
											</span>
										</span>
										<span class="add-to-compare">
											<span class="action-wrapper">
												<i class="icons icon-docs"></i>
												<span class="action-name">Add to compare</span>
											</span>
										</span>
										<span class="green product-action">
											<span class="action-wrapper">
												<i class="icons icon-info"></i>
												<span class="action-name">Ask a question</span>
											</span>
										</span>
									</div>
									
									<%--<div class="social-share">--%>
											<%--<iframe src="http://www.facebook.com/plugins/like.php?href=https%3A%2F%2Fdevelopers.facebook.com%2Fdocs%2Fplugins%2F&amp;width&amp;layout=button_count&amp;action=like&amp;show_faces=false&amp;share=false&amp;height=21" style="border:none; overflow:hidden; height:21px; width:100px;"></iframe>--%>
											<%----%>
											<%--<iframe --%>
			<%--src="https://platform.twitter.com/widgets/tweet_button.html"--%>
			<%--style="width:100px; height:20px;"></iframe>--%>
			<%----%>
											<%--<!-- Place this tag where you want the +1 button to render. -->--%>
											<%--<div class="g-plusone" data-size="medium"></div>--%>
											<%----%>
											<%--<!-- Place this tag after the last +1 button tag. -->--%>
											<%--<script type="text/javascript">--%>
											  <%--(function() {--%>
												<%--var po = document.createElement('script'); po.type = 'text/javascript'; po.async = true;--%>
												<%--po.src = '../../apis.google.com/js/platform.js';--%>
												<%--var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(po, s);--%>
											  <%--})();--%>
											<%--</script>--%>
											<%----%>
											<%----%>
											<%--<a href="http://www.pinterest.com/pin/create/button/?url=http%3A%2F%2Fwww.flickr.com%2Fphotos%2Fkentbrew%2F6851755809%2F&amp;media=http%3A%2F%2Ftest.ratkosolar.com%2Fhomeshop%2F15-blog_post.html&amp;description=Next%20stop%3A%20Pinterest" data-pin-do="buttonPin" data-pin-config="beside" class="pinterest"><img src="../../assets.pinterest.com/images/pidgets/pinit_fg_en_rect_gray_20.png" /></a>--%>
											<%--<!-- Please call pinit.js only once per page -->--%>
											<%--<script type="text/javascript" async src="../../assets.pinterest.com/js/pinit.js"></script>--%>
											<%----%>
										<%--</div>--%>
									
								</div>
								
							</div>
							
						</div>
						<!-- /Product -->
						
						
						<!-- Product Tabs -->
						<div class="row">
							
							<div class="col-lg-12 col-md-12 col-sm-12">
								
								<div class="tabs">
								
									<div class="tab-heading">
										<a href="#tab1" class="button big">Описание</a>
										<a href="#tab2" class="button big">Обзор</a>
										<a href="#tab3" class="button big">Коментарии</a>
									</div>
									
									<div class="page-content tab-content">
										
										<div id="tab1">
											<p>Aliquam erat volutpat. Duis ac turpis. Donec sit amet eros. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Mauris fermentum dictum magna. Sed laoreet aliquam leo. Ut tellus dolor, dapibus eget, elementum vel, cursus eleifend, elit. Aenean auctor wisi et urna. Aliquam erat volutpat. Duis ac turpis. Integer rutrum ante eu lacus. Vestibulum libero nisl, porta vel, scelerisque eget, malesuada at, neque. Vivamus eget nibh. Etiam cursus leo vel metus. Nulla facilisi. Aenean nec eros. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Suspendisse sollicitudin velit sed leo. </p>
											
											<p><strong>Specifications:</strong></p>
											<ul>
												<li><i class="icons icon-right-dir"></i> Speaker type: Hi-Definition MicroSpeaker</li>
												<li><i class="icons icon-right-dir"></i> Frequency range: 25Hz-18.5kHz</li>
												<li><i class="icons icon-right-dir"></i> Impedance (1kHz): 26 Ohms</li>
												<li><i class="icons icon-right-dir"></i> Sensitivity (1mW): 114 dB SPL/mW</li>
												<li><i class="icons icon-right-dir"></i> Cable length (with extension): 18.0 in./45.0 cm (54.0 in./137.1 cm)</li>
											</ul>
											
											<p>Ut pharetra augue nec augue. Nam elit agna,endrerit sit amet, tincidunt ac, viverra sed, nulla. Donec porta diam eu massa. Quisque diam lorem, interdum vitae,dapibus ac, scelerisque vitae, pede. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Mauris fermentum dictum magna. Sed laoreet aliquam leo. Ut tellus dolor, dapibus eget, elementum vel, cursus eleifend, elit. Aenean auctor wisi et urna. Aliquam erat volutpat. Duis ac turpis. Integer rutrum ante eu lacus. <br><br>
	Ut pharetra augue nec augue. Nam elit agna,endrerit sit amet, tincidunt ac, viverra sed, nulla. Donec porta diam eu massa. Quisque diam lorem, interdum vitae,dapibus ac, scelerisque vitae, pede. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Mauris fermentum dictum magna. Sed laoreet aliquam leo. Ut tellus dolor, dapibus eget, elementum vel, cursus eleifend, elit. Aenean auctor wisi et urna. Aliquam erat volutpat. Duis ac turpis. Integer rutrum ante eu lacus. </p>
											<p class="tags home-green"><strong>Tags:</strong> <a href="#" class="tag-item">digital camera</a>
											<a href="#" class="tag-item">lorem</a>
											<a href="#" class="tag-item">gps</a></p>
										</div>
										
										<div id="tab2">
											
											<div class="row">
												
												<div class="col-lg-6 col-md-6 col-sm-6">
													<div class="category-results">
														<p>Results 1-6 of 6</p>
													</div>
												</div>
												
												<div class="col-lg-6 col-md-6 col-sm-6">
													<div class="pagination">
														<a href="#"><div class="previous"><i class="icons icon-left-dir"></i></div></a>
														<a href="#"><div class="page-button">1</div></a>
														<a href="#"><div class="page-button">2</div></a>
														<a href="#"><div class="page-button">3</div></a>
														<a href="#"><div class="next"><i class="icons icon-right-dir"></i></div></a>
													</div>
												</div>
											
											</div>
											
											<ul class="comments">
												<li>
													<p><strong><a href="#">Anna Doe</a></strong></p>
													<span class="date">2013-10-09 09:23</span>
													<i class="icons green icon-thumbs-up-alt"></i>
													<i class="icons sum no-pointer green-sum">1</i>
													<i class="icons red icon-thumbs-down-alt"></i>
													<i class="icons icon-reply"></i>
													<div class="rating-box">
														<div class="rating readonly-rating" data-score="4"></div>
													</div>
													<br>
													<p>Ut tellus dolor, dapibus eget, elementum vel, cursus eleifend, elit. Aenean auctor wisi et urna. Aliquam erat volutpat. Duis ac turpis. Integer rutrum ante eu lacus.Vestibulum libero nisl, porta vel, scelerisque eget, malesuada at, neque.</p>
													
												</li>
												<li>
													<p><strong><a href="#">Anna Doe</a></strong></p>
													<span class="date">2013-10-09 09:23</span>
													<i class="icons green icon-thumbs-up-alt"></i>
													<i class="icons sum no-pointer">0</i>
													<i class="icons red icon-thumbs-down-alt"></i>
													<i class="icons icon-reply"></i>
													<div class="rating-box">
														<div class="rating readonly-rating" data-score="4"></div>
													</div>
													<br>
													<p>Ut tellus dolor, dapibus eget, elementum vel, cursus eleifend, elit. Aenean auctor wisi et urna. Aliquam erat volutpat. Duis ac turpis. Integer rutrum ante eu lacus.Vestibulum libero nisl, porta vel, scelerisque eget, malesuada at, neque.</p>
													
													<ul>
														<li>
															<p><strong><a href="#">Anna Doe</a></strong></p>
															<p>Ut tellus dolor, dapibus eget, elementum vel, cursus eleifend, elit. Aenean auctor wisi et urna. Aliquam erat volutpat. Duis ac turpis. Integer rutrum ante eu lacus.Vestibulum libero nisl, porta vel, scelerisque eget, malesuada at, neque.</p>
														</li>
													</ul>
												</li>
												<li>
													<p><strong><a href="#">Anna Doe</a></strong></p>
													<span class="date">2013-10-09 09:23</span>
													<i class="icons green icon-thumbs-up-alt"></i>
													<i class="icons sum no-pointer red-sum">-2</i>
													<i class="icons red icon-thumbs-down-alt"></i>
													<i class="icons icon-reply"></i>
													<div class="rating-box">
														<div class="rating readonly-rating" data-score="4"></div>
													</div>
													<br>
													<p>Ut tellus dolor, dapibus eget, elementum vel, cursus eleifend, elit. Aenean auctor wisi et urna. Aliquam erat volutpat. Duis ac turpis. Integer rutrum ante eu lacus.Vestibulum libero nisl, porta vel, scelerisque eget, malesuada at, neque.</p>
													
												</li>
											</ul>
											
											<h3>WRITE A REVIEW</h3>
											<p>Now please write a (short) review....(min. 200, max. 2000 characters)</p>
											<textarea id="review-textarea"></textarea>
											<p>First: Rate the product. Please select a rating between 0 (poorest) and 5 stars (best)</p>
											<div class="rating-box">
												Rating: 
												<div class="rating rate" data-score="3"></div>
											</div>
											<div class="char-counter">
												<label>Characters written</label>
												<input data-target="#review-textarea" type="text">
											</div>
											<br>
											<input type="submit" class="dark-blue big" value="Submit a review">
											
											
										</div>
										
										<div id="tab3">
											<ul class="comments">
												<li>
													<p><strong><a href="#">Anna Doe</a></strong></p>
													<span class="date">2013-10-09 09:23</span>
													<i class="icons icon-reply"></i>
													<p>Ut tellus dolor, dapibus eget, elementum vel, cursus eleifend, elit. Aenean auctor wisi et urna. Aliquam erat volutpat. Duis ac turpis. Integer rutrum ante eu lacus.Vestibulum libero nisl, porta vel, scelerisque eget, malesuada at, neque.</p>
													
												</li>
												<li>
													<p><strong><a href="#">Anna Doe</a></strong></p>
													<span class="date">2013-10-09 09:23</span>
													<i class="icons icon-reply"></i>
													<p>Ut tellus dolor, dapibus eget, elementum vel, cursus eleifend, elit. Aenean auctor wisi et urna. Aliquam erat volutpat. Duis ac turpis. Integer rutrum ante eu lacus.Vestibulum libero nisl, porta vel, scelerisque eget, malesuada at, neque.</p>
													
													<ul>
														<li>
															<p><strong><a href="#">Anna Doe</a></strong></p>
															<p>Ut tellus dolor, dapibus eget, elementum vel, cursus eleifend, elit. Aenean auctor wisi et urna. Aliquam erat volutpat. Duis ac turpis. Integer rutrum ante eu lacus.Vestibulum libero nisl, porta vel, scelerisque eget, malesuada at, neque.</p>
														</li>
													</ul>
												</li>
												<li>
													<p><strong><a href="#">Anna Doe</a></strong></p>
													<span class="date">2013-10-09 09:23</span>
													<i class="icons icon-reply"></i>
													<p>Ut tellus dolor, dapibus eget, elementum vel, cursus eleifend, elit. Aenean auctor wisi et urna. Aliquam erat volutpat. Duis ac turpis. Integer rutrum ante eu lacus.Vestibulum libero nisl, porta vel, scelerisque eget, malesuada at, neque.</p>
												</li>
											</ul>
											<a href="#" class="button home-green"><i class="icons icon-spinner"></i> Refresh comments list</a>
											<a href="#" class="button orange"><i class="icons icon-rss"></i> RSS feed for comments to this post</a>
											<br/><br/>
											<div class="row">
												
												<div class="col-lg-6 col-md-6 col-sm-8">
													<h3>ADD A COMMENT</h3>
													<label>Name (required)</label>
													<input type="text">
													<br><br>
													<label>E-mail (required, but will not display)</label>
													<input type="text">
													<br><br>
													<label>Website (required)</label>
													<input type="text">
													<br><br>
													<label>Comment (required)</label>
													<textarea></textarea>
													<br><br>
													<input id="comments-checkbox" type="checkbox"><label for="comments-checkbox">Notify me of follow-up comments</label>
													<br><br>
													<img src="img/captcha.jpg" alt="">
													<br><br>
													<div class="row">
														
														<div class="col-lg-6 col-md-6 col-sm-6">
															<label><a href="#">Refresh</a></label>
															<input type="text">
														</div>
														
													</div>
													<br>
													<input type="submit" value="Submit comment" class="dark-blue big">
													
												</div>
												
											</div>
											
										</div>
										
									</div>
									
								</div>
								
							</div>
							
						</div>
						<!-- /Product Tabs -->
					
					</div>


                    <!-- Новые товары -->
                    <div class="products-row row">

                        <!-- Carousel Heading -->
                        <div class="col-lg-12 col-md-12 col-sm-12">

                            <div class="carousel-heading">
                                <h4>Новые товары</h4>
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

                                <c:forEach var="np" items="${newProd}">

                                    <!-- Slide -->
                                    <div>
                                        <!-- Carousel Item -->
                                        <div class="product">

                                            <div class="product-image">
                                                <img src="${np.picture}" alt="Product1">
                                            </div>

                                            <div class="product-info">

                                                <c:if test="${np.name.length() < 25}">
                                                    <h5><a href="/productpage/${np.id}">${np.name}</a></h5>
                                                </c:if>
                                                <c:if test="${np.name.length() > 25}">
                                                    <h5><a href="/productpage/${np.id}">${np.name.substring(0,25)}</a></h5>
                                                </c:if>
                                                <span class="price">${np.price}</span><span class="price-a"> грн.</span>

                                            </div>

                                            <div class="product-actions">
												<span class="add-to-cart">
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
                    <!-- /Новые товары -->
					



					
					<!-- недавно просмотренные -->
					<div class="products-row row">
						
						<!-- Carousel Heading -->
						<div class="col-lg-12 col-md-12 col-sm-12">
							
							<div class="carousel-heading">
								<h4>Недавно просмотренные товары</h4>
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
									
									<!-- Slide -->
									<div>
										<!-- Carousel Item -->
										<div class="product">
											
											<div class="product-image">
												<img src="img/products/sample4.jpg" alt="Product1">
												<a href="products_page_v1.jsp" class="product-hover">
													<i class="icons icon-eye-1"></i> Quick View
												</a>
											</div>
											
											<div class="product-info">
												<h5><a href="products_page_v1.jsp">Lorem ipsum dolor sit amet</a></h5>
												<p class="product-categories"><a href="#">Computers &amp; Tablets</a></p>
											</div>
											
										</div>
										<!-- /Carousel Item -->
									</div>
									<!-- /Slide -->
									
									
									<!-- Slide -->
									<div>
										<!-- Carousel Item -->
										<div class="product">
											
											<div class="product-image">
												<img src="img/products/sample5.jpg" alt="Product1">
												<a href="products_page_v1.jsp" class="product-hover">
													<i class="icons icon-eye-1"></i> Quick View
												</a>
											</div>
											
											<div class="product-info">
												<h5><a href="products_page_v1.jsp">Lorem ipsum dolor sit amet</a></h5>
												<p class="product-categories"><a href="#">Computers &amp; Tablets</a></p>
											</div>
											
										</div>
										<!-- /Carousel Item -->
									</div>
									<!-- /Slide -->
									
									
									
									<!-- Slide -->
									<div>
										<!-- Carousel Item -->
										<div class="product">
											
											<div class="product-image">
												<img src="img/products/sample6.jpg" alt="Product1">
												<a href="products_page_v1.jsp" class="product-hover">
													<i class="icons icon-eye-1"></i> Quick View
												</a>
											</div>
											
											<div class="product-info">
												<h5><a href="products_page_v1.jsp">Lorem ipsum dolor sit amet</a></h5>
												<p class="product-categories"><a href="#">Computers &amp; Tablets</a></p>
											</div>
											
										</div>
										<!-- /Carousel Item -->
									</div>
									<!-- /Slide -->
									
									
									
									
									<!-- Slide -->
									<div>
										<!-- Carousel Item -->
										<div class="product">
											
											<div class="product-image">
												<img src="img/products/sample7.jpg" alt="Product1">
												<a href="products_page_v1.jsp" class="product-hover">
													<i class="icons icon-eye-1"></i> Quick View
												</a>
											</div>
											
											<div class="product-info">
												<h5><a href="products_page_v1.jsp">Lorem ipsum dolor sit amet</a></h5>
												<p class="product-categories"><a href="#">Computers &amp; Tablets</a></p>
											</div>
											
										</div>
										<!-- /Carousel Item -->
									</div>
									<!-- /Slide -->
									
									
									
									
									<!-- Slide -->
									<div>
										<!-- Carousel Item -->
										<div class="product">
											
											<div class="product-image">
												<img src="img/products/sample8.jpg" alt="Product1">
												<a href="products_page_v1.jsp" class="product-hover">
													<i class="icons icon-eye-1"></i> Quick View
												</a>
											</div>
											
											<div class="product-info">
												<h5><a href="products_page_v1.jsp">Lorem ipsum dolor sit amet</a></h5>
												<p class="product-categories"><a href="#">Computers &amp; Tablets</a></p>
											</div>
											
										</div>
										<!-- /Carousel Item -->
									</div>
									<!-- /Slide -->
									
									
									
									
									
									<!-- Slide -->
									<div>
										<!-- Carousel Item -->
										<div class="product">
											
											<div class="product-image">
												<img src="img/products/sample9.jpg" alt="Product1">
												<a href="products_page_v1.jsp" class="product-hover">
													<i class="icons icon-eye-1"></i> Quick View
												</a>
											</div>
											
											<div class="product-info">
												<h5><a href="products_page_v1.jsp">Lorem ipsum dolor sit amet</a></h5>
												<p class="product-categories"><a href="#">Computers &amp; Tablets</a></p>
											</div>
											
										</div>
										<!-- /Carousel Item -->
									</div>
									<!-- /Slide -->
									
									
							</div>
						</div>
						<!-- /Carousel -->
						
						
					</div>
					<!-- /Recently Viewed Products -->
					
					
					
					<!-- кнопки -->
					<div class="row button-row">
						
						<div class="col-lg-5 col-md-5 col-sm-5">
							<a class="button grey regular" href="#"><i class="icons icon-reply"></i> BACK TO: Computers &amp; Tablets</a>
						</div>
						
						<div class="col-lg-7 col-md-7 col-sm-7 align-right">
							<a class="button grey regular" href="#"><i class="icons icon-left-dir"></i> Предыдущий</a>
							<a class="button grey regular right-icon" href="#">Следующий <i class="icons icon-right-dir"></i></a>
						</div>
					
					</div>
					<!-- /Product Buttons -->
					
					
				</section>
				<!-- /Main Content -->
				
				
				
				
				<!-- Sidebar -->
				<aside class="sidebar right-sidebar col-lg-3 col-md-3 col-sm-3">

                    <!--  категории -->
                    <div class="row sidebar-box purple">

						<jsp:include page="sider-boxcategories.jsp"/>

                    </div>
                    <!-- /категории -->
					
					
					<%--<!-- Compare Products -->--%>
					<%--<div class="row sidebar-box blue">--%>
						<%----%>
						<%--<div class="col-lg-12 col-md-12 col-sm-12">--%>
							<%----%>
							<%--<div class="sidebar-box-heading">--%>
                            	<%--<i class="icons icon-docs"></i>--%>
								<%--<h4>Compare Products</h4>--%>
							<%--</div>--%>
							<%--<div class="sidebar-box-content">--%>
                                <%--<table class="compare-table">--%>
                                    <%----%>
                                    <%--<tr>--%>
                                        <%--<td class="product-thumbnail"><img src="img/products/sample1.jpg" alt="Product1"></td>--%>
                                        <%--<td class="product-info">--%>
                                            <%--<p><a href="#">Lorem ipsum dolor sit amet</a></p>--%>
                                            <%--<a href="#" class="remove">Remove</a>--%>
                                        <%--</td>--%>
                                    <%--</tr>--%>
                                    <%----%>
                                    <%--<tr>--%>
                                        <%--<td class="product-thumbnail"><img src="img/products/sample2.jpg" alt="Product1"></td>--%>
                                        <%--<td class="product-info">--%>
                                            <%--<p><a href="#">Lorem ipsum dolor sit amet</a></p>--%>
                                            <%--<a href="#" class="remove">Remove</a>--%>
                                        <%--</td>--%>
                                    <%--</tr>--%>
                                    <%----%>
                                <%--</table>--%>
                                <%--<div class="padding-box">--%>
                                	<%--<a class="button grey">Go to compare</a>--%>
                                <%--</div>--%>
							<%--</div>--%>
						<%--</div>--%>
						<%----%>
					<%--</div>--%>
					<%--<!-- /Compare Products -->--%>
					
					
					<%--<!-- Carousel -->--%>
					<%--<div class="row sidebar-box">--%>
						<%----%>
						<%--<div class="col-lg-12 col-md-12 col-sm-12 sidebar-carousel">--%>
							<%----%>
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
                            <%----%>
						<%--</div>--%>
						<%----%>
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

                                    <c:forEach var="rp" items="${randomProd}">
                                        <tr>
                                            <td class="product-thumbnail">
                                                <a href="#"><img src="${rp.picture}" alt="Product1">
                                                </a>
                                            </td>
                                            <td class="product-info">
                                                <c:if test="${rp.name.length() < 25}">
                                                    <p><a href="/productpage/${rp.id}">${rp.name}</a></p>
                                                </c:if>
                                                <c:if test="${rp.name.length() > 25}">
                                                    <p><a href="/productpage/${rp.id}">${rp.name.substring(0,25)}</a></p>
                                                </c:if>
                                                <span class="price">${rp.price}</span><span class="price-a"> грн.</span>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </table>
                            </div>

                        </div>


                    </div>
                    <!-- Лучшие товары -->
					
					
					<%--<!-- Tag Cloud -->--%>
					<%--<div class="row sidebar-box green">--%>
						<%----%>
						<%--<div class="col-lg-12 col-md-12 col-sm-12">--%>
							<%----%>
							<%--<div class="sidebar-box-heading">--%>
                            	<%--<i class="icons icon-tag-6"></i>--%>
								<%--<h4>Tags Cloud</h4>--%>
							<%--</div>--%>
							<%----%>
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
								<%----%>
						<%--</div>--%>
						<%----%>
					<%--</div>--%>
					<%--<!-- /Tag Cloud -->--%>
					
					
					<%--<!-- Specials -->--%>
					<%--<div class="row products-row sidebar-box orange">--%>
						 <%----%>
						<%--<div class="col-lg-12 col-md-12 col-sm-12">--%>
							<%----%>
							<%--<!-- Carousel Heading -->--%>
							<%--<div class="carousel-heading no-margin">--%>
								<%----%>
								<%--<h4><i class="icons icon-magic"></i> Specials</h4>--%>
								<%--<div class="carousel-arrows">--%>
									<%--<i class="icons icon-left-dir"></i>--%>
									<%--<i class="icons icon-right-dir"></i>--%>
								<%--</div>--%>
								<%----%>
							<%--</div>--%>
							<%--<!-- /Carousel Heading -->--%>
							<%----%>
						<%--</div>--%>
						<%----%>
						<%--<!-- Carousel -->--%>
						<%--<div class="carousel owl-carousel-wrap col-lg-12 col-md-12 col-sm-12">--%>
							<%----%>
							<%--<div class="owl-carousel" data-max-items="1">--%>
									<%----%>
								<%--<!-- Slide -->--%>
								<%--<div>--%>
									<%--<!-- Carousel Item -->--%>
									<%--<div class="product">--%>
										<%----%>
										<%--<div class="product-image">--%>
											<%--<img src="img/products/sample1.jpg" alt="Product1">--%>
											<%--<a href="products_page_v1.jsp" class="product-hover">--%>
												<%--<i class="icons icon-eye-1"></i> Quick View--%>
											<%--</a>--%>
										<%--</div>--%>
										<%----%>
										<%--<div class="product-info">--%>
											<%--<h5><a href="products_page_v1.jsp">Lorem ipsum dolor sit amet</a></h5>--%>
											<%--<span class="price">$281.00</span>--%>
											<%--<div class="rating readonly-rating" data-score="4"></div>--%>
										<%--</div>--%>
										<%----%>
										<%--<div class="product-actions">--%>
											<%--<span class="add-to-cart">--%>
												<%--<span class="action-wrapper">--%>
													<%--<i class="icons icon-basket-2"></i>--%>
													<%--<span class="action-name">Add to cart</span>--%>
												<%--</span >--%>
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
										<%----%>
									<%--</div>--%>
									<%--<!-- /Carousel Item -->--%>
								<%--</div>--%>
								<%--<!-- /Slide -->--%>
								<%----%>
								<%----%>
								<%--<!-- Slide -->--%>
								<%--<div>--%>
									<%--<!-- Carousel Item -->--%>
									<%--<div class="product">--%>
										<%----%>
										<%--<div class="product-image">--%>
											<%--<img src="img/products/sample2.jpg" alt="Product1">--%>
											<%--<a href="products_page_v1.jsp" class="product-hover">--%>
												<%--<i class="icons icon-eye-1"></i> Quick View--%>
											<%--</a>--%>
										<%--</div>--%>
										<%----%>
										<%--<div class="product-info">--%>
											<%--<h5><a href="products_page_v1.jsp">Lorem ipsum dolor sit amet</a></h5>--%>
											<%--<span class="price">$281.00</span>--%>
											<%--<div class="rating readonly-rating" data-score="4"></div>--%>
										<%--</div>--%>
										<%----%>
										<%--<div class="product-actions">--%>
											<%--<span class="add-to-cart">--%>
												<%--<span class="action-wrapper">--%>
													<%--<i class="icons icon-basket-2"></i>--%>
													<%--<span class="action-name">Add to cart</span>--%>
												<%--</span >--%>
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
										<%----%>
									<%--</div>--%>
									<%--<!-- /Carousel Item -->--%>
								<%--</div>--%>
								<%--<!-- /Slide -->--%>
								<%----%>
							<%--</div>--%>
						<%----%>
						<%--</div>--%>
						<%--<!-- / Carousel -->--%>
						<%----%>
						<%----%>
					<%--</div>--%>
					<%--<!-- /Specials -->--%>
					
					
				</aside>
				<!-- /Sidebar -->
                
                
                
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
				
			</div>
			<!-- /Content -->
			

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
		
		<!-- Scroll Bar -->
		<script src="${pageContext.request.contextPath}/pages/js/perfect-scrollbar.min.js"></script>
		
		<!-- Cloud Zoom -->
		<script src="${pageContext.request.contextPath}/pages/js/zoomsl-3.0.min.js"></script>
		
		<!-- FancyBox -->
		<script src="${pageContext.request.contextPath}/pages/js/jquery.fancybox.pack.js"></script>
		
		<!-- jQuery REVOLUTION Slider  -->
		<script type="text/javascript" src="${pageContext.request.contextPath}/pages/js/jquery.themepunch.plugins.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/pages/js/jquery.themepunch.revolution.min.js"></script>

		<!-- FlexSlider -->
		<script defer src="${pageContext.request.contextPath}/pages/js/flexslider.min.js"></script>
		
		<!-- IOS Slider -->
		<script src = "${pageContext.request.contextPath}/pages/js/jquery.iosslider.min.js"></script>
		
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