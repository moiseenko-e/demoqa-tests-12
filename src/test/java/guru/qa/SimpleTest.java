package guru.qa;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.*;

public class SimpleTest {

    @BeforeAll // перед всеми тестами , например заполнить БД
    static void initDB(){
        System.out.println("####@BeforeAll");
    }


    @BeforeEach // перед каждым тестом
    void openYaPage(){
    System.out.println("####      @BeforeEach");
        // Selenide.open("https://ya.ru");
}

    @AfterEach // после каждого теста
    void close(){
        System.out.println("####      @AfterEach");
        //      WebDriverRunner.closeWindow();
    }

    @AfterAll // после всех тестов, например очистить тестовые значения в БД
    static void cleanDB(){
        System.out.println("####@AfterAll");
    }

    @Test
    void assertTest() {
        System.out.println("####      @Test 0");
        //...поиск в новостях
    }


    @Test
    void assertTest2() {
        System.out.println("####      @Test 1");
        //... поиск в картинках
    }
}

