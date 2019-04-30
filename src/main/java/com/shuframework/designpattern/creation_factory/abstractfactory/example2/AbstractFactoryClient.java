package com.shuframework.designpattern.creation_factory.abstractfactory.example2;

public class AbstractFactoryClient {

	// 比example1 的优点是 computerA、computerB是调试过的，兼容性没问题
	public static void main(String[] args) {
		//创建装机工程师对象
		ComputerEngineer engineer = new ComputerEngineer();
		//第1种电脑
		AbstractFactory computerA = new ComputerA();
		engineer.makeComputer(computerA);
		System.out.println("==========");
		//第2种电脑
		AbstractFactory computerB = new ComputerB();
		engineer.makeComputer(computerB);
	}

}
