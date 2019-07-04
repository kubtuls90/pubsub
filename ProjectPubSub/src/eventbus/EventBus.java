/**
 * 
 */
package eventbus;

/**
 * @author Tkuber
 *
 */
public interface EventBus {

    // Object
    void publishEvent(Object o);

    // Denote Subscriber
    void addSubscriber(Subscriber jazz);

    //To allow or not to allow clients the ability to filter events received?
    //void addSubscriberForFilteredEvents(Event event, Subscriber sub);
    
    void removeSubscriber(Subscriber sub);
}
