public final class HighVolumeAccount extends BankAccount implements Runnable {
    public HighVolumeAccount(String id, int balance) {
        super(id, balance);
    }

    private void readDailyDeposits() {}
    private void readDailyWithdrawals() {}
    public void run() {}
// other members elided
}