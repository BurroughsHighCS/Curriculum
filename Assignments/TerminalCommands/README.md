# Terminal Commands (Hello World)
The terminal is a barebones control interface to navigate file systems and execute software programs.

While "Terminal" is the most common term used for this tool, other common names for the tool are:
* Command Line
* Bash
* Shell

The above names have some slight connotation differences, but for the purposes of this class, they are interchangeable.

As you become a more experienced software developer, you will learn that writing code is one of the easiest aspects of writing software. One of the most difficult skills is to setup and manage your software's _environment_. The terminal is one of many tools you will need to manage software environments.

## Searching for Answers
As a Software Developer, I often find myself struggling with incredibly specific problems or errors. One of the most valuable skills I learned in my studies was what some people call "Google-fu", or the fine art of googling specific problems using deliberately chosen key words. You are likely already skilled in "Goole-fu", but I guarantee you will find your skills more lacking than you expect when you try to google search software development issues.

On an average work day, I still spend the vast majority of my time searching google for solutions that relate even slightly to my coding and environment issues.

In this class, I will often not give you specific instructions how to complete tasks. Instead I will give you basic instructions, coupled with a list of terminology that might help you in your google searches considering the task at hand. I may not explain all of the terms I provide.

## Terminology and Commands
### Terms
* Terminal
* Command Line
* Navigate
* File System - The OS's method of organizing directories/folders/files
* Directory - Another word for folder
* Drive (e.g. "c:" Drive)
* File

### Commands
* cd : ChangeDir, or Change Directory
* ls : Lists contents at the terminal's current directory
* mkdir : Make Directory
* rm : Delete. Only deletes single files by default. You will need to learn how to delete folders
* touch
* cat
* javac

## Exercise
1. Open an instance of the "Git Bash" terminal.
    * Git Bash can be found by opening the windows menu and typing "Git Bash"
    * There are many different terminals that people use. In class we will use Git Bash exclusively so we are all on the same page.
2. Navigate in the terminal to your c drive
3. From C Drive, navigate to your machine's desktop
4. From the terminal, make a directory using your last name
5. From the terminal, make a file in the new directory called "Hello.txt"
6. Verify on your desktop that the new folder and file were created
7. From the terminal, delete the folder you just created
8. From the terminal, make a directory called HelloWorld
9. From the terminal, make a file in the new directory called "Hello.java"
10. Using a text editor (Notepad++ or Visual Studio Code recommended), open the new file, write the following lines of Java code in it exactly:
```Java
    class Hello
    {  
        public static void main(String args[])
        {
           System.out.println("Hello World!");
        }
    }
```
11. In the terminal window, display the new contents of the text file
12. Now compile the java program, using the "javac" command
```
    javac Hello.java
```
13. List the contents of the current directory  
    * You should see a new "Hello.class" file
    * The javac command runs your specified java file through a compiling process which will change it from human-readable code to machine readable "bytecode".
14. The Hello.class file is the same small program you wrote, but now it's in bytecode. Try displaying its contents in your terminal and comparing them to the original java file.
15. Now try running your program:
    * It should just say "Hello World" by itself, now.
    * Congratulations on your first program!
```
    java Hello
```
16. If in class, show your completed work to me. If not in class, take a screenshot of your terminal window showing as much of your command history as possible. I will have you upload this to a space for me to pass it off later.
