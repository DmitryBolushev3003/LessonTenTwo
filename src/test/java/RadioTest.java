import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.Radio;

public class RadioTest {

    @Test      // Проверка следующей станции в поле допуска

    public void NextNumberStationTest() {
        Radio radio = new Radio();
        radio.setNextNumberStation(7);
        int expected = 8;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test     // Проверка следующей станции больше 9

    public void NextNumberStationMoreNineTest() {
        Radio radio = new Radio();
        radio.setNextNumberStation(9);
        int expected = 0;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);


    }

    @Test

    public void PrevNumberStationTest() {
        Radio radio = new Radio();
        radio.setPrevNumberStation(4);
        int expected = 3;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void PrevNumberStationNineTest() {
        Radio radio = new Radio();
        radio.setPrevNumberStation(9);
        int expected = 9;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void PrevNumberStationLessNullTest() {
        Radio radio = new Radio();
        radio.setPrevNumberStation(0);
        int expected = 9;
        int actual = radio.getNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentVolume() {
        Radio radio = new Radio();
        radio.setNextCurrentVolume(80);
        int expected = 81;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxCurrentVolume() {
        Radio radio = new Radio();
        radio.setNextCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevCurrentVolume() {
        Radio radio = new Radio();
        radio.setPrevCurrentVolume(90);
        int expected = 89;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevCurrentVolumeSto() {
        Radio radio = new Radio();
        radio.setPrevCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinPrevCurrentVolume() {
        Radio radio = new Radio();
        radio.setPrevCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
