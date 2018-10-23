@echo off
call :sub >output.txt
exit /b

:sub
speedtest-cli --simple