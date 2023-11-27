import java.sql.Timestamp;

public class Task {
    private Integer id;
    private String title;
    private String context;
    private String status;
    private Timestamp create_date;
    private Timestamp finished_date;

    public Task() {
    }

    public Task(Integer id, String title,
                String context, String status,
                Timestamp create_date,
                Timestamp finished_date) {
        this.id = id;
        this.title = title;
        this.context = context;
        this.status = status;
        this.create_date = create_date;
        this.finished_date = finished_date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Timestamp create_date) {
        this.create_date = create_date;
    }

    public Timestamp getFinished_date() {
        return finished_date;
    }

    public void setFinished_date(Timestamp finished_date) {
        this.finished_date = finished_date;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", context='" + context + '\'' +
                ", status='" + status + '\'' +
                ", create_date=" + create_date +
                ", finished_date=" + finished_date +
                '}';
    }
}
