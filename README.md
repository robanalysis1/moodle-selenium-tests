# moodle-selenium-tests : Moodle user installation+selenium tests <br />

Requirements: <br />
1. JUnit4 (included in libs)<br />
2. Apache Ant <br />
3. Java <br />

To run tests locally, <br />
1. Clone this repository and cd ~/moodle-selenium-tests <br />
2. Modify build.xml to include the tests you want and comment out the ones you dont <br />
3. Open TestRunSettings.java and comment out the following lines: <br />

   sm.startRemotes(gridHubURL, browserType); <br />
   driver = sm.getRemoteDriver(); <br />
   sm.teardown(); <br />
   
Ensure that the following lines are uncommented: <br />

   sm.startFirefoxDriver(); <br />
   driver = sm.getFirefoxDriver(); <br />
   sm.teardownFirefox(); <br />

