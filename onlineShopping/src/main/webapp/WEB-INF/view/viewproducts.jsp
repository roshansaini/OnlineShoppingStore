<br>
<div class="container">
	<div class="row">
		<!-- Side bar for categories -->
		<div class=col-md-3>
			<!-- Inlcuding sidebar.js -->
			<%@ include file="./shared/sidebar.jsp"%>
		</div>

		<!-- Listing for categories -->
		<div class=col-md-9>
			<!-- Printing BreadCrumb -->
			<div class="row">
				<div class="col-md-12">
					<c:if test="${userClickAllProducts == true}">
						<nav aria-label="breadcrumb">
							<ol class="breadcrumb">
								<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
								<li class="breadcrumb-item active" aria-current="page">All
									Products</li>
							</ol>
						</nav>
					</c:if>

					<c:if test="${userClickCategoryProducts == true}">

						<nav aria-label="breadcrumb">
							<ol class="breadcrumb">
								<li class="breadcrumb-item"><a href="${contextRoot}/home"">Home</a></li>
								<li class="breadcrumb-item active">Category</li>
								<li class="breadcrumb-item active" aria-current="page">${category.name}</li>
							</ol>
						</nav>
					</c:if>
				</div>

			</div>
		</div>
	</div>
</div>