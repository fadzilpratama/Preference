package com.example.macbookpro.preference;
import android.provider.ContactsContract;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Data {

    private static List<User> users;
    private static List<ContactsContract.CommonDataKinds.Note> notes;

    static {
        users = new ArrayList<>();
        users.add(new User("adi", "rahasia"));
        users.add(new User("beni", "rahasia"));
        users.add(new User("cindy", "rahasia"));

        notes = new ArrayList<>();
        notes.add(new ContactsContract.CommonDataKinds.Note("Note 1", new Date(), "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua"));
        notes.add(new ContactsContract.CommonDataKinds.Note("Note 2", new Date(), "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat"));
        notes.add(new ContactsContract.CommonDataKinds.Note("Note 3", new Date(), "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur"));
        notes.add(new ContactsContract.CommonDataKinds.Note("Note 4", new Date(), "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."));
    }

    public static List<User> getUsers() {
        return users;
    }

    public static List<ContactsContract.CommonDataKinds.Note> getNotes() {
        return notes;
    }
}
