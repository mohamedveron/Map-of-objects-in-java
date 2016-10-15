
public class Comment {
 private int id;
 public String body;
public Comment(int id, String body) {
	super();
	this.id = id;
	this.body = body;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBody() {
	return body;
}
public void setBody(String body) {
	this.body = body;
}
}
