package myPROJECTS.observer.interfacese;


public interface Subject_Obserwowany extends Customer {

    void registerCustomer(Customer cu);
    void deleteCustomer( Customer cu);
    void customerNotification( );
}
