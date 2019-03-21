package com.projectStore.projectStore;

import com.projectStore.projectStore.entity.Home;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

/**
 * Created by 111 on 19.03.2019.
 */
public class HomeTest {

    private Home home = new Home();

    @Test
    public void greeterSaysHello() {
        assertThat(home.sayHello(), containsString("Hello"));
    }

}
