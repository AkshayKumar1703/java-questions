Tools

# 1️⃣ Terminal – Basic Commands

## ✅ What is Terminal?

**Terminal** is a command-line interface (CLI) that allows you to interact with your computer using text commands instead of clicking with a mouse.

On macOS, it’s the **Terminal app**, which gives access to the Unix-based system underneath.

---

## 🎯 Why is Terminal Important?

As a future software engineer:

* You run Java programs
* Compile code
* Manage files
* Install tools
* Use Git
* Work with servers (Linux)
* Automate tasks

Most backend and DevOps work is command-line based.

---

## ⚙️ Basic Terminal Commands

### 📁 File & Directory Commands

```bash
pwd
```

👉 Print working directory (Where am I?)

```bash
ls
```

👉 List files

```bash
ls -la
```

👉 List all files (including hidden ones)

```bash
cd folderName
```

👉 Change directory

```bash
cd ..
```

👉 Move one folder up

```bash
mkdir test
```

👉 Create folder

```bash
touch file.txt
```

👉 Create file

```bash
rm file.txt
```

👉 Delete file

```bash
rm -r folderName
```

👉 Delete folder

---

### 📄 File Content Commands

```bash
cat file.txt
```

👉 Show file content

```bash
clear
```

👉 Clear screen

---

# 2️⃣ Homebrew (Brew) – Package Manager

## ✅ What is Brew?

Homebrew is a package manager for macOS.

It installs software from the command line.

---

## 🎯 Why is Brew Important?

Without Brew:

* You manually download software
* Move files
* Configure paths

With Brew:

* One command installs everything
* Easy updates
* Easy uninstall

Example tools you'll install:

* Java
* Maven
* Node
* Git
* MySQL

---

## ⚙️ How Brew Works

Install something:

```bash
brew install git
```

Update Brew:

```bash
brew update
```

Upgrade packages:

```bash
brew upgrade
```

Search packages:

```bash
brew search java
```

List installed:

```bash
brew list
```


# 3️⃣ Zsh (Z Shell)

## ✅ What is Zsh?

Z shell (Zsh) is a shell — a program that runs inside Terminal and interprets your commands.

macOS uses Zsh by default (instead of Bash).

---

## 🎯 Why is Zsh Important?

* Better auto-completion
* Better command suggestions
* Plugins support
* Custom themes (like Oh My Zsh)

As a developer, it improves productivity.

---

## ⚙️ How Zsh Works

When you open Terminal:

* Zsh loads your config file:

```bash
~/.zshrc
```

You can customize:

* Aliases
* Environment variables
* Java paths
* Prompt theme

Example alias:

```bash
alias gs="git status"
```

Now instead of typing:

```bash
git status
```

You type:

```bash
gs
```

# 4️⃣ Unix – What & Why

## ✅ What is Unix?

Unix is a family of operating systems.

macOS and Linux are Unix-based.


## 🎯 Why is Unix Important?

Most servers in the world run on Linux (Unix-like).

If you become:

* Backend Engineer
* DevOps Engineer
* Data Engineer
* Cloud Engineer

You must know Unix basics.

# 5️⃣ Important Unix Commands


## 🔍 grep

### ✅ What

Search for text inside files.

### 🎯 Why

Useful for searching logs, code, errors.

### ⚙️ How

```bash
grep "error" file.txt
```

Search recursively:

```bash
grep -r "main" .
```

## 📄 head

### ✅ What

Shows first lines of file.

```bash
head file.txt
```

First 5 lines:

```bash
head -n 5 file.txt
```

## 📄 tail

### ✅ What

Shows last lines of file.

```bash
tail file.txt
```

Live log monitoring:

```bash
tail -f logfile.txt
```

Used heavily in backend systems.

## 📝 vim

## ✅ What is Vim?

Vim is a powerful terminal-based text editor.

## 🎯 Why is Vim Important?

* Used on servers
* Lightweight
* Available everywhere
* Used in production systems

## ⚙️ How Vim Works

Open file:

```bash
vim file.txt
```

Modes in Vim:

1️⃣ Normal mode (default)
2️⃣ Insert mode → press `i`
3️⃣ Save → `:w`
4️⃣ Quit → `:q`
5️⃣ Save + Quit → `:wq`
6️⃣ Force quit → `:q!`


# 6️⃣ Basic Bash Scripting

## ✅ What is Bash Scripting?

Writing a file containing terminal commands that run automatically.

## 🎯 Why is Bash Scripting Important?

* Automate tasks
* Build deployment scripts
* Run builds
* DevOps work
* CI/CD pipelines

## ⚙️ Simple Example Script

Create file:

```bash
touch hello.sh
```

Open in vim:

```bash
vim hello.sh
```

Add:

```bash
#!/bin/bash
echo "Hello World"
```

Save and exit.

Make executable:

```bash
chmod +x hello.sh
```

Run:

```bash
./hello.sh
```

## 🧠 Variables in Bash

```bash
name="Rahul"
echo "Hello $name"
```

---

## 🧠 Simple If Condition

```bash
if [ $1 -gt 10 ]
then
  echo "Number is greater than 10"
fi
```

# 🎯 Why All This Matters for Java & Software Engineering

When learning Java:

You will:

* Compile code → `javac`
* Run code → `java`
* Use Maven
* Use Git
* Deploy apps
* Work with Linux servers

These tools are foundational.

