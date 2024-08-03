package LibraryManagement;

import java.util.InputMismatchException;
import java.util.Scanner;

class Book {
    public int serialNo;
    public String bookName;
    public String authorName;
    public int bookQty;
    public int bookQtyCopy;

    private Scanner input = new Scanner(System.in);

    public Book() {
        while (true) {
            try {
                System.out.print("Enter the serial no. of the book: ");
                this.serialNo = input.nextInt();
                input.nextLine(); // consume the newline
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid serial number.");
                input.next(); // clear the invalid input
            }
        }

        System.out.print("Enter the name of the book: ");
        this.bookName = input.nextLine();

        System.out.print("Enter the name of the book author: ");
        this.authorName = input.nextLine();

        while (true) {
            try {
                System.out.print("Enter the quantity of the books: ");
                this.bookQty = input.nextInt();
                this.bookQtyCopy = this.bookQty;
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid quantity.");
                input.next(); // clear the invalid input
            }
        }

        System.out.println("Book added successfully!\n");
    }
}

class Student {
    String studentName;
    String registrationNumber;
    Book[] borrowedBooks = new Book[3];
    public int booksCount = 0;

    private Scanner input = new Scanner(System.in);

    public Student() {
        System.out.print("Enter the name of the student: ");
        this.studentName = input.nextLine();

        System.out.print("Enter the registration number: ");
        this.registrationNumber = input.nextLine();

        System.out.println("Student registered successfully!\n");
    }
}

class Books {
    private Book[] theBooks = new Book[50];
    private int count = 0;
    private Scanner input = new Scanner(System.in);

    private int compareBookObjects(Book b1, Book b2) {
        if (b1.bookName.equalsIgnoreCase(b2.bookName)) {
            System.out.println("Book with this name already exists.");
            return 0;
        }
        if (b1.serialNo == b2.serialNo) {
            System.out.println("Book with this serial number already exists.");
            return 0;
        }
        return 1;
    }

    public void addBook(Book b) {
        for (int i = 0; i < count; i++) {
            if (compareBookObjects(b, theBooks[i]) == 0)
                return;
        }
        if (count < 50) {
            theBooks[count] = b;
            count++;
            System.out.println("Book added successfully!\n");
        } else {
            System.out.println("No space to add more books.\n");
        }
    }

    public void searchBySerialNo() {
        System.out.println("\n\t\t\t\tSEARCH BY SERIAL NUMBER\n");
        int serialNo = -1;
        while (true) {
            try {
                System.out.print("Enter serial number of the book: ");
                serialNo = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid serial number.");
                input.next(); // clear the invalid input
            }
        }

        int flag = 0;
        System.out.println("S.No\t\tName\t\tAuthor\t\tAvailable quantity\t\tTotal quantity");
        for (int i = 0; i < count; i++) {
            if (serialNo == theBooks[i].serialNo) {
                System.out.println(theBooks[i].serialNo + "\t\t" + theBooks[i].bookName + "\t\t" +
                        theBooks[i].authorName + "\t\t" + theBooks[i].bookQtyCopy + "\t\t" + theBooks[i].bookQty);
                flag++;
                return;
            }
        }
        if (flag == 0)
            System.out.println("No Book with serial number " + serialNo + " found.\n");
    }

    public void searchByAuthorName() {
        System.out.println("\n\t\t\t\tSEARCH BY AUTHOR'S NAME\n");
        input.nextLine(); // consume the newline
        System.out.print("Enter the name of the author: ");
        String authorName = input.nextLine();
        int flag = 0;
        System.out.println("S.No\t\tName\t\tAuthor\t\tAvailable quantity\t\tTotal quantity");
        for (int i = 0; i < count; i++) {
            if (authorName.equalsIgnoreCase(theBooks[i].authorName)) {
                System.out.println(theBooks[i].serialNo + "\t\t" + theBooks[i].bookName + "\t\t" +
                        theBooks[i].authorName + "\t\t" + theBooks[i].bookQtyCopy + "\t\t" + theBooks[i].bookQty);
                flag++;
            }
        }
        if (flag == 0)
            System.out.println("No Book by author " + authorName + " found.\n");
    }

    public void showAllBooks() {
        System.out.println("\n\t\t\t\tSHOWING ALL BOOKS\n");
        System.out.println("S.No\t\tName\t\tAuthor\t\tAvailable quantity\t\tTotal quantity");
        for (int i = 0; i < count; i++) {
            System.out.println(theBooks[i].serialNo + "\t\t" + theBooks[i].bookName + "\t\t" +
                    theBooks[i].authorName + "\t\t" + theBooks[i].bookQtyCopy + "\t\t" + theBooks[i].bookQty);
        }
        System.out.println();
    }

    public void upgradeBookQty() {
        System.out.println("\n\t\t\t\tUPGRADE QUANTITY OF A BOOK\n");
        int serialNo = -1;
        while (true) {
            try {
                System.out.print("Enter the serial number of the book: ");
                serialNo = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid serial number.");
                input.next(); // clear the invalid input
            }
        }

        for (int i = 0; i < count; i++) {
            if (serialNo == theBooks[i].serialNo) {
                while (true) {
                    try {
                        System.out.print("Enter the number of books to be added: ");
                        int addingQty = input.nextInt();
                        theBooks[i].bookQty += addingQty;
                        theBooks[i].bookQtyCopy += addingQty;
                        System.out.println("Book quantity updated successfully!\n");
                        return;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid quantity.");
                        input.next(); // clear the invalid input
                    }
                }
            }
        }
        System.out.println("No book with serial number " + serialNo + " found.\n");
    }

