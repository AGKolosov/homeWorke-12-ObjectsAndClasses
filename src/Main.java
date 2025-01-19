
public class Main {
    public static void main(String[] args) {
        Author authorOne = new Author("Сергей", "Лукьяненко");
        Author authorTwo = new Author("Дмитрий", "Глуховский");
        Book bookOne = new Book(authorOne, "Ночной Дозор", 1998);
        Book bookTwo = new Book(authorTwo, "Метро 2033", 2005);
        System.out.println("Книга первая: " + bookOne.getTitle() + " от " + bookOne.getAuthor().getFirstName() + " " + bookOne.getAuthor().getLastName() + ", опубликована в " + bookOne.getPublicationYear());
        System.out.println("Книга вторая: " + bookTwo.getTitle() + " от " + bookTwo.getAuthor().getFirstName() + " " + bookTwo.getAuthor().getLastName() + ", опубликована в " + bookTwo.getPublicationYear());
        bookTwo.setPublicationYear(2007);
        System.out.println("Книга вторая: " + bookTwo.getTitle() + " от " + bookTwo.getAuthor().getFirstName() + " " + bookTwo.getAuthor().getLastName() + ", переиздана в " + bookTwo.getPublicationYear());
    }
}