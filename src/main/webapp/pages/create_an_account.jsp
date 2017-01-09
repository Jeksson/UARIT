<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="_header.jsp"/>

<div class="col-lg-12 col-md-12 col-sm-12">
    <div class="breadcrumbs">
        <p><a href="${pageContext.request.contextPath}/">Home</a> <i class="icons icon-right-dir"></i> Create an account
        </p>
    </div>
</div>

<!-- Main Content -->
<section class="main-content col-lg-12 col-md-12 col-sm-12">


    <div class="row">

        <div class="col-lg-12 col-md-12 col-sm-12">

            <div class="carousel-heading no-margin">
                <h4>Если вы уже зарегистрированы, войдите на сайт прямо здесь</h4>
            </div>

            <div class="page-content">

                <div class="row">
                    <div class="col-lg-6 col-md-6 col-sm-6">
                        <div class="iconic-input">
                            <input type="text" placeholder="Email">
                            <i class="icons icon-user-3"></i>
                        </div>
                    </div>

                    <div class="col-lg-6 col-md-6 col-sm-6">
                        <div class="iconic-input">
                            <input type="text" placeholder="Пароль">
                            <i class="icons icon-lock"></i>
                        </div>
                    </div>
                </div>

                <input type="checkbox" id="login-remember-2"> <label for="login-remember-2">Запомнить меня</label>
                <br/><br/>
                <div class="row">
                    <div class="col-lg-6 col-md-6 col-sm-6 align-left">
                        <input type="submit" class="orange" value="Войти">
                    </div>
                    <div class="col-lg-6 col-md-6 col-sm-6 align-right">
                        <small>
                            <a class="align-right" href="#">Забыли пароль?</a>
                            <br>
                            <a class="align-right" href="#">Забыли email?</a>
                            <br>
                        </small>
                    </div>
                </div>
            </div>

        </div>

    </div>


    <div class="row">

        <div class="col-lg-12 col-md-12 col-sm-12 register-account">

            <div class="carousel-heading no-margin">
                <h4>Регистрация</h4>
            </div>

            <div class="page-content">


                <div class="row">

                    <div class="col-lg-12 col-md-12 col-sm-12">
                        <p><strong>Введите вашу информацию</strong></p>
                    </div>



                    <div class="col-lg-4 col-md-4 col-sm-4">
                        <p>Ваше имя</p>
                    </div>
                    <div class="col-lg-8 col-md-8 col-sm-8">
                        <input id="inp_name" type="text"> <span id="span_name" style="font-size: 14px"></span>
                    </div>

                </div>

                <div class="row">

                    <div class="col-lg-4 col-md-4 col-sm-4">
                        <p>Ваш логин</p>
                    </div>
                    <div class="col-lg-8 col-md-8 col-sm-8">
                        <input id="inp_login" onblur="$('#span_login').text('')" type="text"> <span id="span_login" style="font-size: 14px"></span>
                    </div>

                </div>

                <div class="row">

                    <div class="col-lg-4 col-md-4 col-sm-4">
                        <p>Ваш email</p>
                    </div>
                    <div class="col-lg-8 col-md-8 col-sm-8">
                        <input id="inp_email" onblur="$('#span_email').text('')" type="text"> <span id="span_email" style="font-size: 14px"></span>
                    </div>

                </div>


                <div class="row">

                    <div class="col-lg-4 col-md-4 col-sm-4">
                        <p>Ваш пароль</p>
                    </div>
                    <div class="col-lg-8 col-md-8 col-sm-8">
                        <input id="inp_password1" onkeyup="passwordValid()" onblur="$('#span_pass1').text('')" type="password" > <span id="span_pass1" style="font-size: 14px"></span>
                    </div>

                </div>

                <div class="row">

                    <div class="col-lg-4 col-md-4 col-sm-4">
                        <p>Повторите пароль</p>
                    </div>
                    <div class="col-lg-8 col-md-8 col-sm-8">
                        <input id="inp_password2" onkeyup="passwordValid()" onblur="$('#span_pass2').text('')" type="password"> <span id="span_pass2" style="font-size: 14px"></span>
                    </div>

                </div>

                <div class="row">

                    <div class="col-lg-4 col-md-4 col-sm-4">
                        <p>Я согласен с условиями предоставления услуг</p>
                    </div>
                    <div class="col-lg-8 col-md-8 col-sm-8">
                        <input type="checkbox" id="i-agree-to-terms"><label for="i-agree-to-terms"></label>
                    </div>

                </div>

                <div class="row">

                    <div class="col-lg-12 col-md-12 col-sm-12">
                        <input class="big" type="submit" onclick="submitRegistr()" value="Зарегестрироваться">
                        <input class="big"  type="reset" value="Отменить">
                    </div>

                </div>
            </div>

        </div>

    </div>


