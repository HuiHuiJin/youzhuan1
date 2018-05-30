package com.yutongjiaoyu.zhuangwei.domain;

public class Page {
	
	private int currrentPage;//当前页
	private int pageSize;//一页显示几条记录
	private int totalRow;//行记录数
	private int totalPage;//总共有几页
	
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
