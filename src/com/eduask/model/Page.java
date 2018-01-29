package com.eduask.model;

public class Page {
	private int start;
	
	private int pageCount;
	
	private int end;
	
	private int pageNow;
	
	private int showPage;

	public int getStart() {
		start=(pageNow-1)*showPage;
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getPageNow() {
		
		return pageNow;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}

	public int getShowPage() {
		return showPage;
	}

	public void setShowPage(int showPage) {
		this.showPage = showPage;
	}

	@Override
	public String toString() {
		return "Page [start=" + start + ", pageCount=" + pageCount + ", end="
				+ end + ", pageNow=" + pageNow + ", showPage=" + showPage + "]";
	}


}
