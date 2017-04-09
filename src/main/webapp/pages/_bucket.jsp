<%--
  Created by IntelliJ IDEA.
  User: jekss
  Date: 09.04.17
  Time: 18:34
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<ul id="cart-dropdown" class="box-dropdown parent-arrow">
    <li>
        <div class="box-wrapper parent-border">
            <p>Recently added item(s)</p>

            <table class="cart-table">
                <tr>
                    <td><img src="img/products/sample1.jpg" alt="product"></td>
                    <td>
                        <h6>Lorem ipsum dolor</h6>
                        <p>Product code PSBJ3</p>
                    </td>
                    <td>
                        <span class="quantity"><span class="light">1 x</span> $79.00</span>
                        <a href="#" class="parent-color">Remove</a>
                    </td>
                </tr>
            </table>

            <br class="clearfix">
        </div>

        <div class="footer">
            <table class="checkout-table pull-right">
                <%--<tr>--%>
                    <%--<td class="align-right">Tax:</td>--%>
                    <%--<td>$0.00</td>--%>
                <%--</tr>--%>
                <%--<tr>--%>
                    <%--<td class="align-right">Discount:</td>--%>
                    <%--<td>$37.00</td>--%>
                <%--</tr>--%>
                <tr>
                    <td class="align-right"><strong>Общая сумма:</strong></td>
                    <td><strong class="parent-color">$999.00</strong></td>
                </tr>
            </table>
        </div>

        <div class="box-wrapper no-border">
            <a class="button pull-right parent-background" href="#">Купить</a>
            <a class="button pull-right" href="${pageContext.request.contextPath}/bucket">Перейти в корзину</a>
        </div>
    </li>
</ul>
