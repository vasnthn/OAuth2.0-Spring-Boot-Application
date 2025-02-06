=======================================================
             OAuth2.0 Spring Boot Application
=======================================================

This is a Spring Boot application that demonstrates
the use of OAuth2.0 authentication using GitHub as the
authentication provider. It includes a basic product
management API secured with OAuth2.0.

-------------------------------------------------------
Features:
-------------------------------------------------------
- OAuth2.0 Authentication with GitHub: Users can log in
  using their GitHub accounts.
- Product Management API:
  - GET /api/v1/products: Retrieve a list of products  (only available to authenticated users).
  - POST /api/v1/products/create: Create a new product.

-------------------------------------------------------
Tech Stack:
-------------------------------------------------------
- Spring Boot: Framework used for building the application.
- Spring Security: For securing API endpoints with OAuth2.0.
- H2 Database: In-memory database for storing product data.
- GitHub OAuth2 Authentication: Used for user authentication(Pefer Google Cloud or Meta, if needed).

-------------------------------------------------------
Setup & Installation:
-------------------------------------------------------

1. Clone the repository:
   git clone https://github.com/your-username/oauth2-spring-boot.git

2. Navigate to the project directory:
   cd oauth2-spring-boot

3. Configure GitHub OAuth2 credentials:
   - Go to GitHub Developer Settings: https://github.com/settings/developers
   - Create a new OAuth2 application.
   - Set the Callback URL as:
     http://localhost:8080/login/oauth2/code/github
   - Copy the Client ID and Client Secret from GitHub.

4. Update `application.properties`:
   - Open `src/main/resources/application.properties` and
     add the GitHub OAuth credentials:
     spring.security.oauth2.client.registration.github.clientId=YOUR_CLIENT_ID
     spring.security.oauth2.client.registration.github.clientSecret=YOUR_CLIENT_SECRET

5. Run the application:
   mvn spring-boot:run

6. Access the application:
   - Open the browser and visit `http://localhost:8080/api/v1/products`
     to view products.
   - Log in with GitHub and visit `http://localhost:8080/api/v1/products/create`
     to create a new product.

-------------------------------------------------------
API Endpoints:
-------------------------------------------------------
GET /api/v1/products
- Description: Retrieve a list of all products.
- Access: Requires OAuth2 authentication via GitHub.

POST /api/v1/products/create
- Access: Public (No authentication required).
- Description: Create a new product.

-------------------------------------------------------
Security:
-------------------------------------------------------
- The application is secured using Spring Security.
- GitHub OAuth2 is used for user authentication.
- Only authenticated users can create new products.

-------------------------------------------------------
Testing:
-------------------------------------------------------
Use Postman or cURL to test the authentication and API endpoints.

Example Requests:
1. GET products (requires login):
   curl http://localhost:8080/api/v1/products

2. POST create product:
   curl -X POST http://localhost:8080/api/v1/products/create

-------------------------------------------------------
Contributing:
-------------------------------------------------------
Feel free to fork the repository and submit pull requests.
If you encounter any issues, open an issue and I will get back to you.

-------------------------------------------------------
Enjoy experimenting with OAuth2.0 in Spring Boot! 🚀
