package enum3;

public enum Week {
	SUNDAY("일"),
	MONDAY("월"),
	TUESDAY("화"),
	WEDNESDAY("수"),
	THURSDAY("목"),
	FRIDAY("금"),
	SATURDAY("토");
	
	private String description;
	private Week(String description) {//이넘타입은 private
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getDescription();
	}
}	
