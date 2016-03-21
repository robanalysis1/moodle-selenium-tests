#!/bin/bash
ip_addr=$1
DISPLAY=$ip_addr
java -jar /home/adi/Moodle_Selenium_Tests/test_moodle_first_instance/lib/selenium-2.47.1/selenium-server-standalone-2.47.1.jar -role hub -hub http://$ip_addr:4444/grid/register #-Dwebdriver.chrome.driver=lib/chromedriver
# 2>1& > ../tmp/gridhub.log
