package com.thomsonreuters.ce.jmx;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.ObjectName;

/*
�����Զ��������������ǰ���Ǳ���������������ʱ����jmx�Ŀ�Զ���������ã�
��������IP���˿ڡ���Ȩ�ȣ�ʾ��������ʾ�� 
-Djava.rmi.server.hostname=192.168.0.88 
-Dcom.sun.management.jmxremote  
-Dcom.sun.management.jmxremote.port=8888  
-Dcom.sun.management.jmxremote.authenticate=false 
-Dcom.sun.management.jmxremote.ssl=false 
*/
public class SystemConfigManagement {
	
	private static final int DEFAULT_NO_THREADS=10;
	private static final String DEFAULT_SCHEMA = "default";

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		MBeanServer mbs=ManagementFactory.getPlatformMBeanServer();
		SystemConfig mBean=new SystemConfig(DEFAULT_NO_THREADS,DEFAULT_SCHEMA);
		
		ObjectName name=new ObjectName("xman:type=SystemConfig");
		
		mbs.registerMBean(mBean, name);
		
		do
		{
			
			Thread.sleep(3000);
			
			System.out.println("Thread Count=" + mBean.getThreadCount()+":::Schema Name="+ mBean.getSchemaName());
			
		}while (mBean.getThreadCount()!=0);
		
	}

}
