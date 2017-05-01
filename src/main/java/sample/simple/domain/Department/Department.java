package sample.simple.domain.Department;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Department {

    @Id
    @Column(name = "code")
    private String code;

    @Column(name = "label")
    private String label;

    @Column(name = "description")
    private String description;

    @Column(name = "last_modified_by")
    private String lastModifiedBy = "SYS";

    @Column(name = "last_modified_timestamp", insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedTimestamp;

    @Column(name = "created_by")
    private String createdBy = "SYS";

    @Column(name = "created_timestamp", insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTimestamp;

    public Department() {
    }

    public Department(Builder builder) {
        this.code = builder.code;
        this.label = builder.label;
        this.description = builder.description;
    }

    public String getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }

    public String getDescription() {
        return description;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public Date getLastModifiedTimestamp() {
        return lastModifiedTimestamp;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    public static class Builder {
        private String code;
        private String label;
        private String description;

        public Builder code(String code) {
            this.code = code;
            return this;
        }

        public Builder label(String label) {
            this.label = label;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Department build() {
            return new Department(this);
        }
    }
}
