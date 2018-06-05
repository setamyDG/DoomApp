/*
    Biblioteka do wykonywania czynności w określonym interwale.
    Można zainicjować interwał na początku jak poniżej:

    Timer example = new Timer(1000);
    example.checkTick(){

    }

    albo w następujący sposób, przy czym ta konstrukcja podmienia interwał na ten, który znajduje się w parametrze:

    Timer example = new Timer();
    example.checkTick(1000){

    }

    Oprócz checkTick, który zwyczajnie zwraca true, gdy okrążenie dobiegło końca, są jeszcze dwie bliźniacze metody: checkTickOnce oraz checkTickWithFirst.

    checkTickOnce - zwraca true tylko raz, po czym przestaje działać, więc jest to wykonanie metody z opóźnieniem
    checkTickWithFirst - to samo co checkTick, jednak zwraca true również przy pierwszym sprawdzeniu
    checkTickRandom - zwykły checkTick, lecz przy zwróceniu true zmienia losowo interwał zgodnie z wahaniem, jakie podajemy w parametrze. Dla przykładu, jeżeli parametrem będzie 0.1f a interwał jest ustawiony na 1000, kolejne zwrócenie true odbędzie się w odstępie 900-1100 milisekund.
 */

package library;


public class Timer {
	public long interval = 0L, elapsedTime = 0L;
	private long intervalRandom = 0L, timeStartInit = 0L, timeStart = 0L;
	private long currentTime = 0L, lastTime = 0L;
	private boolean forceFirstTime, firstTimeExpired;
	private boolean waitingForNewFeed = true;


	public Timer(long interval) {
		this.interval = interval;
		this.intervalRandom = interval;
		this.timeStartInit = System.currentTimeMillis();
	}


	public boolean checkTick() {
		return check();
	}


	public boolean checkTick(long interval) {
		return check();
	}


	public boolean checkTickOnce() {
		return !firstTimeExpired && check();
	}


	public boolean checkTickWithFirst() {
		if (!forceFirstTime) {
			forceFirstTime = true;
			return true;
		}
		return check();
	}


	private boolean check() {
		elapsedTime = System.currentTimeMillis() - timeStartInit;
		if (timeStart == 0L)
			timeStart = timeStartInit;
		if (currentTime == 0L)
			currentTime = timeStart;
		else currentTime += System.currentTimeMillis() - lastTime;

		if (currentTime > timeStart + interval) {
			if (!firstTimeExpired)
				firstTimeExpired = true;

			timeStart = currentTime;
			lastTime = System.currentTimeMillis();
			timeStartInit = lastTime;
			return true;
		}
		lastTime = System.currentTimeMillis();
		return false;
	}
}
