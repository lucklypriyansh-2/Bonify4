# Bonify4


STEPS TO RUN 

Make sure java is installed
DOWNLOAD THE PROJECT
GO TO DIRECTORY WHERE PROJECT IS DOWNLOADED 
run ./mvnw clean install
cd target/

java -jar Question4-0.0.1-SNAPSHOT.jar &

CURL REQUEST

Sample request

curl -X POST \
  http://localhost:8080/findpathvariable \
  -H 'Accept: application/json, text/plain, */*' \
  -H 'Content-Type: application/json' \
  -H 'Postman-Token: f15a7b59-e1bc-48bd-b489-46c3b9c75a97' \
  -H 'cache-control: no-cache' \
  -d '[
  "/users/Maria/info/location",
  "/users/Marcelo/info/birthday",
  "//Marcelo/info/birthday"
  
]'

