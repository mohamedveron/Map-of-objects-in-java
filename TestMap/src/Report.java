
public class Report {
private int id;
private Comment comment;
private Type type;

public Report(int id, Comment comment,Type type) {
	super();
	this.id = id;
	this.comment = comment;
	this.type = type;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Comment getComment() {
	return comment;
}
public void setComment(Comment comment) {
	this.comment = comment;
}
public Type getType() {
	return type;
}
public void setType(Type type) {
	this.type = type;
}
@Override
public String toString() {
	return "Report [id=" + id + ", comment=" + comment + ", type=" + type + "]";
}
@Override
public int hashCode(){
	int hashcode = 0;
    hashcode = type.getId()*20;
    hashcode += comment.getBody().hashCode();
    return hashcode;
}

@Override
public boolean equals(Object obj){
	if (obj instanceof Report) {
		Report pp = (Report) obj;
        return (pp.getComment().getBody().equals(this.comment.getBody()) && pp.type.getId() == this.type.getId());
    } else {
        return false;
    }
}
}
