package com.kh.java.common.vo;

import java.sql.Date;

public class Attachment {

	private Long fileNo;
	private Long refBno;
	private String originName;
	private String changename;
	private String filePath;
	private Date uploadDate;
	private int fileLevel;
	private String status;
	
	
	public Attachment() {
		super();
	}


	public Attachment(Long fileNo, Long refBno, String originName, String changename, String filePath, Date uploadDate,
			int fileLevel, String status) {
		super();
		this.fileNo = fileNo;
		this.refBno = refBno;
		this.originName = originName;
		this.changename = changename;
		this.filePath = filePath;
		this.uploadDate = uploadDate;
		this.fileLevel = fileLevel;
		this.status = status;
	}


	public Long getFileNo() {
		return fileNo;
	}


	public void setFileNo(Long fileNo) {
		this.fileNo = fileNo;
	}


	public Long getRefBno() {
		return refBno;
	}


	public void setRefBno(Long refBno) {
		this.refBno = refBno;
	}


	public String getOriginName() {
		return originName;
	}


	public void setOriginName(String originName) {
		this.originName = originName;
	}


	public String getChangename() {
		return changename;
	}


	public void setChangename(String changename) {
		this.changename = changename;
	}


	public String getFilePath() {
		return filePath;
	}


	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}


	public Date getUploadDate() {
		return uploadDate;
	}


	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}


	public int getFileLevel() {
		return fileLevel;
	}


	public void setFileLevel(int fileLevel) {
		this.fileLevel = fileLevel;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Attachment [fileNo=" + fileNo + ", refBno=" + refBno + ", originName=" + originName + ", changename="
				+ changename + ", filePath=" + filePath + ", uploadDate=" + uploadDate + ", fileLevel=" + fileLevel
				+ ", status=" + status + "]";
	}
	
	
}
