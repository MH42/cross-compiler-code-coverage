# Running web tests with Selenium

We have evaluated the open source mail client Hupa using a test suite consisting of 32 web tests. The tests have been created with [Selenium](http://www.seleniumhq.org/), a plug-in for the Firefox web browser.

## Basic information
In this directory, you will find our test suite. We have applied our test suite to the following revision of Hupa:
- 1684702

You will find our test suite in the following directory:
- tracesAcceptanceSelenium R1684702 autotest
It is also available as zip-file.

In our evaluation, we have performed the following steps:
1) Instrument the code. To do this, click on the barcode icon in the Eclipse-Plugin <span style="font-variant: small-caps">TC3</span>.
2) Run the tests. See below for more information.
3) Calculate the code coverage. To do this, click the statistics icon in the Eclipse-Plugin <span style="font-variant: small-caps">TC3</span>.

## Running the test suite
If you want to run the web tests, you will need to download and install [Selenium](http://www.seleniumhq.org/) for Firefox. The Selenium IDE is completely sufficient. 

In order to run the web tests, Selenium requires two JS-scripts. The first one (accountData.js) is available in this directory and contains data used during the tests. The second one - [sideflow](https://github.com/73rhodes/sideflow) - is a flow control extension for Selenium IDE available for download at Github.

After you have downloaded both the tool and the scripts successfully, start Selenium. You will find it in the 'Tools' menu of your Firefox browser. Navigate to 'Options' -> 'Options…'. In the 'General' tab, add in 'Selenium core extensions' the path that points to the 'Sideflow'-script. Insert the path to accountData.js in 'Selenium IDE extensions'.

## Logged CIDs
If you don't want to run an instrumented version of Hupa in order to get the corresponding CIDs, you can use our CIDs which we have used during the evaluation. The CIDs for the revisions 1684702 are available as MySQL-dump-file (hupa_coverage.sql) in this directory. 

## Code Coverage Results
The code coverage results obtained in our evaluation when running Hupa are available as screenshot of our Eclipse-Plugin <span style="font-variant: small-caps">TC3</span>.