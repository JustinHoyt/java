create the following directory and go to that directory:

```bash
mkdir -p "${HOME}/development/java"
cd "${HOME}/development/java"
```

clone the repository:

```bash
git clone https://github.com/JustinHoyt/java .
```

Add the following to your `~/.bashrc` file to add the Jar files to your java
classpath:

```bash
export CLASSPATH="$CLASSPATH:${HOME}/development/java"
```

Source your bashrc file:

```bash
source ~/.bashrc
```

Now you can compile and run the tests:
```bash
javac MyTests.java
java org.junit.runner.JUnitCore MyTests
```
