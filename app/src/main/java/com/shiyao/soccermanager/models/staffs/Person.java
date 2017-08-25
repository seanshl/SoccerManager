package com.shiyao.soccermanager.models.staffs;

import android.provider.ContactsContract;

import java.util.Date;

/**
 * Created by Shiyao on 8/25/2017.
 */


public abstract class Person {

    protected String firstName;

    protected String lastName;

    protected Date birthDay;

    protected ContactsContract.CommonDataKinds.Email email;

    protected ContactsContract.CommonDataKinds.Phone phone;

}
