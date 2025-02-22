package com.ganesh.hotelBooking_App.service;

import com.ganesh.hotelBooking_App.model.User;

import java.util.List;


public interface IUserService {
    User registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}