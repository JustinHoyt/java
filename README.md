create a `development` directory, clone the java repository, and go to the
repository:

```bash
mkdir -p ~/development
git clone https://github.com/JustinHoyt/java development/java
cd ~/development/java
```

Move the jar files to a centralized location

```bash
mkdir ~/.java
mv *.jar ~/.java
```

Add the following lines to your `~/.bashrc` file. The first line adds the Jar
files to your java classpath and the last two lines create a aliases to compile
and test your java files:

```bash
# Use the commented out line below instead of the export line if you're using fish
# set -gx CLASSPATH $CLASSPATH $HOME/development/java
export CLASSPATH="$CLASSPATH:$HOME/development/java"

# Java compile and test aliases
alias java-compile="javac --class-path .:$HOME/.java/junit-4.13.2.jar:$HOME/.java/hamcrest-core-1.3.jar"
alias java-test="java --class-path .:$HOME/.java/junit-4.13.2.jar:$HOME/.java/hamcrest-core-1.3.jar org.junit.runner.JUnitCore"
```

Source your bashrc file:

```bash
source ~/.bashrc
```

Now you can compile and run the tests:

```bash
java-compile *.java
java-test _98_ValidateBinarySearchTreeTest
```
