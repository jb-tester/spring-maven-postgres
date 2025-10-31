## Spring Debugger for the remote maven run configuration

Note that the debug options should be passed to the maven `spring-boot:run` configuration as 

`-Dspring-boot.run.jvmArguments="-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005"`

**To test:**

1. start mvn springboot:run goal with the debug options
2. run the remote debug configuration in debug mode
3. run the http request


**Or:**
1. start mvn springboot:run goal with the debug options
2. use Attach debugger... inlay in console
3. run the http request
