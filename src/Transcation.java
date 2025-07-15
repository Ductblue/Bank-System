package src;

import java.io.Serializable;
import java.time.LocalDate;

public class Transcation implements Comparable<Transcation>, Serializable {

    private static int next = 1;
    int trsNo;
    Account acc;
    LocalDate date;
    char operation;
    double amount;

    public Transcation(Account acc, LocalDate date, char operation, double amount) {
        this.acc = acc;
        this.date = date;
        this.operation = operation;
        this.amount = amount;
        trsNo = next++;
    }

    @Override
    public int compareTo(Transcation o) {
        return this.trsNo - o.trsNo;
    }

    @Override
    public String toString() {
        return "Transcation{" +
                "trsNo=" + trsNo +
                ", acc=" + acc +
                ", date=" + date +
                ", operation=" + operation +
                ", amount=" + amount +
                '}';
    }

    public int getTrsNo() {
        return trsNo;
    }

    public Account getAcc() {
        return acc;
    }

    public LocalDate getDate() {
        return date;
    }

    public char getOperation() {
        return operation;
    }

    public double getAmount() {
        return amount;
    }
}
