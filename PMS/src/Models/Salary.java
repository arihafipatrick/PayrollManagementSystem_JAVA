/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author pazo
 */
@Entity
public class Salary implements Serializable {
    @Id
    private int salaryId;
    private int BS;
    private int TA;
    private int WA;
    private int net;
    private String employeeId;

    public Salary() {
    }

    public Salary(int salaryId, int BS, int TA, int WA, int net, String employeeId) {
        this.salaryId = salaryId;
        this.BS = BS;
        this.TA = TA;
        this.WA = WA;
        this.net = net;
        this.employeeId = employeeId;
    }

    public int getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(int salaryId) {
        this.salaryId = salaryId;
    }

    public int getBS() {
        return BS;
    }

    public void setBS(int BS) {
        this.BS = BS;
    }

    public int getTA() {
        return TA;
    }

    public void setTA(int TA) {
        this.TA = TA;
    }

    public int getWA() {
        return WA;
    }

    public void setWA(int WA) {
        this.WA = WA;
    }

    public int getNet() {
        return net;
    }

    public void setNet(int net) {
        this.net = net;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    
    
}
