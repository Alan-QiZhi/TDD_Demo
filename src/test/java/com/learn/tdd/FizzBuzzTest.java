package com.learn.tdd;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * FizzBuzzTest
 *
 * @author 荀彧 2021/4/9
 */
public class FizzBuzzTest {
    /**
     * 正常数字，就正常返回
     */
    @Test
    public void should_show_origin_number_if_input_origin_number() {

        assertThat(new FizzBuzz(1).toString(), is("1"));
    }

    /**
     * 如果是3的倍数，就返回fizz
     */
    @Test
    public void should_show_fizz_if_origin_number_can_div_by_3() {
        assertThat(new FizzBuzz(3).toString(), is("fizz"));
    }

    /**
     * 如果是5的倍数，就返回buzz
     */
    @Test
    public void should_show_buzz_if_origin_number_can_div_by_5() {
        assertThat(new FizzBuzz(5).toString(), is("buzz"));
    }

    /**
     * 既是3的倍数，又是5的倍数，就返回 fizzbuzz
     */
    @Test
    public void should_show_fizzbuzz_if_origin_number_can_div_by_3_and_5() {
        assertThat(new FizzBuzz(15).toString(), is("fizzbuzz"));
    }
}

