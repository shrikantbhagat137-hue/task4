UpdateStudentMarks
📌 Objective
This program updates a student’s marks in the students table of an Oracle database using JDBC.

⚙️ Concepts Used
JDBC (Java Database Connectivity) → Enables Java applications to interact with databases.

Driver Loading → Loads the Oracle JDBC driver to connect with Oracle DB.

Database Connection → Establishes connection using database URL, username, and password.

User Input → Collects student ID and new marks from the console.

PreparedStatement → Safely sets parameters in the SQL query, preventing SQL injection.

SQL Query Execution → Executes an UPDATE statement to modify student marks.

Result Handling → Displays whether the update was successful or if the student ID was not found.

Resource Management → Closes connections and statements to avoid memory leaks.

🔄 Flow of Work
Load JDBC driver

Connect to Oracle database

Take student ID and new marks from user

Form an SQL UPDATE query with PreparedStatement

Execute the query

Show success or error message

Close all resources

▶️ How to Run
Ensure Oracle DB is installed and running.

Create a table students with columns (id, name, age, marks).

Compile the program:

bash
javac UpdateStudentMarks.java
Run the program:

bash
java UpdateStudentMarks
Enter student ID and new marks when prompted.
