public class Main {

    public static void main(String[] args) {
        ObjectObserved objectObserved = new ObjectObserved();
        objectObserved.addRecord("Test rec #1");
        objectObserved.addRecord("Test rec #2");

        Observer firstSubscriber = new Subscribers("Name #1");
        Observer secondSubscriber = new Subscribers("Name #2");

        objectObserved.addObserver(firstSubscriber);
        objectObserved.addObserver(secondSubscriber);

        objectObserved.addRecord("New record #3");
        objectObserved.addRecord("New record #4");
        objectObserved.removeRecord("Test rec #2");

        Observer thirdSubscribes = new Subscribers("Name #3");
        objectObserved.addObserver(thirdSubscribes);

        objectObserved.addRecord("New record #5");
    }
}
