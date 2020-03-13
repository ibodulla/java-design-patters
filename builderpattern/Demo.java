package design.patterns.builderpattern;

/**
 * Ibodulla Ibodullaev created on 3/10/2020 inside the package - design.patterns.builderpattern
 */
public class Demo {

    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount
                .BankAccountBuilder("Ibodulla", "556414813")
                .withEmail("ibodulla.94i@gmail.com")
                .wantNewsletter(true)
                .build();

        System.out.println(newAccount.getName());
        System.out.println(newAccount.isNewsletter());
        StringBuilder sb = new StringBuilder("asdasdas").append("asdas");


    }
}
