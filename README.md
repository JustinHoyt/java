create a `development` directory, clone the java repository, and go to the
repository:

```bash
mkdir -p "${HOME}/development"
git clone https://github.com/JustinHoyt/java
cd "${HOME}/development/java"
```

Add the following line to your `~/.bashrc` file to add the Jar files to your java
classpath and create an alias to run the tests:

```bash
export CLASSPATH="$CLASSPATH:${HOME}/development/java"
# Java test alias
alias javat="java org.junit.runner.JUnitCore"
```

Source your bashrc file:

```bash
source ~/.bashrc
```

Now you can compile and run the tests:

```bash
javac MyTests.java
javat MyTests
```
