# Programare avansată pe obiecte

## Adrian Apostol
## adrian-alexandru.apostol@endava.com

### 1. JDK

You will need to set a Java Development Kit (JDK), in order to develop Java applications.

- download the open-source build of Java 21 from: https://jdk.java.net/21/
- in `C:\Program Files`, create a new folder called `Java`
- extract the content of the build in this folder
- in System Variables, create a new variable called `JAVA_HOME`, pointing to the path of the build (i.e. `C:\Program Files\Java\open-jdk-21.0.2`)
- in System Variables, add to the `Path` variable the location of the bin folder (i.e.  `C:\Program Files\Java\open-jdk-21.0.2\bin`)

To test that everythink works as expected, run in terminal `java -version`

### 2. Maven

This will be useful in the future, when you will want to use projects already developed, from a central repository

- download the latest version of Maven from: https://maven.apache.org/, use the binary release
- in `C:\Program Files`, create a new folder called `Maven`
- extract the content of the archive in this folder
- in System Variables, create a new variable called `MAVEN_HOME`, pointing to the path of the build (i.e. `C:\Program Files\Maven\maven-apache-3.9.6`)
- in System Variables, add to the `Path` variable the location of the bin folder (i.e. `C:\Program Files\Maven\maven-apache-3.9.6\bin`)

To test that everythink works as expected, run in terminal `mvn -v`

### 3. Git

This will be useful in order to push your work to a repo, also to have easy access to the materials

- download and install the latest version of Git from: https://git-scm.com/downloads

To test that everythink works as expected, run in terminal `git -v`

### 4. IntelliJ IDEA Ultimate

This will be the IDE in which we'll solve exercises from the lab. 

- download and install the latest version of IntelliJ from: https://www.jetbrains.com/idea/download/?section=windows
- in order to be able to use it, you will need to create an account to Jetbrains, then to confirm your student status here: https://www.jetbrains.com/shop/eform/students/. IMPORTANT: in this page, you need to use your student account (**@s.unibuc.ro**)

### 5. Docker

This will be used in the last part of the lab, when we will use databases, in order to have an easier management of it.

- download and install the latest version of Docker Desktop from: https://www.docker.com/products/docker-desktop/

To test that everythink works as expected, run in terminal `docker -v`

### 6. Github account

If you don't already have an account, you will need to create one here: https://github.com/