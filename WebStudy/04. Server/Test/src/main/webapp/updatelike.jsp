<%@ page language="java" contentType="application/json; charset=UTF-8" %>
<%
// Get the review number from the request
int reviewNum = Integer.parseInt(request.getParameter("reviewNum"));

// Perform the like update logic here, e.g., update the like count in the database

// Simulate the updated like count for demonstration purposes
int newLikeCount =  + 1;

// Construct the JSON response
String jsonResponse = "{\"newLikeCount\": " + newLikeCount + "}";
response.setContentType("application/json");
response.getWriter().write(jsonResponse);
%>