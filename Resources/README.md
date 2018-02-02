# Class Resources
## Software Dependencies
In order to work on class work from home, you will need to install some software. In the computer programming world, we call these "Dependencies". In other words, for my class curriculum to work, I depend on you having this set of software installed. My class work will not work if you don't install the following software:

### Visual Studio Code
Visual Studio Code is a text editor that will let you work in a selected project folder.

[Download Page](https://code.visualstudio.com/)

### Git Bash (Git Source Control Manager)
Git bash is a terminal that has git commands built into it. It's useful for keeping our code up to date with our cloud repositories. It also generally works better than the default windows terminal (called cmd).

[Download Page](https://git-scm.com/downloads)

### Notepad++
This one is optional. It's another text editor like Visual Studio Code, but it only supports opening single files. You can't open a whole folder. It's nice when you just want to make quick changes to a single file, but for projects, Visual Studio Code will be better.

[Download Page](https://notepad-plus-plus.org/)

### Java Development Kit (JDK version 8)
This one is the most important. We need the JDK in order to compile and run our Java code. This one also will require a couple steps to get it working properly:

1. [Download JDK 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
    * This link will have multiple versions. If you're on a Mac, just select the MacOS download. If you're on a Windows Operating System you want the one that is either Windows x86 (If your computer is 32 bit), or Windows x64 (If your computer is 64 bit). If you don't know whether your computer is 64 bit or 32 bit, just try the 64 bit (x64) version first. If it doesn't work, download and install the 32 bit (x86) version.

2. Once Java is installed, you will need to add it to your Operating System's PATH, otherwise you'll have to type all of your commands with absolute paths, like
    ```
    C:/Program\ Files\ \\(x86\\)/Java/jdk1.8.0_161/bin/javac Hello.java
    ```
    Instead of
    ```
    javac Hello.java
    ```
    Trust me, it's worth the effort to figure out how to add the jdk to your OS's PATH.

3. First, find the jdk install on your computer.
    * Windows users:
        * For Windows, it should be on the C drive under either "Program Files" or "Program Files (x86)".
        * In the Program Files folder, find the "Java" folder
        * In the Java folder, find "jdk1.8.0_161"
        * Inside this jdk folder, right click the "bin" folder and select "Properties"
        * In the properties menu, there should be a field called "target" that has a file path that should look something like ```C:/Program\ Files\ \\(x86\\)/Java/jdk1.8.0_161/bin```. Copy that file path.
    * Mac users:
        * I can't test this personally to be sure, but the steps should be very similar to the Windows steps, except you start in the "Applications" folder instead of the "Program Files" folder.

4. With this filepath copied, follow the instructions for your Operating System [Here](https://www.java.com/en/download/help/path.xml) to add this folder to your Windows PATH.

Once you have the JDK added to your PATH, close your terminal window and open a new one. Try compiling and running a [Hello World](https://github.com/BurroughsHighCS/Curriculum/tree/master/Assignments/TerminalCommands) program in your terminal to verify that the PATH was configured correctly. If you can't use the ```java``` and ```javac``` commands without their absolute paths, you will have to troubleshoot your PATH configuration until it works.

If these steps are hard, don't beat yourself up. Oftentimes, writing your code is the easy part of Software Development. Environment problems like this often take a lot of effort. See if your parents can help. If not take screen shots on your computer (not with your phone. I need higher resolution) and email them to me, I will do my best to give you advice on where to go in class.

## Miscellaneous
Absolute path to the JDK on school Windows machines:

C:/Program\ Files\ \\(x86\\)/Java/jdk1.8.0_161/bin/YOURCOMMAND
