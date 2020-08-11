package com.Util;

public class Resource {
    String postAPI="api/insert.php";
    String putAPI="api/update.php";
    String getAPI="api/read.php";
	String deleteAPI="api/delete.php";

    public String getPostAPI() {
		return postAPI;
	}
	public void setPostAPI(String postAPI) {
		this.postAPI = postAPI;
	}
	public String getPutAPI() {
		return putAPI;
	}
	public void setPutAPI(String putAPI) {
		this.putAPI = putAPI;
	}
	public String getGetAPI() {
		return getAPI;
	}
	public void setGetAPI(String getAPI) {
		this.getAPI = getAPI;
	}
	public String getDeleteAPI() {
		return deleteAPI;
	}
	public void setDeleteAPI(String deleteAPI) {
		this.deleteAPI = deleteAPI;
	}
}
