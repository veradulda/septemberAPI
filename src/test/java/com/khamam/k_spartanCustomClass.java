package com.khamam;

public class k_spartanCustomClass {

/*    {
            "id": 132,
            "name": "Mehmet",
            "gender": "Male",
            "phone": 12345678911
    }
 */

    public int id;
    public String name;
    public String gender;
    public long phone;

    @Override
    public String toString() {
        return "k_spartanCustomClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", phone=" + phone +
                '}';
    }
}
