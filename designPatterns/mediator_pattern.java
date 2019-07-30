// Java code to illustrate Mediator Pattern
// 
// All public class codes should be put in 
// different files.

public interface Mediator {
    // The mediator interface
    public void addBuyer(Buyer buyer);
    public void findHighestBidder();
}

public class AuctionMediator implements Mediator {
    // this class implements the interface and holds
    // all the buyers in a Array list.
    // We can add buyers and find the highest bidder
    private ArrayList buyers;

    public AuctionMediator() {
        buyers = new ArrayList<>();
    }

    @Override
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer) {
            if (b.price > buyers) {
                maxBid = b.price;
                winner = b;
            }
        }
        System.out.println("The auction winner is " + winner.name +
        ". He paid " +winnder.price + "$ for the item.");
    }
}

public abstract class Buyer {
    // this class holds the buyer
    protected Mediator mediator;
    protected String name;
    protected int price;

    public Buyer(Mediator med, String name) {
        this.mediator = med;
        this.name = name;
    }

    public abstract void bid(int price);
    public abstract void cancelTheBid();
}

public class AuctionBuyer extends Buyer {
    // implementation of the bidding process
    // There is an option to bid and an option
    // to cancel the bidding
    public AuctionBuyer(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void bid(int price) {
        this.price = price;
    }

    @Override
    public void cancelTheBid() {
        this.price = -1;
    }
}

public class Main {
    /* 
    This program illitrates an auction. The AuctionMediator
    is responsible for adding the buyers, and after each
    buyer bid a certain amount for the item, the mediator
    know who won the auction.
    */
    public static void main(String[] args) {
        AuctionMediator med = new AuctionMediator();
        Buyer b1 = new AuctionBuyer(med, "Tal Baum");
        Buyer b2 = new AuctionBuyer(med, "Joe Smith");
        Buyer b3 = new AuctionBuyer(med, "John Smith");

        // Crate and add buyers
        med.addBuyer(b1);
        med.addBuyer(b2);
        med.addBuyer(b3);

        System.out.println("Welcome to the auction. Tonight" +
                            "we are selling a vacation to Vegas." +
                            " please bid your offers.");
        System.out.println("-----------------------------");
        System.out.println("Waiting for the buyer's offers...");

        // Making bids
        b1.bid(1800);
        b2.bid(2000);
        b3.bid(780);
        System.out.println("-----------------------------");

        med.findHighestBidder();

        b2.cancelTheBid();
        System.out.println(b2.name + " Has cancelled his bid!, in that case");
        med.findHighestBidder();

    }
}