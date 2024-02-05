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

Add the following lines to your `~/.bashrc` or `~/.config/fish/config.fish` file. The first line adds the Jar
files to your java classpath and the last one is an alias for running the junit test runner:

```bash
# Use the commented out line below if you're using bash or zsh
# export CLASSPATH $CLASSPATH . $HOME/.java/*.jar
# Use the commented out line below if you're using fish
# set -gx CLASSPATH $CLASSPATH . $HOME/.java/*.jar

# Java test alias
alias javat="java org.junit.runner.JUnitCore"
```

Source your bashrc or config.fish file:

```bash
source ~/.bashrc
# Or
source ~/.config/fish/config.fish
```

Now you can compile and run the tests:

```bash
javac *.java
javat _98_ValidateBinarySearchTreeTest
```
