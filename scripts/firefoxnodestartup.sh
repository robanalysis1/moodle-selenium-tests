#!/bin/bash
ip_addr=$1
/usr/bin/java -jar /home/adi/Moodle_Selenium_Tests/test_moodle_first_instance/lib/selenium-2.47.1/selenium-server-standalone-2.47.1.jar -role node -hub http://$ip_addr:4444/grid/register #-nodeConfig /home/adi/Moodle_Selenium_Tests/test_moodle_first_instance/properties/JSON/FirefoxNode/webconfig.txt