package com.chirag.rawal.edureka10;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class userTest {

    @Test
    public void testGettingUsername(){
        Client client = new Client();

        userDetails interfaceUser = Mockito.mock(userDetails.class);

        Mockito.when(interfaceUser.getUsername()).thenReturn("Username");

        String username = client.SetUsername(interfaceUser);
        Assert.assertEquals("Username",username);
    }

    @Test
    public void testGettingPassword(){
        Client client = new Client();

        userDetails interfaceUser = Mockito.mock(userDetails.class);

        Mockito.when(interfaceUser.getPassword()).thenReturn("Password");

        String password = client.SetPassword(interfaceUser);
        Assert.assertEquals("Password",password);
    }

}
