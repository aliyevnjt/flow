### Flow

Navigate to the the directory of pom.xml and run commands below.

```sh
$ mvn clean test -Durl=<url> -Dcucumber.options='--tags @<yourTag>'
```

Example: 
```sh
$  mvn clean test -Durl=https://dev.flowlyst.io/v-20200326132512/ -Dcucumber.options='--tags @req_form'
```
