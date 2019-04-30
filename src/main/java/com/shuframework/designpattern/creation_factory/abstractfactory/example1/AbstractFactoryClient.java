package com.shuframework.designpattern.creation_factory.abstractfactory.example1;

public class AbstractFactoryClient {

	// 缺点是 组件之间没考虑兼容性
	public static void main(String[] args) {
		//创建装机工程师对象
		ComputerEngineer engineer = new ComputerEngineer();

		//这样就能组装另一种电脑了
		engineer.makeComputer(1,1);
		System.out.println("==========");
		//第2种电脑 兼容性不行，即不合格的产品
		engineer.makeComputer(1,2);
	}

}
