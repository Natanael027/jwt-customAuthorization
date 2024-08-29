# jwt-customAuthorization

## Overview

This Spring Boot project demonstrates JWT (JSON Web Token) authentication with custom authorization. It allows for applying custom permissions for each user based on their roles.

## Setup and Running the Project

### 1. Run Initial Setup

To configure the roles required for this project, you need to execute the `CreateRolesTest` method in `AuthApiApplicationTests`. This step sets up the roles necessary for the authorization system.

### 2. Create a User

After running the initial setup, create a user with roles by using the following example JSON payload:

```json
{
    "email": "testing3@example.com",
    "password": "password123",
    "fullName": "John Doe",
    "roles": [
        "ROLE_PATH1",
        "ROLE_PATH2",
        "ROLE_PATH3"
    ]
}
