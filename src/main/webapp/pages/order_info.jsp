<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="_header.jsp"/>
				
                <div class="col-lg-12 col-md-12 col-sm-12">
                	<div class="breadcrumbs">
                    	<p><a href="#">Home</a> <i class="icons icon-right-dir"></i> Order Info</p>
                    </div>
                </div>
                
				<!-- Main Content -->
				<section class="main-content col-lg-9 col-md-9 col-sm-9">
                    
                    
                    <div class="row">
                    	
                        <div class="col-lg-12 col-md-12 col-sm-12">
                        	
                            <div class="carousel-heading">
                                <h4>Order Information</h4>
                                <div class="carousel-arrows">
									<a href="#"><i class="icons icon-reply"></i></a>
								</div>
                            </div>
                            
                            <table class="orderinfo-table">
                            	
                                <tr>
                                	<th>Order number</th>
                                    <td>21512512</td>
                                </tr> 
                                
                                <tr>
                                	<th>Order date</th>
                                    <td>2013-07-12</td>
                                </tr>
                                
                                <tr>
                                	<th>Order status</th>
                                    <td>Confirmed by shopper</td>
                                </tr>
                                
                                <tr>
                                	<th>Last updated</th>
                                    <td>2013-07-12</td>
                                </tr>
                                
                                <tr>
                                	<th>Shipment</th>
                                    <td>--</td>
                                </tr>
                                
                                <tr>
                                	<th>Comment</th>
                                    <td>Aliquam erat volutpat. Duis ac turpis. Donec sit amet eros. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Mauris fermentum dictum magna. Sed laoreet aliquam leo. Ut tellus dolor, dapibus eget, elementum vel, cursus eleifend, elit. Aenean auctor wisi et urna. </td>
                                </tr>
                                
								<tr>
                                	<th>Payment</th>
                                    <td>PayPal</td>
                                </tr>
								
                                <tr>
                                	<th>Total</th>
                                    <td><span class="price">$281.00</span></td>
                                </tr>                    
                                
                            </table>
                            
                        </div>
                        
                    </div>
                    
                    <div class="row">
                    	
                        <div class="col-lg-6 col-md-6 col-sm-6">
                        	
                            <div class="carousel-heading">
                                <h4>Bill to</h4>
                            </div>
                            
                            <table class="orderinfo-table">
                            	
                                <tr>
                                	<th>Email</th>
                                    <td>info@companyname.com</td>
                                </tr> 
                                
                                <tr>
                                	<th>Company name</th>
                                    <td>company name</td>
                                </tr>
                                
                                <tr>
                                	<th>Title</th>
                                    <td>Mr</td>
                                </tr>
                                
                                <tr>
                                	<th>First name</th>
                                    <td>John</td>
                                </tr>
                                
                                <tr>
                                	<th>Middle name</th>
                                    <td>Allan</td>
                                </tr>
                                
                                <tr>
                                	<th>Last name</th>
                                    <td>Doe</td>
                                </tr>
                                
                                <tr>
                                	<th>Address 1</th>
                                    <td>Marmora Road, 45</td>
                                </tr>  
                                
                                <tr>
                                	<th>ZIP / Postal code</th>
                                    <td>8901</td>
                                </tr> 
                                
                                <tr>
                                	<th>City</th>
                                    <td>London</td>
                                </tr> 
                                
                                <tr>
                                	<th>Country</th>
                                    <td>Great Britain</td>
                                </tr> 
                                
                                <tr>
                                	<th>State / Province / Region</th>
                                    <td>-</td>
                                </tr> 
                                
                                <tr>
                                	<th>Phone</th>
                                    <td>555-555-555</td>
                                </tr>                   
                                
                            </table>
                            
                        </div>
                        
                        <div class="col-lg-6 col-md-6 col-sm-6">
                        	
                            <div class="carousel-heading">
                                <h4>Ship to</h4>
                            </div>
                            
                            <table class="orderinfo-table">
                                
                                <tr>
                                	<th>Company name</th>
                                    <td>company name</td>
                                </tr>
                                
                                <tr>
                                	<th>First name</th>
                                    <td>John</td>
                                </tr>
                                
                                <tr>
                                	<th>Middle name</th>
                                    <td>Allan</td>
                                </tr>
                                
                                <tr>
                                	<th>Last name</th>
                                    <td>Doe</td>
                                </tr>
                                
                                <tr>
                                	<th>Address 1</th>
                                    <td>Marmora Road, 45</td>
                                </tr>  
                                
                                <tr>
                                	<th>ZIP / Postal code</th>
                                    <td>8901</td>
                                </tr> 
                                
                                <tr>
                                	<th>City</th>
                                    <td>London</td>
                                </tr> 
                                
                                <tr>
                                	<th>Country</th>
                                    <td>Great Britain</td>
                                </tr> 
                                
                                <tr>
                                	<th>State / Province / Region</th>
                                    <td>-</td>
                                </tr> 
                                
                                <tr>
                                	<th>Phone</th>
                                    <td>555-555-555</td>
                                </tr>                   
                                
                            </table>
                            
                        </div>
                        
                         <div class="col-lg-12 col-md-12 col-sm-12">
							
							
							<div class="tabs">
                            
                                <div class="tab-heading margin-heading">
                                    <a href="#tab1" class="button big">Order Items</a>
                                    <a href="#tab2" class="button big">Order History</a>
                                </div>
                                
                                <div class="tab-content no-padding">
                                	
                                    <div id="tab1">
									
                                    	<table class="orderinfo-table">
                                
											<tr>
												<th>SKU</th>
												<th>Product name</th>
												<th>Product status</th>
												<th>Price</th>
												<th>Qty</th>
												<th>Tax</th>
												<th>Discount</th>
												<th>Total</th>
											</tr> 
											
											<tr>
												<td>1241254</td>
												<td>Lorem ipsum dolor sit amet</td>
												<td>Confirmed by shipper</td>
												<td>$201.00</td>
												<td>1</td>
												<td>$22.00</td>
												<td>$-32.00</td>
												<td>$190.00</td>
											</tr>
											
											<tr>
												<td>1241254</td>
												<td>Lorem ipsum dolor</td>
												<td>Confirmed by shipper</td>
												<td>$201.00</td>
												<td>1</td>
												<td>$22.00</td>
												<td>$-32.00</td>
												<td>$190.00</td>
											</tr>
											
											<tr>
												<td>1241254</td>
												<td>Lorem ipsum dolor</td>
												<td>Confirmed by shipper</td>
												<td>$201.00</td>
												<td>1</td>
												<td>$22.00</td>
												<td>$-32.00</td>
												<td>$190.00</td>
											</tr>
											
											<tr>
												<td class="align-right" colspan="5">Product prices result</td>
												<td>$22.00</td>
												<td>$-32.00</td>
												<td><strong>$190.00</strong></td>
											</tr>
											
											<tr>
												<td class="align-right" colspan="5">Shippment fee</td>
												<td>$22.00</td>
												<td>$-32.00</td>
												<td><strong>$190.00</strong></td>
											</tr>
											
											<tr>
												<td class="align-right" colspan="5">Payment fee</td>
												<td>$22.00</td>
												<td>$-32.00</td>
												<td><strong>$190.00</strong></td>
											</tr>
											
											<tr>
												<td class="align-right" colspan="5"><span class="price big">Total</span></td>
												<td><strong>$22.00</strong></td>
												<td><strong>$-32.00</strong></td>
												<td><span class="price big">$920.00</span></td>
											</tr>
											
										</table>
										
                                    </div>
									
									
									<div id="tab2">
									
                                    	<table class="orderinfo-table">
                                
											<tr>
												<th>SKU</th>
												<th>Product name</th>
												<th>Product status</th>
												<th>Price</th>
												<th>Qty</th>
												<th>Tax</th>
												<th>Discount</th>
												<th>Total</th>
											</tr> 
											
											<tr>
												<td>1241254</td>
												<td>Lorem ipsum dolor sit amet</td>
												<td>Confirmed by shipper</td>
												<td>$201.00</td>
												<td>1</td>
												<td>$22.00</td>
												<td>$-32.00</td>
												<td>$190.00</td>
											</tr>
											
											<tr>
												<td>1241254</td>
												<td>Lorem ipsum dolor</td>
												<td>Confirmed by shipper</td>
												<td>$201.00</td>
												<td>1</td>
												<td>$22.00</td>
												<td>$-32.00</td>
												<td>$190.00</td>
											</tr>
											
											<tr>
												<td>1241254</td>
												<td>Lorem ipsum dolor</td>
												<td>Confirmed by shipper</td>
												<td>$201.00</td>
												<td>1</td>
												<td>$22.00</td>
												<td>$-32.00</td>
												<td>$190.00</td>
											</tr>
											
											<tr>
												<td class="align-right" colspan="5">Product prices result</td>
												<td>$22.00</td>
												<td>$-32.00</td>
												<td><strong>$190.00</strong></td>
											</tr>
											
											<tr>
												<td class="align-right" colspan="5">Shippment fee</td>
												<td>$22.00</td>
												<td>$-32.00</td>
												<td><strong>$190.00</strong></td>
											</tr>
											
											<tr>
												<td class="align-right" colspan="5">Payment fee</td>
												<td>$22.00</td>
												<td>$-32.00</td>
												<td><strong>$190.00</strong></td>
											</tr>
											
											<tr>
												<td class="align-right" colspan="5"><span class="price big">Total</span></td>
												<td><strong>$22.00</strong></td>
												<td><strong>$-32.00</strong></td>
												<td><span class="price big">$920.00</span></td>
											</tr>
											
										</table>
										
                                    </div>
									
								</div>
								
                            
                            </div>
							
                        </div>
                        
                    </div>
                        
                    
				</section>
				<!-- /Main Content -->
                
                
                <!-- Sidebar -->
				<aside class="sidebar col-lg-3 col-md-3 col-sm-3 right-sidebar">
					
					<!-- Categories -->
					<div class="row sidebar-box purple">
						
						<div class="col-lg-12 col-md-12 col-sm-12">
							
							<div class="sidebar-box-heading">
								<i class="icons icon-folder-open-empty"></i>
								<h4>Categories</h4>
							</div>
							
							<div class="sidebar-box-content">
								<ul>
									<li><a href="#">Cameras &amp; Photography <i class="icons icon-right-dir"></i></a></li>
									<li><a href="#">Computers &amp; Tablets <i class="icons icon-right-dir"></i></a></li>
									<li><a href="#">Cell Phones &amp; Accessories <i class="icons icon-right-dir"></i></a>
                                    	<ul class="sidebar-dropdown">
                                        	<li>
                                            	<ul>
                                                	<li><a href="#">Cell phones &amp; Smartphone</a></li>
                                                    <li><a href="#">Cell Phone Accessories</a></li>
                                                    <li><a href="#">Headsets</a></li>
                                                    <li><a href="#">Cases, Covers & Skins</a></li>
                                                    <li><a href="#">Screen Protectors</a></li>
                                                </ul>
                                            </li>
                                            <li>
                                            	<ul>
                                                	<li><a href="#">Chargers & Cradles</a></li>
                                                    <li><a href="#">Batteries</a></li>
                                                    <li><a href="#">Cables & Adapters</a></li>
                                                    <li><a href="#">All About Smartphones</a></li>
                                                </ul>
                                            </li>
                                        </ul>
                                    </li>
									<li><a href="#">TV, Audio &amp; Surveillance <i class="icons icon-right-dir"></i></a></li>
									<li><a href="#">Video Games &amp; Consoles <i class="icons icon-right-dir"></i></a></li>
									<li><a href="#">Car Audio, Video &amp; GPS <i class="icons icon-right-dir"></i></a></li>
									<li><a href="#">Best Sellers <i class="icons icon-right-dir"></i></a></li>
									<li><a href="#">Shop by Brands <i class="icons icon-right-dir"></i></a></li>
									<li><a class="purple" href="#">All Categories</a></li>
								</ul>
							</div>
							
						</div>
							
					</div>
					<!-- /Categories -->
					
					
					<!-- Compare Products -->
					<div class="row sidebar-box blue">
						
						<div class="col-lg-12 col-md-12 col-sm-12">
							
							<div class="sidebar-box-heading">
                            	<i class="icons icon-docs"></i>
								<h4>Compare Products</h4>
							</div>
							<div class="sidebar-box-content">
                                <table class="compare-table">
                                    
                                    <tr>
                                        <td class="product-thumbnail"><img src="img/products/sample1.jpg" alt="Product1"></td>
                                        <td class="product-info">
                                            <p><a href="#">Lorem ipsum dolor sit amet</a></p>
                                            <a href="#" class="remove">Remove</a>
                                        </td>
                                    </tr>
                                    
                                    <tr>
                                        <td class="product-thumbnail"><img src="img/products/sample2.jpg" alt="Product1"></td>
                                        <td class="product-info">
                                            <p><a href="#">Lorem ipsum dolor sit amet</a></p>
                                            <a href="#" class="remove">Remove</a>
                                        </td>
                                    </tr>
                                    
                                </table>
                                <div class="padding-box">
                                	<a class="button grey">Go to compare</a>
                                </div>
							</div>
						</div>
						
					</div>
					<!-- /Compare Products -->
					
					
					<!-- Carousel -->
					<div class="row sidebar-box">
						
						<div class="col-lg-12 col-md-12 col-sm-12 sidebar-carousel">
							
							<!-- Slider -->
							<section class="sidebar-slider">
								<div class="sidebar-flexslider">
									<ul class="slides">
										<li>
											<a href="#"><img src="img/sidebar-slide1.jpg" alt="Slide1"/></a>
										</li>
										<li>
											<a href="#"><img src="img/sidebar-slide2.jpg" alt="Slide1"/></a>
										</li>
										<li>
											<a href="#"><img src="img/sidebar-slide3.jpg" alt="Slide1"/></a>
										</li>
									</ul>
								</div>
								<div class="slider-nav"></div>
							</section>
							<!-- /Slider -->
                            
						</div>
						
					</div>
					<!-- /Carousel -->
					
					
					<!-- Bestsellers -->
					<div class="row sidebar-box red">
						
						<div class="col-lg-12 col-md-12 col-sm-12">
							
							<div class="sidebar-box-heading">
                            <i class="icons icon-award-2"></i>
								<h4>Bestsellers</h4>
							</div>
							
							<div class="sidebar-box-content">
								<table class="bestsellers-table">
									
									<tr>
										<td class="product-thumbnail"><a href="#"><img src="img/products/sample1.jpg" alt="Product1"></a></td>
										<td class="product-info">
											<p><a href="#">Lorem ipsum dolor sit amet</a></p>
											<span class="price">$550.00</span>
										</td>
									</tr>
									
									<tr>
										<td class="product-thumbnail"><a href="#"><img src="img/products/sample2.jpg" alt="Product1"></a></td>
										<td class="product-info">
											<p><a href="#">Lorem ipsum dolor sit amet</a></p>
											<span class="price">$550.00</span>
										</td>
									</tr>
									
									<tr>
										<td class="product-thumbnail"><a href="#"><img src="img/products/sample3.jpg" alt="Product1"></a></td>
										<td class="product-info">
											<p><a href="#">Lorem ipsum dolor sit amet</a></p>
                                            <div class="rating readonly-rating" data-score="4"></div>
											<span class="price"><del>$650.00</del> $550.00</span>
										</td>
									</tr>
									
								</table>
							</div>
							
						</div>
						
					</div>
					<!-- /Bestsellers -->
                    
				</aside>
                <!-- /Sidebar -->
                
			</div>
			<!-- /Content -->
			
			
			


			
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
			<footer id="footer" class="row">
				
				<!-- Upper Footer -->
				<div class="col-lg-12 col-md-12 col-sm-12">
					
					<div id="upper-footer">
					
						<div class="row">
							
							<!-- Newsletter -->
							<div class="col-lg-7 col-md-7 col-sm-7">
								<form id="newsletter" action="http://inthe7heaven.com/homeshop-html/php/newsletter.php">
									<h4>Newsletter Sign Up</h4>
									<input type="text" name="newsletter-email" placeholder="Enter your email address">
									<input type="submit" name="newsletter-submit" value="Submit">
								</form>
							</div>
							<!-- /Newsletter -->
							
							
							<!-- Social Media -->
							<div class="col-lg-5 col-md-5 col-sm-5 social-media">
								<h4>Stay Connected</h4>
								<ul>
									<li class="social-googleplus tooltip-hover" data-toggle="tooltip" data-placement="top" title="Google+"><a href="#"></a></li>
									<li class="social-facebook tooltip-hover" data-toggle="tooltip" data-placement="top" title="Facebook"><a href="#"></a></li>
									<li class="social-pinterest tooltip-hover" data-toggle="tooltip" data-placement="top" title="Pinterest"><a href="#"></a></li>
									<li class="social-twitter tooltip-hover" data-toggle="tooltip" data-placement="top" title="Twitter"><a href="#"></a></li>
									<li class="social-youtube tooltip-hover" data-toggle="tooltip" data-placement="top" title="Youtube"><a href="#"></a></li>
								</ul>
							</div>
							<!-- /Social Media -->
							
						</div>
					
					</div>
					
				</div>
				<!-- /Upper Footer -->
				
				
				
				<!-- Main Footer -->
				<div class="col-lg-12 col-md-12 col-sm-12">
					
					<div id="main-footer">
					
						<div class="row">
							
							<!-- Like us on Twitter -->
							<div class="col-lg-3 col-md-3 col-sm-6 twitter-widget">
								<h4>From Twitter</h4>
								<div id="twitter-widget">
                                
								</div>
                                <a href="#" class="button blue small">Follow us</a>
							</div>
							<!-- /Like us on Twitter -->
							
							
							<!-- Like us on Facebook -->
							<div class="col-lg-3 col-md-3 col-sm-6 facebook-iframe">
								<h4>Like us on Facebook</h4>
                                <iframe src="http://www.facebook.com/plugins/likebox.php?href=http%3A%2F%2Fwww.facebook.com%2FFacebookDevelopers&amp;width=270&amp;height=250&amp;colorscheme=light&amp;header=false&amp;show_faces=true&amp;stream=false&amp;show_border=false" style="border:none; overflow:hidden; width:100%; height:290px;"></iframe>
							</div>
							<!-- /Like us on Facebook -->
							
							
							<!-- Information -->
							<div class="col-lg-3 col-md-3 col-sm-6">
								<h4>Information</h4>
								<ul>
									<li><a href="#"><i class="icons icon-right-dir"></i> About Us</a></li>
									<li><a href="#"><i class="icons icon-right-dir"></i> New Collection</a></li>
									<li><a href="#"><i class="icons icon-right-dir"></i> Bestsellers</a></li>
									<li><a href="#"><i class="icons icon-right-dir"></i> Manufacturers</a></li>
									<li><a href="#"><i class="icons icon-right-dir"></i> Privacy Policy</a></li>
									<li><a href="#"><i class="icons icon-right-dir"></i> Terms &amp; Conditions</a></li>
								</ul>
							</div>
							<!-- /Information -->
							
							
							<!-- Contact Us -->
							<div class="col-lg-3 col-md-3 col-sm-6 contact-footer-info">
								<h4>Contact Us</h4>
								<ul>
									<li><i class="icons icon-location"></i> 8901 Marmora Road,<br>Glasgow, D04 89GR.</li>
                                    <li><i class="icons icon-phone"></i> +1 800 603 6035</li>
									<li><i class="icons icon-mail-alt"></i><a href="mailto:mail@company.com"> mail@companyname.com</a></li>
									<li><i class="icons icon-skype"></i> homeshop</li>
								</ul>
							</div>
							<!-- /Contact Us -->
							
						</div>
						
					</div>
					
				</div>
				<!-- /Main Footer -->
				
				
				
				<!-- Lower Footer -->
				<div class="col-lg-12 col-md-12 col-sm-12">
					
					<div id="lower-footer">
					
						<div class="row">
							
							<div class="col-lg-6 col-md-6 col-sm-6">
								<p class="copyright">Copyright 2014 <a href="#">HomeShop</a>. All Rights Reserved.</p>
							</div>
							
							<div class="col-lg-6 col-md-6 col-sm-6">
								<ul class="payment-list">
									<li class="payment1"></li>
									<li class="payment2"></li>
									<li class="payment3"></li>
									<li class="payment4"></li>
									<li class="payment5"></li>
								</ul>
							</div>
							
						</div>
						
					</div>
					
				</div>
				<!-- /Lower Footer -->
				
			</footer>
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