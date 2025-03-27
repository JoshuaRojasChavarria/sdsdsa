/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.unaplanilla.model;

import java.time.LocalDate;
import java.util.Objects;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


/**
 *
 * @author devcr
 */
public class EmployeeDto {

    private StringProperty id;
    private StringProperty Name;
    private StringProperty lastName1;
    private StringProperty lastName2;
    private StringProperty nationalId;
    private StringProperty gender;
    private StringProperty email;
    private BooleanProperty isAdmin;
    private StringProperty username;
    private StringProperty password;
    private ObjectProperty entryDate;
    private ObjectProperty exitDate;
    private BooleanProperty isActive;
    private Long version;
    private Boolean modified;

    public EmployeeDto() {
        this.id = new SimpleStringProperty("");
        this.Name = new SimpleStringProperty("");
        this.lastName1 = new SimpleStringProperty("");
        this.lastName2 = new SimpleStringProperty("");
        this.nationalId = new SimpleStringProperty("");
        this.gender = new SimpleStringProperty("M");
        this.email = new SimpleStringProperty("");
        this.isAdmin = new SimpleBooleanProperty(false);
        this.username = new SimpleStringProperty("");
        this.password = new SimpleStringProperty("");
        this.entryDate = new SimpleObjectProperty<>(LocalDate.now());
        this.exitDate = new SimpleObjectProperty<>();
        this.isActive = new SimpleBooleanProperty(true);
        this.modified = false;
    }

    public StringProperty getIdProperty() {
        return id;
    }

    public StringProperty getNameProperty() {
        return Name;
    }

    public StringProperty getLastName1Property() {
        return lastName1;
    }

    public StringProperty getLastName2Property() {
        return lastName2;
    }

    public StringProperty getNationalIdProperty() {
        return nationalId;
    }

    public StringProperty getGenderProperty() {
        return gender;
    }

    public StringProperty getEmailProperty() {
        return email;
    }

    public BooleanProperty getIsAdminProperty() {
        return isAdmin;
    }

    public StringProperty getUsernameProperty() {
        return username;
    }

    public StringProperty getPasswordProperty() {
        return password;
    }

    public ObjectProperty getEntryDateProperty() {
        return entryDate;
    }

    public ObjectProperty getExitDateProperty() {
        return exitDate;
    }

    public BooleanProperty getIsActiveProperty() {
        return isActive;
    }
    
    

    public Long getId() {
        if (this.id.get() != null && !this.id.get().isBlank()) {
            return Long.valueOf(this.id.get());
        }
        return null;
    }

    public void setId(Long id) {
        this.id.set(id.toString());
    }

    public String getName() {
        return Name.get();
    }

    public void setName(String firstName) {
        this.Name.set(firstName);
    }

    public String getLastName1() {
        return lastName1.get();
    }

    public void setLastName1(String lastName1) {
        this.lastName1.set(lastName1);
    }

    public String getLastName2() {
        return lastName2.get();
    }

    public void setLastName2(String lastName2) {
        this.lastName2.set(lastName2);
    }

    public String getNationalId() {
        return nationalId.get();
    }

    public void setIdNumber(String idNumber) {
        this.nationalId.set(idNumber);
    }

    public String getGender() {
        return gender.get();
    }

    public void setGender(String gender) {
        this.gender.set(gender);
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public Boolean getIsAdmin() {
        return isAdmin.get();
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin.set(true);
    }

    public String getUsername() {
        return username.get();
    }

    public void setUsername(String username) {
        this.username.set(username);
    }

    public String getPassword() {
        return password.get();
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    public LocalDate getEntryDate() {
        return (LocalDate) entryDate.get();
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate.set(entryDate);
    }

    public LocalDate getExitDate() {
        return (LocalDate) exitDate.get();
    }

    public void setExitDate(LocalDate exitDate) {
        this.exitDate.set(exitDate);
    }

    public Boolean getIsActive() {
        return isActive.get();
    }

    public void setIsActive(Boolean isActive) {
        this.isActive.set(isActive);
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Boolean getModified() {
        return modified;
    }

    public void setModified(Boolean modified) {
        this.modified = modified;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EmployeeDto other = (EmployeeDto) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "EmployeesDto{" + "id=" + id + ", firstName=" + Name + ", lastName1=" + lastName1 + ", idNumber=" + nationalId + '}';
    }

}
