package com.sacumen.model;

public class Namespace {
	private Integer id;
	private String name;
	private String path;
	private String kind;
	private String full_path;
	private Integer parent_id;
	private String navatar_urlame;
	private String web_url;

	public Namespace() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getFull_path() {
		return full_path;
	}

	public void setFull_path(String full_path) {
		this.full_path = full_path;
	}

	public Integer getParent_id() {
		return parent_id;
	}

	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}

	public String getNavatar_urlame() {
		return navatar_urlame;
	}

	public void setNavatar_urlame(String navatar_urlame) {
		this.navatar_urlame = navatar_urlame;
	}

	public String getWeb_url() {
		return web_url;
	}

	public void setWeb_url(String web_url) {
		this.web_url = web_url;
	}

	@Override
	public String toString() {
		return "Namespace [id=" + id + ", name=" + name + ", path=" + path + ", kind=" + kind + ", full_path="
				+ full_path + ", parent_id=" + parent_id + ", navatar_urlame=" + navatar_urlame + ", web_url=" + web_url
				+ "]";
	}

}
