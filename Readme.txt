

Objectives:

1. Framework developed.

testng framework for the Rest assured.

Execution:

1. Start the StartStubService before the scripts execution from the Eclipe..

2. RestAssuredProject has been setup with the list of all the testcases using the testng framework( install eclipe before you load the project and unzip RestAssuredProject.zip before loading it)...

3. Inorder to execute right click on the RestAssuredProject-->Run As --> Malvin install..

4. A report will be generated using the Extendedreporter in the testng framework..

5. Report can be found under eclipse-workspace/RestAssuredProject/target/surefire-reports/Command( report will be shared in GitHub)

Results of the execution:


Results of the execution :

Failed tests:   getResponseStatus(Demo.TestCustomer4444): 1 expectation failed.(..)
JSON path data.customerID doesn't match.
Expected: 4444
  Actual: 3333
  test(Demo.TestOne): expected [200] but found [404]

Tests run: 16, Failures: 2, Errors: 0, Skipped: 0 

