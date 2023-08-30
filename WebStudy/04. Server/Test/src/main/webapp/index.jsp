<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="styles.css">
<title>Insert title here</title>
</head>
<body>
<% int cnt = 0; %>
	<button class="like-button" onclick="likeReview('<%= cnt %>')">
    <img src="img/like-icon.svg">
    <div>좋아요</div>
    <div><%= cnt %></div>
</button>

<script>
function likeReview(reviewNum) {
    // Send an AJAX request to the server to update the like count
    var xhr = new XMLHttpRequest();
    xhr.open("POST", "updateLike.jsp", true);
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    xhr.onreadystatechange = function() {
        if (xhr.readyState === XMLHttpRequest.DONE) {
            if (xhr.status === 200) {
                // Update the like count on the front-end
                var likeCount = JSON.parse(xhr.responseText).newLikeCount;
                document.getElementById("like-count-" + reviewNum).textContent = likeCount;
            } else {
                console.error("Error updating like count");
            }
        }
    };
    xhr.send("reviewNum=" + reviewNum);
}
</script>

</body>
</html>