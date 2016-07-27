package com.example.jakub.rxtrain;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Jakub on 27.07.2016.
 */
public class Person implements Parcelable{

    String image;
    String firstName;
    String lastName;
    String email;
    String phone;

    public String getImage() {
        return image;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Person(String image, String firstName, String lastName, String email, String phone) {
        this.image = image;

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    protected Person(Parcel in) {
        image = in.readString();
        firstName = in.readString();
        lastName = in.readString();
        email = in.readString();
        phone = in.readString();
    }

    public Person() {}

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.image);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.email);
        parcel.writeString(this.phone);

    }
}
