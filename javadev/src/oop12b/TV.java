package oop12b;

public interface TV {
	public abstract void powerOn() ;
	public abstract void powerOff() ;
	public abstract void channelUp();
	public abstract void channelDown() ;
	public abstract void soundUp();
	public abstract void soundDown() ;

	public default void channelTable() {}
}
