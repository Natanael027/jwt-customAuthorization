# jwt-customAuthorization
Spring Boot JWT with custom Authorization Project, this project is built for applying custom permission for each user based on role

to run the project first you need to execute CreateRolesTest method in AuthApiApplicationTests then create user with roles 
example user :
{
    "email" : "testing3@example.com",
    "password" : "password123",
    "fullName" : "John Doe",
    "roles" : [
        "ROLE_PATH1",
        "ROLE_PATH2",
        "ROLE_PATH3"
    ]
}
