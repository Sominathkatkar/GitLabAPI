package com.sacumen.model;


public class Project {

	private Integer id;
	private String name;
	private String description;
	private String name_with_namespace;
	private String path;
	private String path_with_namespace;
	private String created_at;
	private String default_branch;
	private String[] tag_list;
	private String[] topics;
	private String ssh_url_to_repo;
	private String http_url_to_repo;
	private String web_url;
	private String readme_url;
	private String avatar_url;
	private Integer forks_count;
	private Integer star_count;
	private String last_activity_at;
	private Namespace namespace;
	public Project() {
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName_with_namespace() {
		return name_with_namespace;
	}
	public void setName_with_namespace(String name_with_namespace) {
		this.name_with_namespace = name_with_namespace;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getPath_with_namespace() {
		return path_with_namespace;
	}
	public void setPath_with_namespace(String path_with_namespace) {
		this.path_with_namespace = path_with_namespace;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getDefault_branch() {
		return default_branch;
	}
	public void setDefault_branch(String default_branch) {
		this.default_branch = default_branch;
	}
	public String[] getTag_list() {
		return tag_list;
	}
	public void setTag_list(String[] tag_list) {
		this.tag_list = tag_list;
	}
	public String[] getTopics() {
		return topics;
	}
	public void setTopics(String[] topics) {
		this.topics = topics;
	}
	public String getSsh_url_to_repo() {
		return ssh_url_to_repo;
	}
	public void setSsh_url_to_repo(String ssh_url_to_repo) {
		this.ssh_url_to_repo = ssh_url_to_repo;
	}
	public String getHttp_url_to_repo() {
		return http_url_to_repo;
	}
	public void setHttp_url_to_repo(String http_url_to_repo) {
		this.http_url_to_repo = http_url_to_repo;
	}
	public String getWeb_url() {
		return web_url;
	}
	public void setWeb_url(String web_url) {
		this.web_url = web_url;
	}
	public String getReadme_url() {
		return readme_url;
	}
	public void setReadme_url(String readme_url) {
		this.readme_url = readme_url;
	}
	public String getAvatar_url() {
		return avatar_url;
	}
	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}
	public Integer getForks_count() {
		return forks_count;
	}
	public void setForks_count(Integer forks_count) {
		this.forks_count = forks_count;
	}
	public Integer getStar_count() {
		return star_count;
	}
	public void setStar_count(Integer star_count) {
		this.star_count = star_count;
	}
	public String getLast_activity_at() {
		return last_activity_at;
	}
	public void setLast_activity_at(String last_activity_at) {
		this.last_activity_at = last_activity_at;
	}
	public Namespace getNamespace() {
		return namespace;
	}
	public void setNamespace(Namespace namespace) {
		this.namespace = namespace;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", description=" + description + ", name_with_namespace="
				+ name_with_namespace + ", path=" + path + ", path_with_namespace=" + path_with_namespace
				+ ", created_at=" + created_at + ", default_branch=" + default_branch + ", tag_list=" + tag_list
				+ ", topics=" + topics + ", ssh_url_to_repo=" + ssh_url_to_repo + ", http_url_to_repo="
				+ http_url_to_repo + ", web_url=" + web_url + ", readme_url=" + readme_url + ", avatar_url="
				+ avatar_url + ", forks_count=" + forks_count + ", star_count=" + star_count + ", last_activity_at="
				+ last_activity_at + ", namespace=" + namespace + "]";
	}
	
	
	
}
