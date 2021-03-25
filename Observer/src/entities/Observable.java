package entities;

public interface Observable {
	void subscribe(Observer observer);

	void remove(Observer observer);

	void sendNotification();
}
