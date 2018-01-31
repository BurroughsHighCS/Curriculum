# Github (Work in progress)
Github serves many purposes. Since most of those purpose don't have any immediate connection to the AP exam, however, we won't discuss them in the scope of this class. For this class, we will use Github primarily as a tool for redundancy and change tracking.

## Redundancy
Have you ever accidentally deleted a crucial file or had your hard drive die on you? It happens to anyone and everyone at some point.

Redundancy is a bad term for most people, but in the world of digital data, we _love_ redundancy. Redundancy is the practice of storing your data in more than one location, so you can recover it if you lose it.

This is one of the great tools that github will provide us. You can store all of your code in the cloud, so it's safe even if you lose your local files.

## Change Tracking and Syncing your Code Base
Redundancy is only one benefit of storing your data in Github's cloud. Github also allows you to sync up your code base across multiple machines. Let's say you start writing a program in class, but you don't finish it. Right before you leave, you can "push" your changes up to a Github Repository. Then, when you get home, you can "pull" those changes back down.

To handle this code syncing, Github uses a software call "Git" (Git_hub_ is just a collection of "Git" repositories). Git is a content tracking software that makes these "pushes" and "pulls" efficiently.

## An Odd Fact from Programming History
The original description of Git when it was first released was a bit odd:
```
Git Description
```

## Terms and Commands
### Terminology
* Git
* Github
* Source Control Management (SCM) - Sometimes called "Source Code Management"
* Redundancy
* Stage
* Commit
* Push
* Pull
* Clone

### Commands
* git add -A
* git status
* git commit -m "<Your message>"
* git push origin master
* git clone <url>
* git pull origin master

## Exercise
In this first exercise, you will create your first Git repository, you will add code to the repository, and then you will push and pull that code up and down through the cloud using the commands listed above.

1. Create a Github account if you don't already have one, then log into it.
    * Also, please send me an email with your Github username (So I can grade your work as needed).
2. On the first page after you log in, there should be a big white button that says "Start a Project." Click it.
3. From here, name your repository. Note that you will be using this repository for the remainder of this class. I would name mine something like "MerrellAPCS".
    * Leave the repository as public (private costs money)
    * Click the "Create Repository" button lower on the page.
4. You should now be at a page that looks like this:
![New Repository](./NewRepo.png)

5. Now, create a directory somewhere on your computer where you want to store all of your class work.
    * In my terminal, I just did:
    ```cd ~```
    Followed by 
    ```mkdir Code```
    This created my Code directory in my windows user file (The default file your terminal opens up to). This way, every time I open my terminal, all I have to do is type:
    ```cd Code```
    And I'm already in my code directory.
6. In your terminal, navigate into the new folder. Here you need to paste a list of commands into your terminal, but the commands will be different for each of you, because they are specific to your repository. If we look at the new repository page back on Github, the commands are listed. Look at the red box in the whole picture below:
    ![Repository Initialization Commands](./GitInitCommands.png)

    * You can copy that _whole_ chunk of commands and paste them all at once. Remember that paste is _Shift + Insert_ in the Git Bash Terminal
    * When you paste the whole block all at once, your terminal will automatically execute all but the last command "git push -u origin master". For this one, you need to hit enter manually. This command should prompt you to enter your github username and password to complete it.

7. Now, if you look at your terminal. you should see a blue label attached to your folder name that says (master) anytime you are inside of it. This means that your current directory is connected to a Git repository.
    ![Git Repo Label](./GitLabel.png)
    * Also, if you refresh your repository page, you should see that it now looks different. It's now a fully initialized repository (it's empty, but it's ready to go).
8. Lets move our Hello World application into our new repository. Go find it on the desktop and move it to your repository folder.
9. Once the file is moved, type
```
git status
```
into your terminal. You should see some colored messages about some "Untracked files"
![Untracked files](./UntrackedFiles.png)
10. Before Git will upload these new files to the repository, we have to "stage" them to be added using the "Git add" command.
    ```
        git add -A
    ```
    * The '-A' parameter just means "All". For this class, you should just use the '-A' whenever you do use the git add command.
11. Now if we run 'git status' again, we should see that the files are now ready "to be committed":
![Files Ready](./FilesStaged.png)
12. One last step before we push our new files into the cloud. We need to write a "commit message" for these files and commit them to be pushed. Use the following command, entering your own message where I say "YOUR MESSAGE HERE":
    ```
    git commit -m "YOUR MESSAGE HERE"
    ```
    * These messages should reflect the changes you're making to your code so you can track them later. Things like "Moves Hello World Function into repo" or "Fixes bug in <SOME PART OF CODE>"
13. Now you're ready to upload the changes:
    ```
    git push origin master
    ```
    * This should ask for your github username and password again.
    * Don't worry about the 'origin master' part for now. That will just be part of all of our push statements from now on (there's more, but not part of this class).
14. Congratulations! Now if you reload your github repository, you should see that your Hello World functions are inside it.


