package com.yutongjiaoyu.zhuangwei.domain;

public class Page {
	
	private int currrentPage;//��ǰҳ
	private int pageSize;//һҳ��ʾ������¼
	private int totalRow;//�м�¼��
	private int totalPage;//�ܹ��м�ҳ
	
	public int getCurrrentPage() {
		return currrentPage;
	}
	public void setCurrrentPage(int currrentPage) {
		this.currrentPage = currrentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalRow() {
		return totalRow;
	}
	public void setTotalRow(int totalRow) {
		this.totalRow = totalRow;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	

}
