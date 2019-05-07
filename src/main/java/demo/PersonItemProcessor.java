package demo;

import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(Person person) throws Exception {
        final String firstName = person.getFirstName().toUpperCase();
        final String lastName = person.getLastName().toUpperCase();

        final Person updatedPerson = new Person(firstName, lastName);

        log.info("Converting (" + person + ") into (" + updatedPerson + ")");

        return updatedPerson;
    }
}
