Here’s a **step-by-step guide** to install **JDK (Java Development Kit)** and **IntelliJ IDEA** on your local machine so you can start writing Java code:

---

## 1. Install JDK (Java Development Kit)

### Step 1: Download JDK

* Go to the official [Oracle JDK download page](https://www.oracle.com/java/technologies/downloads/).
* Alternatively, you can use [Adoptium Temurin](https://adoptium.net/) (open-source and widely used).
* Choose the latest **Java SE (LTS version, e.g., 21)** for your operating system (Windows, macOS, or Linux).

### Step 2: Install JDK

* Run the installer and follow the prompts.
* By default, it installs to:

  * **Windows**: `C:\Program Files\Java\jdk-<version>`
  * **macOS**: `/Library/Java/JavaVirtualMachines/jdk-<version>.jdk`
  * **Linux**: usually `/usr/lib/jvm/jdk-<version>`

### Step 3: Set Environment Variables (Windows only, macOS/Linux auto-configures)

1. Open **System Properties → Environment Variables**.
2. Add a new **system variable**:

   * Name: `JAVA_HOME`
   * Value: path to your JDK (e.g., `C:\Program Files\Java\jdk-21`)
3. Edit the **Path** variable and add:
   `%JAVA_HOME%\bin`
4. Open a **new terminal (Command Prompt/PowerShell)** and run:

   ```bash
   java -version
   javac -version
   ```

   You should see your installed version.

---

## 2. Install IntelliJ IDEA

### Step 1: Download IntelliJ IDEA

* Visit [JetBrains IntelliJ IDEA download page](https://www.jetbrains.com/idea/download/).
* Choose:

  * **Community Edition (Free)** – good for learning Java.
  * **Ultimate Edition (Paid)** – adds web, enterprise, and database tools.

### Step 2: Install IntelliJ

* Run the installer (Windows/macOS) or use package manager (Linux).
* Follow the setup wizard.

### Step 3: Configure IntelliJ for Java

1. Open IntelliJ IDEA.
2. Go to **File → New Project**.
3. Select **Java** → choose the installed **JDK version** (IntelliJ usually auto-detects).
4. Create a project and IntelliJ sets up everything.

---

## 3. Test with a Simple Java Program

### Step 1: Create a File

Inside your IntelliJ project, create a new file:

`Main.java`

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

### Step 2: Run the Program

* Right-click inside the file and select **Run 'Main.main()'**.
* You should see:

  ```
  Hello, Java!
  ```

---

✅ Now you’re ready to start coding in Java with IntelliJ!

