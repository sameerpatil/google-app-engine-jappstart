/*
 *  Copyright (C) 2010 Taylor Leese (tleese22@gmail.com)
 *
 *  This file is part of jappstart.
 *
 *  jappstart is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  jappstart is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with jappstart.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jappstart.form;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

/**
 * The registration form bean.
 */
@SuppressWarnings("serial")
public class Register implements Serializable {

    /**
     * First name.
     */
    @Pattern(regexp = ".+")
    private String firstName;

    /**
     * Last name.
     */
    @Pattern(regexp = ".+")
    private String lastName;

    /**
     * The e-mail address.
     */
    @Pattern(regexp = ".+@.+\\.[a-z]+")
    private String email;

    /**
     * The password.
     */
    @Pattern(regexp = ".{5,}+")
    private String password;

    /**
     * Sets the first name.
     *
     * @param firstName the first name
     */
    /* CHECKSTYLE:OFF */
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }
    /* CHECKSTYLE:ON */

    /**
     * Gets the first name.
     *
     * @return the first name
     */
    /* CHECKSTYLE:OFF */
    public String getFirstName() {
        return firstName;
    }
    /* CHECKSTYLE:ON */

    /**
     * Sets the last name.
     *
     * @param lastName the last name
     */
    /* CHECKSTYLE:OFF */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }
    /* CHECKSTYLE:ON */

    /**
     * Gets the last name.
     *
     * @return the last name
     */
    /* CHECKSTYLE:OFF */
    public String getLastName() {
        return lastName;
    }
    /* CHECKSTYLE:ON */

    /**
     * Sets the e-mail address.
     *
     * @param email the e-mail address
     */
    /* CHECKSTYLE:OFF */
    public void setEmail(final String email) {
        this.email = email;
    }
    /* CHECKSTYLE:ON */

    /**
     * Gets the e-mail address.
     *
     * @return the e-mail address
     */
    /* CHECKSTYLE:OFF */
    public String getEmail() {
        return email;
    }
    /* CHECKSTYLE:ON */

    /**
     * Sets the password.
     *
     * @param password the password
     */
    /* CHECKSTYLE:OFF */
    public void setPassword(final String password) {
        this.password = password;
    }
    /* CHECKSTYLE:ON */

    /**
     * Gets the password.
     *
     * @return the password
     */
    /* CHECKSTYLE:OFF */
    public String getPassword() {
        return password;
    }
    /* CHECKSTYLE:ON */

}
