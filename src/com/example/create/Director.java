package com.example.create;

import com.example.create.myinterface.ComputerBuilder;

public class Director {
	ComputerBuilder builder;

	public T410 buildT410() {
		builder = new T410Builder();
		builder.buildCpu();
		builder.buildHardDisk();
		builder.buildMonitor();
		builder.buildOs();
		builder.buildRam();
		builder.builGraphicCard();
		return (T410) builder.getResult();
	}

	public T210 buildT210() {
		builder = new T210Builder();
		builder.buildCpu();
		builder.buildHardDisk();
		builder.buildMonitor();
		builder.buildOs();
		builder.buildRam();
		builder.builGraphicCard();
		return (T210) builder.getResult();
	}
}
