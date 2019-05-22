# Bonify4


STEPS TO RUN 

Make sure java is installed
DOWNLOAD THE PROJECT
GO TO DIRECTORY WHERE PROJECT IS DOWNLOADED 
run ./mvnw clean install
cd target/
java -jar Question4-0.0.1-SNAPSHOT.jar &

CURL REQUEST

curl -X GET \
  http://localhost:8080/executedsl/Electricity \
  -H 'Postman-Token: 3bd8d195-9026-4c44-ac39-5bb18d73531a' \
  -H 'cache-control: no-cache'

curl -X GET \
  http://localhost:8080/executedsl/Apartment \
  -H 'Postman-Token: 3bd8d195-9026-4c44-ac39-5bb18d73531a' \
  -H 'cache-control: no-cache'
