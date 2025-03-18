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
## Screenshots

![ContainerSS1](https://github.com/user-attachments/assets/3d8fe001-60c7-469a-844e-367af98a077f)
![ContainerSS2](https://github.com/user-attachments/assets/016e015f-d0da-4ab4-b7dd-ab8242f77b99)
![ContainerSS3](https://github.com/user-attachments/assets/1055411b-fab2-451c-bd38-5ac0cf96a565)
![ContainerSS4](https://github.com/user-attachments/assets/29e0126b-8a9a-4f62-95b5-b13dd4c4901b)
![ContainerSS5](https://github.com/user-attachments/assets/c0a71f1a-9955-4893-a37f-6d2a51818001)
![ContainerSS6](https://github.com/user-attachments/assets/cb09a7ef-992b-40f4-a488-90085b84d456)



