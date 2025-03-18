# 📦 Container Box Management System

## 📝 Project Overview
The **Container Box Management System** is a Java-based application that allows users to manage a stack of storage boxes using a **Graphical User Interface (GUI)**. It utilizes **Java Swing** for UI interactions and follows the **stack data structure** for efficient storage management.

## 📂 Project Structure
The project consists of three main Java files:

- **`Box.java`** - Represents individual storage boxes with unique identifiers and weights.
- **`Stack.java`** - Implements a stack data structure to manage `Box` objects.
- **`ContainerGUI.java`** - Provides a GUI to interact with the stack and manage storage operations.

---

## 🏗 Class Details

### **📌 Box.java**
Defines a `Box` object with the following attributes:
- `boxCode`: A unique identifier for the box.
- `weight`: The weight of the box.

#### Methods:
- `getBoxCode()`: Returns the box's unique code.
- `getWeight()`: Returns the weight of the box.

---

### **📌 Stack.java**
Implements a **stack** data structure to store `Box` objects.

#### Attributes:
- `maxSize`: Maximum number of boxes the stack can hold.
- `top`: Tracks the top of the stack.
- `stackArray`: Array to store `Box` objects.

#### Methods:
- `push(Box i)`: Adds a `Box` to the stack.
- `pop()`: Removes and returns the top `Box`.
- `peek()`: Returns the top `Box` without removing it.
- `isFull()`: Checks if the stack is full.
- `isEmpty()`: Checks if the stack is empty.

---

### **📌 ContainerGUI.java**
Provides a **Java Swing GUI** for interacting with the `Stack` of `Box` objects.

#### Features:
- **➕ Add Box:** Users can input a `boxCode` and `weight` to add a new box.
- **➖ Remove Box:** Removes the top `Box` from the stack.
- **🧹 Clear Input:** Clears the input fields.
- **📢 Display Next Box:** Shows which `Box` is next to be removed.

---

## 🚀 Installation & Usage

### **🔹 Prerequisites**
- Install **Java Development Kit (JDK 8 or later)**.
- Install **NetBeans IDE** or any Java-supported IDE.

### **🔹 Steps to Run**
1. Open the project in **NetBeans** or any Java IDE.
2. Compile and run `ContainerGUI.java`.

---

## 🔧 Future Improvements
- 🖥 Implement a **Save & Load** feature to persist the stack data.
- 📜 Add an option to **view all boxes** in the stack.
- 🎨 Improve **UI design** for better user experience.

---
