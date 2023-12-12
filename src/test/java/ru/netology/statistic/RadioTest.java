package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldTestNoArgsArguments1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(20);

        int expected = 20;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestNoArgsArguments2(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(21);

        int expected = 21;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestNoArgsArguments3(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(19);

        int expected = 19;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestNoArgsArguments4(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(18);

        int expected = 18;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestNoArgsArguments5(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(13);

        int expected = 13;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestNoArgsArguments6(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(2);

        int expected = 2;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestNoArgsArguments7(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestNoArgsArguments8(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCreate2() {
        Radio radio = new Radio(9, 5, 9);
        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestNewRadioStation() {
        Radio radio = new Radio(14, 88, 20);

        radio.setCurrentRadioStation(15);

        int expected = 15;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestWishNumberOfRadioStation1() {
        Radio radio = new Radio(9,100, 11);
        radio.setCurrentRadioStation(10);

        int expected = 10;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestWishNumberOfRadioStation2() {
        Radio radio = new Radio(19,55, 44);
        radio.setCurrentRadioStation(11);

        int expected = 11;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestWishNumberOfRadioStation3() {
        Radio radio = new Radio(1,86,15);
        radio.setCurrentRadioStation(7);

        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestWishNumberOfRadioStation4() {
        Radio radio = new Radio(7, 43, 36);
        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestWishNumberOfRadioStation5() {
        Radio radio = new Radio(17,32,18);
        radio.setCurrentRadioStation(1);


        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestWishNumberOfRadioStation6() {
        Radio radio = new Radio(1,30,10);
        radio.setCurrentRadioStation(0);


        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestWishNumberOfRadioStation7() {
        Radio radio = new Radio(1, 20,9);
        radio.setCurrentRadioStation(-1);


        int expected = -1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestToNextStation1() {
        Radio radio = new Radio(10, 34,11);
        radio.setCurrentRadioStation(10);

        radio.next();

        int expected = 11;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestToNextStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestToNextStation3() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        radio.next();

        int expected = 2;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestToNextStation4() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestToNextStation5() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestToPreviousStation1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(4);

        radio.prev();

        int expected = 3;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestToPreviousStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(2);

        radio.prev();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestToPreviousStation3() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestToPreviousStation4() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestToPreviousStation5() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestIncreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(70);

        radio.increaseVolume();

        int expected = 71;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestIncreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(98);

        radio.increaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestIncreaseVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestIncreaseVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestIncreaseVolume5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestIncreaseVolume6() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestIncreaseVolume7() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        radio.increaseVolume();

        int expected = 3;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestSetRadioStation1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestSetRadioStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);

        int expected = -1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestSetRadioStation3() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(4);
        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestSetRadioStation4() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestSetRadioStation5() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestSetRadioStation6() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestSetRadioStation7() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        int expected = 10;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestSetRadioStation8() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(12);

        int expected = 12;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestSetVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(60);

        int expected = 60;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestSetVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestSetVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestSetVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestSetVolume5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestSetVolume6() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestReductionVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.reductionVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestReductionVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.reductionVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestReductionVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        radio.reductionVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestReductionVolume5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(71);

        radio.reductionVolume();

        int expected = 70;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestReductionVolume6() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.reductionVolume();

        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestReductionVolume7() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.reductionVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestReductionVolume8() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-101);

        radio.reductionVolume();

        int expected = -102;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestReductionVolume9() {
        Radio radio = new Radio();
        radio.setCurrentVolume(102);

        radio.reductionVolume();

        int expected = 101;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestSetMaxCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int expected = 9;
        int actual = radio.getMaxCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}