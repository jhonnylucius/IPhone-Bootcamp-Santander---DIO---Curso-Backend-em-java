@echo off
setlocal

rem Compile as classes Java
javac -d bin src\appabstract\*.java src\apps\*.java src\model\*.java

rem Verifique se a compilação foi bem-sucedida
if %errorlevel% neq 0 (
    echo Erro na compilação.
    exit /b %errorlevel%
)

echo Compilação bem-sucedida.

rem Criar o arquivo JAR executável
jar cfm IphoneApp.jar manifest.txt -C bin .

rem Verifique se o JAR foi criado com sucesso
if %errorlevel% neq 0 (
    echo Erro ao criar o JAR.
    exit /b %errorlevel%
)

echo JAR criado com sucesso: IphoneApp.jar