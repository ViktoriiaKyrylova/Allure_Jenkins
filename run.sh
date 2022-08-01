mvn test; mvn allure:report;
mv target/site/allure-maven-plugin/history/. src/test/resources;
rm -r target/allure-results/history/.;
mv src/test/resources/history/. target/allure-results;
mvn allure:report;