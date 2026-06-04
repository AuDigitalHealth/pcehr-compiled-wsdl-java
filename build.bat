@echo off
setlocal
cd /d "%~dp0"
echo Building pcehr-compiled-wsdl JAR
if defined MVN_SETTINGS (
  mvn -B -s "%MVN_SETTINGS%" -Dgpg.skip=true clean verify %*
) else (
  mvn -B -Dgpg.skip=true clean verify %*
)
exit /b %ERRORLEVEL%
