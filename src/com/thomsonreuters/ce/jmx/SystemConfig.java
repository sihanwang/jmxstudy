package com.thomsonreuters.ce.jmx;

public class SystemConfig implements SystemConfigMBean {
	
	private int threadCount;
	private String schemaName;

	
	public SystemConfig(int numThreads, String schema)
	{
		this.threadCount=numThreads;
		this.schemaName=schema;
	}
	
	@Override
	public void setThreadCount(int noOfThreads) {
		// TODO Auto-generated method stub
		this.threadCount=noOfThreads;
	}

	@Override
	public int getThreadCount() {
		// TODO Auto-generated method stub
		return this.threadCount;
	}

	@Override
	public void setSchemaName(String schemaName) {
		// TODO Auto-generated method stub
		this.schemaName=schemaName;
	}

	@Override
	public String getSchemaName() {
		// TODO Auto-generated method stub
		return this.schemaName;
	}

	@Override
	public String doConfig() {
		// TODO Auto-generated method stub
		return "No of Threads="+this.threadCount + " and DB Schema Name="+this.schemaName;
	}

}
