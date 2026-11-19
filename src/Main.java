public class Main {
    public static void main(String[] args) {
        Account account = new Account("Caleb", 1000, "PL12345678901234567890123456");

        try {
            System.out.println("Balance before transfer: " + account.getBalance());
            account.transfer(1500);
            System.out.println("This line is not reached.");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Transfer failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e);
        } finally {
            System.out.println("Current balance: " + account.getBalance());
        }
    }
}