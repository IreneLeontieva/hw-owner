import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.have;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class WebTest extends TestBase {

    @Test
    public void webTest() {
        step("Открываем главную страницу", () -> {
            open("https://www.labirint.ru/");
        });

        step("Search book", () -> {
            $("input[placeholder='Поиск по Лабиринту']").setValue("Война и мир").pressEnter();
        });
        step("Check that book is found", () -> {
            $(".index-top-title").shouldHave(Condition.text("Все, что мы нашли в Лабиринте\n" +
                    "            по запросу «Война и мир»"));
        });

    }
}
