package com.example.create;

import com.example.create.myinterface.Computer;
import com.example.create.myinterface.ComputerBuilder;

public class T210Builder implements ComputerBuilder {
	private T210 computer = new T210();

	@Override
	public void buildCpu() {

	}

	@Override
	public void buildRam() {

	}

	@Override
	public void buildHardDisk() {

	}

	@Override
	public void builGraphicCard() {

	}

	@Override
	public void buildMonitor() {

	}

	@Override
	public void buildOs() {

	}

	@Override
	public Computer getResult() {
		return computer;
	}

}
