@echo off
set workspace=C:\Users\dowro\Desktop\Diego\workspace\ECP1
set PATH=%PATH%;C:\Program Files\Java\jdk1.8.0_60\bin;C:\Users\dowro\Desktop\Diego\software\apache-maven-3.3.3\bin
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_60
set M2_HOME=C:\Users\dowro\Desktop\Diego\software\apache-maven-3.3.3
cd %workspace%

:: Install en Pre-Production
echo ============ mvn -Dmaven.test.skip=true package -Denvironment.type=preproduction =======================================================
echo .
call mvn -Dmaven.test.skip=true package -Denvironment.type=preproduction

if errorLevel 1 goto errorPreproduction

pause
exit

:errorPreproduction
echo .
echo .
echo .
echo ########  ERRORES de package en Preproduction
pause
exit
