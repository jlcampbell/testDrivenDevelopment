package jess;

public class Money {
    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    protected int amount;

    Money times( int multiplier ){
        return new Money(amount * multiplier, currency);
    };

    public String toString() {
        return amount + " " + currency;
    }

    // factory means we are generating subclasses here
    // but not implementing them
    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount
            && currency().equals(money.currency());
    }

    // abstract means that we are not defining implementation here
    protected String currency;

    String currency() {
        return currency;
    };
}