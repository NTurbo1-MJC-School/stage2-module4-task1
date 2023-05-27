package com.mjc.stage2;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class Employee {
    private String name;
    private String lastName;
    private String position;
    private String phone;
    private String email;
    private String carNumber;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public static EmployeeBuilder getBuilder() {
        return new EmployeeBuilder();
    }

    public static class EmployeeBuilder {
        // Write your code here!

        private Employee employee;

        public Employee build() {
            this.employee = new Employee();
            return this.employee;
        }

        public Employee setName(String name) {
            this.employee.setName(name);
            return this.employee;
        }

        public Employee setLastName(String lastName) {
            this.employee.setLastName(lastName);
            return this.employee;
        }

        public Employee setPosition(String position) {
            this.employee.setPosition(position);
            return this.employee;
        }

        public Employee setPhone(String phone) {
            this.employee.setPhone(phone);
            return this.employee;
        }

        public Employee setEmail(String email) {
            this.employee.setEmail(email);
            return this.employee;
        }

        public Employee setCarNumber(String carNumber) {
            this.employee.setCarNumber(carNumber);
            return this.employee;
        }
    }
}
