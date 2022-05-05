package de.comcave.fahrzeugrennen;

/**
 * 
 * Ambulance 80 Km/h
 * 
 * -> Bluelight true 120 Km/h
 * 
 *
 * Es soll noch eine "drive(int minutes)" Methode erstellt werden, wo die Zeit
 * in Minuten mitgegeben wird, welche die Ambulance sich fortbewegen soll.
 *
 */
public class Ambulance {

	private static final int MAXSPEED_WITHOUT_BLUELIGHT = 80;
	private static final int MAXSPEED_WITH_BLUELIGHT = 120;

	private int maxSpeed = MAXSPEED_WITHOUT_BLUELIGHT;
	private int currentSpeed;

	/**
	 * Der aktuelle abstand zum Depot
	 */
	private int currentPosition;
	private boolean bluelight;

	public int getMaxSpeed() {
		return maxSpeed;
	}

	private void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public int getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(int currentPosition) {
		this.currentPosition = currentPosition;
	}

	public boolean isBluelight() {
		return bluelight;
	}

	public void setBluelight(boolean bluelight) {
		this.bluelight = bluelight;
	}

	public Ambulance() {
		this(0, 0, false);
	}

	public void setCurrentSpeed(int currentSpeed) {
		if (currentSpeed > maxSpeed) {
			this.currentSpeed = maxSpeed;
		} else {
			this.currentSpeed = currentSpeed;
		}
	}
	
	public Ambulance(int currentSpeed, int currentPostion, boolean bluelight) {
		this.setBluelight(bluelight);
		if (this.isBluelight()) {
			this.setMaxSpeed(Ambulance.MAXSPEED_WITH_BLUELIGHT);
		} else {
			this.setMaxSpeed(Ambulance.MAXSPEED_WITHOUT_BLUELIGHT);
		}
		this.setCurrentSpeed(currentSpeed);
		this.setCurrentPosition(currentPostion);
	}

	@Override
	public String toString() {
		return "Ambulance [getMaxSpeed()=" + this.getMaxSpeed()
				+ ", getCurrentSpeed()=" + this.getCurrentSpeed()
				+ ", getCurrentPosition()=" + this.getCurrentPosition()
				+ ", isBluelight()=" + this.isBluelight() + "]";
	}

	/**
	 * Der Krankenwagen soll sich mit der "currentSpeed" fortbewegen und damit
	 * verändert sich "currentPosition";
	 * 
	 * 
	 */
	public void drive(int minute) {
		/**
		 * currentSpeed Km/h -> 60
		 * 
		 * Minute -> 60
		 * 
		 * Ergibt sich als currentPosition = 60
		 */

		this.setCurrentPosition((int)(this.getCurrentPosition()
				+ (this.getCurrentSpeed() / 60F) * minute));
	}

}
