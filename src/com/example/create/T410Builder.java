package com.example.create;

import com.example.create.myinterface.Computer;
import com.example.create.myinterface.ComputerBuilder;

public class T410Builder implements ComputerBuilder {
	private T410 computer = new T410();

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
