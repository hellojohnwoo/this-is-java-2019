package chap14lamda.sec05.O6;

import java.util.function.Consumer;

public class ConsumerAndThenEx {
    public static void main(String[] args) {
        Consumer<Member> consumerMName = (m) -> {
            System.out.println("Consumer Member : " + m.getName());
        };

        Consumer<Member> consumerMId = (m) -> {
            System.out.println("Consumer Id : " + m.getId());
        };

        Consumer<Member> consumerMNameId = consumerMName.andThen(consumerMId);
        consumerMNameId.accept( new Member("Janny", "JJ77", null) );
    }
}

