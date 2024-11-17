# Overview

This java project is a TO-DO List program which allows the user to create tasks to complete, keep track of them, and check them off. The program is versatile to include tasks that need repeated on a regular basis, tasks that only have to be completed once, and tasks that need to be completed a quantivative amount, such as three times, without forcing the user to add the task 3 times.

I decided to build this project in Java because it is a common language in the coding industry with a diverse range of uses. Some of the things Java can be used to do is develop andriod mobile apps, web apps, and games. Java is even often used to develop software in physics. By involving myself in the Java scene, I am opening myself up to opportunities for both industrial involvement and personal growth. As I've done research and building for this project I have become increasingly fascinated with Java.

The software for this project includes several classes such as the main App class, a Menu class, a List class, and classes for the List items. The Menu class is used to display a list of options to the console. The things the user can do is contained within the List class and List items classes.

The List items classes are connected using inheritance. This is to provide versatility for the 3 current main types of items, which are those that should be repeated in a certain time period, those which are only completed once, and those which are completed a certain amount of times.

The goal of this project was to give myself an introduction to Java and build something that can be useful. This project is useful for all people with busy lives. Many people have reported success by creating a checklist and marking off the items as they get done, so the goal of this project is to replicate that in a digital environment.

{Provide a link to your YouTube demonstration. It should be a 4-5 minute demo of the software running and a walkthrough of the code. Focus should be on sharing what you learned about the language syntax.}

[Software Demo Video](http://youtube.link.goes.here)

# Development Environment

I used VSCode to build this project. I used the recommended developer pack on VSCode for Java extensions which includes Gradle for Java, IntelliCode, Language Support for Java, and Debugger for Java. These tools worked together for me to make the developement process smoother.

Java is a widely-used, high-level programming language. It is similar in syntax to C languages, such as and especially C#. Java is Object-Oriented, so it is focused on objects and classes for development. This feature is one of the main reasons it's so popular for game and app development.

I used the java.util.Scanner library, which is part of the standard Java library. It allows the program to read input from various sources. For this project, the purpose is to read input from the keyboard, which is used to simulate the user.

Additionally, I used the java.util.List and java.util.ArrayList libraries, which allows for using list/array methods in Java. The ArrayList allows for the easy implementation of the List.

At one point of development, I considered using the LocalDate package, which would allow me to connect due dates in the program to real time. I did not end up using it at this time but may revisit it for further, future implementation.

# Useful Websites

- [Oracle Java Page](https://docs.oracle.com/en/java/javase/index.html)
- [VSCode Java Guide](https://code.visualstudio.com/docs/languages/java)
- [W3Schools Java Page](https://www.w3schools.com/java/default.asp)
- [ChatGPT setup conversation](https://chatgpt.com/share/6733d31f-12c4-800b-b3bf-c688b030b71e)
- [Intro to Java YouTube](https://www.youtube.com/watch?v=RRubcjpTkks)
- [Simple Game Built in Java YouTube](https://www.youtube.com/watch?v=iOeebAM_C5g&t=429s)

# Future Work

- Improve code security by fixing warnings for resource leaks
- Improve code security by taking extra measures for private variables
- Include due dates in display
- Add null option for due date input
- Show amount of times completed and needed times completed for checklist/limited repeat items
- Implement connection with local date and time to the program for due date use