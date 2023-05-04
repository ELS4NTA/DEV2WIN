package com.dev2win.iniciativas.data.ideas;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.dev2win.iniciativas.data.users.User;

@Entity
public class Initiative {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long initiativeId;
    private String description;
    @Column(name = "registration_date")
    private LocalDate date;
    private String state;
    private String keyword1;
    private String keyword2;
    private String keyword3;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Initiative(String description, State state, String keyword1, String keyword2, String keyword3, User user) {
        this.description = description;
        this.state = state.getValue();
        this.date = LocalDate.now();
        this.keyword1 = keyword1;
        this.keyword2 = keyword2;
        this.keyword3 = keyword3;
        this.user = user;
    }

    public Initiative() {

    }

    public Long getInitiativeId() {
        return initiativeId;
    }

    public void setInitiativeId(Long initiativeId) {
        this.initiativeId = initiativeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getKeyword1() {
        return keyword1;
    }

    public void setKeyword1(String keyword1) {
        this.keyword1 = keyword1;
    }

    public String getKeyword2() {
        return keyword2;
    }

    public void setKeyword2(String keyword2) {
        this.keyword2 = keyword2;
    }

    public String getKeyword3() {
        return keyword3;
    }

    public void setKeyword3(String keyword3) {
        this.keyword3 = keyword3;
    }

    public String getKeywords() {
        return keyword1 + "; " + keyword2 + "; " + keyword3;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((initiativeId == null) ? 0 : initiativeId.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((state == null) ? 0 : state.hashCode());
        result = prime * result + ((keyword1 == null) ? 0 : keyword1.hashCode());
        result = prime * result + ((keyword2 == null) ? 0 : keyword2.hashCode());
        result = prime * result + ((keyword3 == null) ? 0 : keyword3.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Initiative other = (Initiative) obj;
        if (initiativeId == null) {
            if (other.initiativeId != null)
                return false;
        } else if (!initiativeId.equals(other.initiativeId))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        if (state == null) {
            if (other.state != null)
                return false;
        } else if (!state.equals(other.state))
            return false;
        if (keyword1 == null) {
            if (other.keyword1 != null)
                return false;
        } else if (!keyword1.equals(other.keyword1))
            return false;
        if (keyword2 == null) {
            if (other.keyword2 != null)
                return false;
        } else if (!keyword2.equals(other.keyword2))
            return false;
        if (keyword3 == null) {
            if (other.keyword3 != null)
                return false;
        } else if (!keyword3.equals(other.keyword3))
            return false;
        return true;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Initiative [initiativeId = " + initiativeId + ", description = " + description + ", date = " + date
                + ", state = "
                + state + ", keyword1 = " + keyword1 + ", keyword2 = " + keyword2 + ", keyword3 = " + keyword3
                + ", user = "
                + user
                + "]";
    }
}