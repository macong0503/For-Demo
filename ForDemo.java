package com.fs.test;

public class ForDemo {
	public void aMethod(){
		for(int i=0;i<10;i++){
			
			//ÿ��һ��ִ��һ��
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
		//��ѭ��
		for(;;){
			System.out.print("����һ����ѭ��");
		}
	}
	
	//ʹ��forѭ��ʵ��1-10���ۼ�
	public void cMethod(){
		int sum=0;
		for(int i=1;i<=10;i++){
			sum += i;
		}
		System.out.print(sum);
	}
	//����forѭ��
	//ʹ��forѭ��ʵ�־žų˷���
	public void dMethod(){
		int sum=0;
		for(int i=1;i<10;i++){//��ʾ��
			for(int j=1;j<=i;j++){//��ʶ��
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
