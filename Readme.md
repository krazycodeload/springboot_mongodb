http://localhost:8080/swagger-ui/index.html

The following endpoints will be available:

GET /api/products: Get a list of all products.
GET /api/products/{id}: Get a product by its ID.
POST /api/products: Create a new product.
PUT /api/products/{id}: Update an existing product.
DELETE /api/products/{id}: Delete a product.



* Get all products:
curl -X GET http://localhost:8080/api/products

* Create a product:

curl -X POST http://localhost:8080/api/products \
-H "Content-Type: application/json" \
-d '{"name": "Laptop", "description": "A high-end laptop", "price": 1500.0}'

* Update a product:
curl -X PUT http://localhost:8080/api/products/{id} \
-H "Content-Type: application/json" \
-d '{"name": "Laptop", "description": "Updated description", "price": 1400.0}'

* Delete a product:
curl -X DELETE http://localhost:8080/api/products/{id}