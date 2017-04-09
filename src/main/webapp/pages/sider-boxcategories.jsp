<%--
  Created by IntelliJ IDEA.
  User: jekss
  Date: 07.04.17
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<div class="col-lg-12 col-md-12 col-sm-12">

    <div class="sidebar-box-heading">
        <i class="icons icon-folder-open-empty"></i>
        <h4>Категории</h4>
    </div>


    <div class="sidebar-box-content">
        <ul>
            <c:forEach var="cat1" items="${listCateg1}">

                <li><a href="#">${cat1}<i class="icons icon-right-dir"></i></a>
                    <ul class="sidebar-dropdown">
                        <li>
                            <ul>
                                <c:forEach var="cat2" items="${mapCateg2}">
                                    <c:if test="${cat1 == cat2.key}">
                                        <c:forEach var="cat2Item" items="${cat2.value}">
                                            <li><a href="#"> ${cat2Item}</a></li>
                                        </c:forEach>
                                    </c:if>
                                </c:forEach>
                            </ul>
                        </li>
                    </ul>
                </li>

            </c:forEach>
        </ul>
    </div>


</div>