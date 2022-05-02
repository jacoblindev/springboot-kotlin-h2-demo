# Srping Boot + Kotlin + H2 & JDBC

## Hello

GET: `http://localhost:8080/hello`

Return: **Hello Kotlin!**

GET: `http://localhost:8080/hello-service`

Return: **Hello Kotlin Service**

GET: `http://localhost:8080/hello-dto`

Return: **{"greeting": "Hello from the DTO!"}**

## Language

GET: `http://localhost:8080/lang`

Return: **[
{
"id": "bb6fe3fb-a6dd-4012-85ad-583a0004370b",
"lang": "JavaScript"
},
{
"id": "70c3a238-9e4d-4f1a-a93b-166d833b67f0",
"lang": "Java"
},
{
"id": "068c2818-e27d-4700-b2ae-407063564389",
"lang": "Kotlin"
},
{
"id": "9199c512-daaa-41b6-ac47-7947d82370ce",
"lang": "Dart"
}
]**

POST: `http://localhost:8080/lang`

BODY: **{"lang": "Your Languages"}**