</section>
<!-- /Main Content -->

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
                        <li class="social-googleplus tooltip-hover" data-toggle="tooltip" data-placement="top"
                            title="Google+"><a href="#"></a></li>
                        <li class="social-facebook tooltip-hover" data-toggle="tooltip" data-placement="top"
                            title="Facebook"><a href="#"></a></li>
                        <li class="social-pinterest tooltip-hover" data-toggle="tooltip" data-placement="top"
                            title="Pinterest"><a href="#"></a></li>
                        <li class="social-twitter tooltip-hover" data-toggle="tooltip" data-placement="top"
                            title="Twitter"><a href="#"></a></li>
                        <li class="social-youtube tooltip-hover" data-toggle="tooltip" data-placement="top"
                            title="Youtube"><a href="#"></a></li>
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
                    <iframe src="http://www.facebook.com/plugins/likebox.php?href=http%3A%2F%2Fwww.facebook.com%2FFacebookDevelopers&amp;width=270&amp;height=250&amp;colorscheme=light&amp;header=false&amp;show_faces=true&amp;stream=false&amp;show_border=false"
                            style="border:none; overflow:hidden; width:100%; height:290px;"></iframe>
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
                        <li><i class="icons icon-mail-alt"></i><a href="mailto:mail@company.com">
                            mail@companyname.com</a></li>
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

<!-- jQuery REVOLUTION Slider -->
<script type="text/javascript" src="${pageContext.request.contextPath}/pages/js/jquery.themepunch.plugins.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/pages/js/jquery.themepunch.revolution.min.js"></script>

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

<script>


    function passwordValid(){

        var pass1 = $('#inp_password1').val();
        var pass2 = $('#inp_password2').val();


        $('#span_pass1').text('');
        $('#span_pass2').text('');


        var res;
        if(pass1 === ''){
            $('#span_pass1').text('Поле не должно быть пустым');
            res = false;
        }  else if(pass2 === ''){
            $('#span_pass2').text('Поле не должно быть пустым');
            res = false;
        } else if(pass1.length < 6){
            $('#span_pass1').text('Пароль должен содержать не меньше 6 символов');
        } else if (pass1 != pass2){
            $('#span_pass1').text('Пароли не совпадают');
        } else {
            res = true;
        }

        return res;
    }

    function nameValid(){

        $('#span_name').text('');
        var a = false;
        if($('#inp_name').val() === ''){
            $('#span_name').text("Поле не должно быть путсым");
            a = false;
            return a;
        } else if ($('#inp_name').val().length < 2){
            $('#span_name').text("Слишком короткое имя");
            a = false;
            return a;
        } else {
            a = true;
        }
        return a;

    }

    //login valid
    $('#inp_login').keyup(function(){

        $('#span_login').text('');
        var a = false;

        var term = '';
        if ($('#inp_login').val() === term){
            $('#span_login').text('Поле не должно быть пустым');
            a = false;
            return a;
        } else if ($('#inp_login') != term){
            $.ajax({
                url: 'registr/login',
                type: 'POST',
                dataType: 'json',
                data: ({
                    text: $("#inp_login").val()
                }),
                beforeSend: function() {
                    $("#span_login").text("");
                },
                success: function (data) {
                    $.each(data, function(key, value){
                        if(key === "ok"){
                            a = true;
                            return a;
                            $('#span_login').text(value);
                        } else if(key === "err"){
                            $('#span_login').text(value);
                            a = false;
                            return a;
                        }
                    });
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    console.log(textStatus + " " + errorThrown)
                }
            });
        }
        return a;
    });

    //email valid
    $('#inp_email').keyup(function(){

        $('#span_email').text('');
        var a = false;
        var term = '';
        if($('#inp_email').val() === term){
            $('#span_email').text("Поле не должно быть пустым");
            a = false;
            return a;
        }else if($('#inp_email') != term){
            $.ajax({
                url: 'registr/email',
                type: 'POST',
                dataType: 'json',
                data: ({
                    text: $("#inp_email").val()
                }),
                beforeSend: function() {
                    $('#span_email').text("");
                },
                success: function (data) {
                    $.each(data, function(key, value){
                        if(key === "ok"){
                            $('#span_email').text(value);
                            a = true;
                        } else if(key === "err"){
                            $('#span_email').text(value);
                            a = false;
                        }
                    });
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    console.log(textStatus + " " + errorThrown)
                }
            });
        }
        return a;
    });


    function submitRegistr(){
        var loginValid = false;

        if($('#inp_login').val() === ''){
            $('#span_login').text('Поле не должно быть пустым');
            loginValid = false;
        } else {
            $('#span_login').text('');
            loginValid = true;
        }

        var emailValid = false;
        if($('#inp_email').val() === ''){
            $('#span_email').text('Поле не должно быть пустым');
            emailValid = false;
        } else {
            $('#span_email').text('');
            emailValid = true;
        }


        if($('#i-agree-to-terms').is(':checked') == true
                && passwordValid() == true
                && loginValid == true
                && emailValid == true){

            console.log('jnghfd');

            $.ajax({
                url: 'registr/adduser',
                type: 'POST',
                dataType: 'json',
                data: ({
                    login: $('#inp_login').val(),
                    name: $('#inp_name').val(),
                    email: $('#inp_email').val(),
                    password: $('#inp_password1').val()
                }),
                success: function (data) {
                    document.location.href='/';
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    console.log(textStatus + " " + errorThrown)
                }
            });

        }




    }


</script>

</body>

</html>