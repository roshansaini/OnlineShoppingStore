<h1 class="my-4">Shop Name</h1>
<div class="list-group">

<!-- Fetching categories from the categories list passed from page controller -->

	<c:forEach items="${categories}" var="category">
		<a href="${contextRoot}/show/category/${category.id}/products" class="list-group-item " id="${category.name}">${category.name}</a>
	</c:forEach>
	
</div>