public class AccountWorker implements Runnable {
    BankAccount ba;
    HighVolumeAccount hva;

    public AccountWorker(BankAccount ba, HighVolumeAccount hva) {
        this.ba = ba;
        this.hva = hva;
    }

    public AccountWorker(BankAccount ba) {
        this.ba = ba;
    }

    public AccountWorker(HighVolumeAccount hva) {
        this.hva = hva;
    }

    public void doWork(){
        Thread t = new Thread(hva != null ? hva : this);
        t.start();
    }

    @Override
    public void run() {
        char txType = 'A';// read tx type
        int amt = 0;// read tx amount
        if(txType == 'w')
            ba.withdrawal(amt);
        else
            ba.deposit(amt);
    }
}
