package observer.interfacese;

public interface ObjectBeingObserved extends CurrentConditions     {

    void registerCustomer(CurrentConditions cu);
    void deleteCustomer( CurrentConditions cu);
    void customerNotification( CurrentConditions cu);
}
