package com.fs.test;

public class ForDemo {
	public void aMethod(){
		for(int i=0;i<10;i++){
			
			//每隔一秒执行一次
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(i);
		}
	}
	public void bMethod(){
		//死循环
		for(;;){
			System.out.print("这是一个死循环");
		}
	}
	
	//使用for循环实现1-10的累加
	public void cMethod(){
		int sum=0;
		for(int i=1;i<=10;i++){
			sum += i;
		}
		System.out.print(sum);
	}
	//多重for循环
	//使用for循环实现九九乘法表
	public void dMethod(){
		int sum=0;
		for(int i=1;i<10;i++){//表示行
			for(int j=1;j<=i;j++){//标识列
				sum=i*j;
				System.out.print(i + "*" + j +"=" +sum+ "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		ForDemo fd = new ForDemo();
		fd.dMethod();

	}

}
