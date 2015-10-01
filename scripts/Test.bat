@echo off
set workspace=C:\Users\dowro\Desktop\Diego\workspace\ECP1
set PATH=%PATH%;C:\Program Files\Java\jdk1.8.0_60\bin;C:\Users\dowro\Desktop\Diego\software\apache-maven-3.3.3\bin
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_60
set M2_HOME=C:\Users\dowro\Desktop\Diego\software\apache-maven-3.3.3
echo -----------------------------------------
echo . (C) MIW
echo -----------------------------------------
echo .
echo Workspace --- %workspace%
echo .
cd %workspace%
echo ============ mvn clean test =======================================================
echo .
call mvn clean test
pause