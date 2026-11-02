import java.util.Scanner;

class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public char getGender() { return gender; }

    @Override
    public String toString() {
        return name + " (" + gender + "), Email: " + email;
    }
}

class Book {
    private String title;
    private double price;
    private Author author;

    public Book(String title, double price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: " + title + "\nPrice: " + (int)price + "\nAuthor: " + author.toString();
    }
}

public class BookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] p = line.split(",");

        String title = p[0].trim();
        double price = Double.parseDouble(p[1].trim());
        String aName = p[2].trim();
        String aEmail = p[3].trim();
        char gender = p[4].trim().charAt(0);

        Author a = new Author(aName, aEmail, gender);
        Book b = new Book(title, price, a);

        System.out.println(b);
    }
}