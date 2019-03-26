<%--
  Created by IntelliJ IDEA.
  User: yjks
  Date: 2019-03-22
  Time: 13:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>

        <title>Title</title>
    </head>
    <body>

        <div class="container">
            <jsp:include page="../fragments/head.jsp"/>
            <div>
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>id</th>
                            <th>상품명</th>
                            <th>가격</th>
                            <th>재고수량</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${items}" var="item">
                            <tr>
                               <td>${item.id}</td>
                               <td>${item.name}</td>
                               <td>${item.price}</td>
                               <td>${item.stockQuantity}</td>
                               <td>
                                   <a href="/items/${item.id}/edit"
                                      class="btn btn-primary" role="button">수정</a>
                               </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            <jsp:include page="../fragments/footer.jsp"/>
        </div> <!-- /container -->

    </body>
</html>
