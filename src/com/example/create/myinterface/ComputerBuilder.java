package com.example.create.myinterface;

public interface ComputerBuilder {
	public void buildCpu();

	public void buildRam();

	public void buildHardDisk();

	public void builGraphicCard();

	public void buildMonitor();

	public void buildOs();

	public Computer getResult();
}
