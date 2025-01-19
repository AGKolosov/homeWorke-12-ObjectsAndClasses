
public class Main {
    public static void main(String[] args) {
        Author authorOne = new Author("Сергей", "Лукьяненко");
        Author authorTwo = new Author("Дмитрий", "Глуховский");
        Book bookOne = new Book(authorOne, "Ночной Дозор", 1998);
        Book bookTwo = new Book(authorTwo, "Метро 2033", 2005);
        System.out.println("Книга первая: " + bookOne);
        System.out.println("Книга вторая: " + bookTwo);
        bookTwo.setPublicationYear(2007);
        System.out.println("Переиздание книги: " + bookTwo);
    }
}