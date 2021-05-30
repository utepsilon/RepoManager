package com.RepoM.RepositoryManager.Model;

import org.springframework.http.HttpStatus;

public class GenericErrorModel {

	private int Status;
	private String ErrorMessage;
	private long TimeStamp;
	
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	public String getErrorMessage() {
		return ErrorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}
	public long getTimeStamp() {
		return TimeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		TimeStamp = timeStamp;
	}
	public GenericErrorModel(int status, String errorMessage, long timeStamp) {
		super();
		Status = status;
		ErrorMessage = errorMessage;
		TimeStamp = timeStamp;
	}
	public GenericErrorModel() {
		this.Status = HttpStatus.NOT_FOUND.value();
		this.ErrorMessage = "An unexpected error occured. Contact your Administrator";
		this.TimeStamp = System.currentTimeMillis();
	}
	
	
	
}
