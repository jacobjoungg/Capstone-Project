# Project: CSA Capstone

You've spent the year learning to design programs that solve problems, tell stories, and explore data. Now it's time to bring it all together. Your capstone project is your chance to draw from every unit — class design and inheritance, arrays and ArrayLists, algorithms, the Theater/Scene API, image filters, NLP, and searching/sorting — and produce one program that showcases what you've learned.

You'll choose a topic that matters to you. It could be data-driven (like *Data for Social Good*), reflective (like *New Scene, New Me*), creative (like *Asphalt Art* or *Personal Narrative*), or interactive (like an NLP-powered tool). The topic is yours — the technical foundation is required.

# Core Requirements (Everyone)

### 1. Object-Oriented Programming
- A **superclass** that represents the main entity in your project (a data record, a story scene, a product, a text passage, etc.).
- **At least one subclass** that properly extends the superclass.
- **Private instance variables** in all classes.
- Both a **no-argument constructor** and a **parameterized constructor** in each class.
- The subclass constructor must use the **`super`** keyword to call the superclass constructor.
- **Accessor and mutator methods** for instance variables that need external access.
- A **`toString()` method** in the superclass, **overridden** in the subclass and incorporating `super.toString()`.

### 2. Data Structure + Algorithm
- At least one **1D array OR ArrayList** to store your project's data.
- At least one **method that traverses or manipulates** the data structure using a **loop** (while, for, or enhanced for) AND a **conditional** (if / if-else) to return useful information to the user.

### 3. Theater/Scene API Output
- At least one **Scene subclass** with a `drawScene()` method that visually presents your project's output.
- Use at least **four different Scene API methods** (e.g., `drawImage()`, `drawText()`, `drawRectangle()`, `drawEllipse()`, `setFillColor()`, `setTextStyle()`, `playSound()`, `pause()`).
- Successfully call `Theater.playScenes()` to run your scene(s).

### 4. UML Diagram
A UML class diagram showing your superclass, subclass(es), and Scene class(es) with:
- Instance variables (data types **and** access modifiers)
- Constructors (with parameter lists)
- Methods (with return types **and** parameter lists)
- The inheritance relationship clearly shown

### 5. Documentation
- **Multi-line comments** on every method describing purpose, preconditions, and postconditions.
- **Single-line comments** explaining complex code segments and logic.

### 6. GitHub
A personal GitHub repository containing all `.java` files, asset files (images, text files), and a `README.md` with:
- Project description (what it is, who it's for)
- UML diagram (as an image)
- List of Scene API methods used
- List of electives completed

# Elective Requirements (Pick At Least 3)

Show the breadth of what you've learned. You must complete **at least three** of the following. Completing more is encouraged and counted toward the rubric.

| # | Elective | What it demonstrates |
|---|----------|---------------------|
| A | **Multiple subclasses** — two or more subclasses that extend the superclass | Inheritance hierarchies |
| B | **FileReader** — populate at least one data structure by reading from a text file using the `FileReader` class | File I/O |
| C | **2D array** — use a 2D array with nested loops to store or process data in your project | 2D array algorithms |
| D | **Image filters** — apply at least one image filter (from Unit 5 or student-developed) to an image in your scene | 2D array manipulation, pixel logic |
| E | **ArrayList** — use an ArrayList **in addition to** (not in place of) your required 1D array | ArrayList operations |
| F | **String class + NLP** — use at least two `String` class methods to apply a natural language processing technique to text in your project | String processing, NLP |
| G | **Search or sort algorithm** — implement one of the six algorithms from Unit 8 (Binary Search, Bubble Sort, Selection Sort, Insertion Sort, Quick Sort, Merge Sort) and use it meaningfully on your project's data | Searching / sorting |
| H | **Scanner input** — use the `Scanner` class to take user input that affects what's displayed or computed | User interaction |
| I | **Static features** — use a static variable, a constant, or a static helper method meaningfully in your program | The `static` keyword |

# UML Diagram

Put an image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one word, otherwise it might not properly get displayed on this README.

![UML Diagram for my project](![alt text](image.png))

# Description of Project

My project is called Theater Audition Analyzer. The purpose of this project is to help organize performers who are auditioning for a theater show. The program keeps track of different types of performers, such as actors and singers, and stores important information about them. For actors, the program stores their name, skill level, role, and whether they have a costume. FOr singers, the program stores their name, skill level, song title, and vocal range. 
# Electives Used / Scene API Methods

The project uses the Theater/Scene API to visually display the results. The scene shows the actors, singers, and final audition results using text, shapes, colors, and pauses. The first scene displays the actors, the second scene displays the singers, and the final scene shows the top actor, top singer, number of actors with costumes, and number of singer with a vocal range of 6 or higher. Overall, this project combines class design, inheritance, ArrayLists, algorithms, sorting, and visual output to create a program that analyzes theater auditions and presents the results in a clear way. Some electives that I used were the static variables and the sorting algorithm. 
