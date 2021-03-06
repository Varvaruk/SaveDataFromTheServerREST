package com.gmail.v.varvaruk89.saveDataFromTheServerREST.entities;

import com.fasterxml.jackson.annotation.JsonRootName;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;


@Entity
@JsonRootName("data")
public class GroupMyData implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @OneToMany(mappedBy = "groupMyData", fetch = FetchType.EAGER)
    private List<MyData> data;

    public GroupMyData() {
    }

    public GroupMyData(List<MyData> data) {
        this.data = data;
    }

    public List<MyData> getData() {
        return data;
    }

    public void setData(List<MyData> data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "GroupMyData{" +
                "id=" + id +
                ", data=" + data +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GroupMyData)) return false;
        GroupMyData that = (GroupMyData) o;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getData(), that.getData());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getData());
    }
}
