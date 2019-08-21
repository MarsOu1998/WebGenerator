package MySQL;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user2", schema = "letterwish", catalog = "")
public class User2Entity {
    private int account;
    private String password;
    private String name;

    @Id
    @Column(name = "account")
    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User2Entity that = (User2Entity) o;
        return account == that.account &&
                Objects.equals(password, that.password) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account, password, name);
    }
}
