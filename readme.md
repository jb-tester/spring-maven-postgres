

1. start mvn springboot:run goal with the debug options
2. run the remote debug configuration in debug mode
3. run the http request
result: the application doesn't stop on breakpoints, though the Spring Debugger seems to be initialized


works ok if the Spring Boot RC is run instead of mvn springboot:run


with Spring Boot RC+ AttachDebugger... the Spring Debugger is not initialized.