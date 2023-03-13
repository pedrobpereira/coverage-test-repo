# Test repository for coverage - Humble beginnings

Getting coverage reports:
1. Start by getting the coverage report from `cobertura` by running the following command: `mvn cobertura:cobertura -Dcobertura.report.format=xml`
2. Then, extract the file `target/site/cobertura/coverage.xml` and name it `cobertura.xml`. You can add it to the root of your project.
3. Lastly, send the reports to Codacy using the following command: `bash <(curl -Ls https://coverage.codacy.com/get.sh)`
