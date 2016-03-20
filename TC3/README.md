# Using <span style="font-variant: small-caps">TC3</span>

<span style="font-variant: small-caps">TC3</span> calculates the code coverage of transcompiled cross-platform applications for any kind of test (unit, integration or ui/web test). Currently, we support web applications created with Google Web Toolkit. Besides, the tool is also able to calculate the code coverage of desktop applications written in Java.

## Requirements
**Necessary:**
- Eclipse
- MySQL

**Optional:**
- Maven
- Hupa source files to build the web application from scratch

**Details:**
In order to run <span style="font-variant: small-caps">TC3</span>, you need to install a version of [Eclipse](https://eclipse.org/). Besides, you need MySQL. If you do not have already installed MySQL, we recommend [XAMPP](https://www.apachefriends.org/de/index.html) (for all OS) or [WAMPP](http://www.wampserver.com/en/) (for Windows). 
If you want to check out and build Hupa from source, you will need [Maven](https://maven.apache.org/). Please follow the instructions on the [Hupa website](http://james.apache.org/hupa/building.html). Alternatively, you can use precompiled versions of Hupa if you do not want to build Hupa from scratch. The precompiled versions are available for download as Eclipse-project in the ['Hupa-Versions'](../Hupa-Versions/) directory. 


## Install <span style="font-variant: small-caps">TC3</span>
Clone this repository. You will find the <span style="font-variant: small-caps">TC3</span> plugin for Eclipse in this directory. Install the plugin in Eclipse: Select Menu 'Help' -> Install New Software'. Click on 'Add', fill in a name and the path to <span style="font-variant: small-caps">TC3</span>. Please note, it is an Archive-file. Deselect the option 'Group items per category'. Follow the Eclipse-Installation process. Afterwards, select in the menu 'Window' -> 'Show View' -> 'Other' -> '<span style="font-variant: small-caps">TransCompiledCodeCoverage</span>'.

If you want to do a quick code coverage analysis without running all the web tests, you can use the log-traces which we have used in our evaluation. You will find them in the [webtests](../webtests/) directory as MySQL-dumps.


## Using <span style="font-variant: small-caps">TC3</span> - Quick analysis procedure
Currently, calculating the code coeverage is a semi-automatic process consisting of there three steps. Basically, these steps could be executed automatically. However, they depend on the test framework in use (e.g. JUnit, TestNG vs. Selenium, TestComplete...). For this reason, we currently leave the test execution step to the user. In our evaulation, we have only considered the runtime required for instrumenting the code and for calculating the code coverage.

1. Click in <span style="font-variant: small-caps">TC3</span> on the Settings-icon. Select the project you want to analyze. For example, use 'EclispeHupaR1684702' in the ['Hupa-Versions'](../Hupa-Versions/) directory (please note the README-file in this directory). Select the analysis precision level. We have used Expression Star as instumentation level in our evaluation. Define the packages that contain client-side code and server-side/desktop application code, respectively. Click OK.
2. Make sure the MySQL-dump 'hupa_coverage.sql' is available.
3. Determine the code coverage. Start the calculation by clicking on the statistics button. Look at the metrics in the table. 


## Using <span style="font-variant: small-caps">TC3</span> - Full analysis procedure
Currently, calculating the code coeverage is a semi-automatic process consisting of there three steps. Basically, these steps could be executed automatically. However, they depend on the test framework in use (e.g. JUnit, TestNG vs. Selenium, TestComplete...). For this reason, we currently leave the test execution step to the user. In our evaulation, we have only considered the runtime required for instrumenting the code and for calculating the code coverage.

The full code coverage analysis procedure looks like this:

1. Click in <span style="font-variant: small-caps">TC3</span> on the Settings-icon. Select the project you want to analyze. For example, use 'EclispeHupaR1684702' in the ['Hupa-Versions'](../Hupa-Versions/) directory (please note the README-file in this directory). Select the analysis precision level. We have used Expression Star as instumentation level in our evaluation. Define the packages that contain client-side code and server-side/desktop application code, respectively. Click OK.
2. Instrument the project (or use the prepared version in the ['Hupa-Versions'](../Hupa-Versions/instrumented/) directory). To do this, click in <span style="font-variant: small-caps">TC3</span> on the Barcode-icon. A new project will appear in the Package Explorer of Eclipse. The name of the project will be 'EclipseHupaR1684702Instrumented'. This is the instrumented version.
3. Build 'EclipseHupaR1684702Instrumented' (this includes the compilation with the GWT-compiler). To do this, simply navigate to the 'EclipseHupaR1684702Instrumented' directory and run 'mvn clean package' (**Maven required**).
4. Trace the program execution with the logging server. If your software under test is a web application, activate the logging server, that is, click on the black server icon with the green play symbol. If your software under test is a desktop applications, no logging server has to be started as no data have to be sent via WebSockets. Run the instrumented web application with the web test suite.
5. Determine the code coverage. Start the calculation by clicking on the statistics button. Look at the metrics in the table. 


## FAQ's

1. 	`java.lang.ClassCastException: org.eclipse.wst.xml.ui.internal.tabletree.XMLMultiPageEditorPart cannot be cast to org.eclipse.ui.texteditor.ITextEditor`<br>
Please ensure that a java-file is opened in the editor. 
Close the view <span style="font-variant: small-caps">TC3</span> and re-open it (menu Window -> Show view -> Other -> <span style="font-variant: small-caps">TC3</span>).
2. There are no results after an analysis has been re-executed. Instead, an exception window occurred. <br>
Please ensure that there is a java-file in the editor and put the focus on the editor itself (by clicking in the editor window), not on the view of the plug-in. Just repeat the analysis.