    private int isAvailable(int serialNo) {
        for (int i = 0; i < count; i++) {
            if (serialNo == theBooks[i].serialNo) {
                if (theBooks[i].bookQtyCopy > 0) {
                    System.out.println("Book is available.");
                    return i;
                }
                System.out.println("Book is unavailable.");
                return -1;
            }
        }
        System.out.println("No book with serial number " + serialNo + " available in the library.");
        return -1;
    }

    public Book checkOutBook() {
        int serialNo = -1;
        while (true) {
            try {
                System.out.print("Enter the serial number of the book to be checked out: ");
                serialNo = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid serial number.");
                input.next(); // clear the invalid input
            }
        }

        int bookIndex = isAvailable(serialNo);
        if (bookIndex != -1) {
            theBooks[bookIndex].bookQtyCopy--;
            System.out.println("Book checked out successfully!\n");
            return theBooks[bookIndex];
        }
        System.out.println("Book checkout failed.\n");
        return null;
    }

    public void checkInBook(Book b) {
        for (int i = 0; i < count; i++) {
            if (b.equals(theBooks[i])) {
                theBooks[i].bookQtyCopy++;
                System.out.println("Book checked in successfully!\n");
                return;
            }
        }
        System.out.println("Book check-in failed.\n");
    }
}

class Students {
    private Scanner input = new Scanner(System.in);
    private Student[] theStudents = new Student[50];
    private static int count = 0;

    public void addStudent(Student s) {
        for (int i = 0; i < count; i++) {
            if (s.registrationNumber.equalsIgnoreCase(theStudents[i].registrationNumber)) {
                System.out.println("Student with this registration number already exists.\n");
                return;
            }
        }
        if (count < 50) {
            theStudents[count] = s;
            count++;
            System.out.println("Student added successfully!\n");
        } else {
            System.out.println("No space to add more students.\n");
        }
    }

    public void showAllStudents() {
        System.out.println("\n\t\t\t\tSHOWING ALL STUDENTS\n");
        System.out.println("Student Name\t\tRegistration Number");
        for (int i = 0; i < count; i++) {
            System.out.println(theStudents[i].studentName + "\t\t" + theStudents[i].registrationNumber);
        }
        System.out.println();
    }

    private int isStudent() {
        System.out.print("Enter the registration number: ");
        String registrationNumber = input.nextLine();

        for (int i = 0; i < count; i++) {
            if (theStudents[i].registrationNumber.equalsIgnoreCase(registrationNumber)) {
                return i;
            }
        }
        System.out.println("Student is not registered. Please register first.\n");
        return -1;
    }

    public void checkOutBook(Books books) {
        int studentIndex = isStudent();

        if (studentIndex != -1) {
            System.out.println("Checking out a book...");
            books.showAllBooks();
            Book b = books.checkOutBook();

            if (b != null) {
                if (theStudents[studentIndex].booksCount < 3) {
                    theStudents[studentIndex].borrowedBooks[theStudents[studentIndex].booksCount] = b;
                    theStudents[studentIndex].booksCount++;
                    System.out.println("Book checked out successfully!\n");
                } else {
                    System.out.println("Student cannot borrow more than 3 books.\n");
                }
            } else {
                System.out.println("Book is not available.\n");
            }
        }
    }

    public void checkInBook(Books books) {
        int studentIndex = isStudent();
        if (studentIndex != -1) {
            System.out.println("\nBooks borrowed by the student:");
            System.out.println("S.No\t\tBook Name\t\tAuthor Name");
            Student s = theStudents[studentIndex];
            for (int i = 0; i < s.booksCount; i++) {
                System.out.println(s.borrowedBooks[i].serialNo + "\t\t" + s.borrowedBooks[i].bookName + "\t\t" +
                        s.borrowedBooks[i].authorName);
            }
            int serialNumber = -1;
            while (true) {
                try {
                    System.out.print("Enter the serial number of the book to be checked in: ");
                    serialNumber = input.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid serial number.");
                    input.next(); // clear the invalid input
                }
            }

            for (int i = 0; i < s.booksCount; i++) {
                if (serialNumber == s.borrowedBooks[i].serialNo) {
                    books.checkInBook(s.borrowedBooks[i]);
                    s.borrowedBooks[i] = null;
                    s.booksCount--;
                    System.out.println("Book checked in successfully!\n");
                    return;
                }
            }
            System.out.println("Book with serial number " + serialNumber + " not found.\n");
        }
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Books books = new Books();
        Students students = new Students();

        int choice;

        do {
            System.out.println("\nLibrary System Menu:");
            System.out.println("1. Add student");
            System.out.println("2. Add book");
            System.out.println("3. Search book by serial number");
            System.out.println("4. Search book by author name");
            System.out.println("5. Show all books");
            System.out.println("6. Upgrade quantity of a book");
            System.out.println("7. Check out book");
            System.out.println("8. Check in book");
            System.out.println("9. Show all students");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            while (true) {
                try {
                    choice = input.nextInt();
                    input.nextLine(); // consume the newline
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid choice.");
                    input.next(); // clear the invalid input
                    System.out.print("Enter your choice: ");
                }
            }

            switch (choice) {
                case 1:
                    Student newStudent = new Student();
                    students.addStudent(newStudent);
                    break;

                case 2:
                    Book newBook = new Book();
                    books.addBook(newBook);
                    break;

                case 3:
                    books.searchBySerialNo();
                    break;

                case 4:
                    books.searchByAuthorName();
                    break;

                case 5:
                    books.showAllBooks();
                    break;

                case 6:
                    books.upgradeBookQty();
                    break;

                case 7:
                    students.checkOutBook(books);
                    break;

                case 8:
                    students.checkInBook(books);
                    break;

                case 9:
                    students.showAllStudents();
                    break;

                case 0:
                    System.out.println("Exiting the library system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.\n");
                    break;
            }
        } while (choice != 0);

        input.close();
    }
}
