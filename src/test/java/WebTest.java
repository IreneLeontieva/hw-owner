import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class WebTest extends TestBase {

    @Test
    public void webTest() {
        step("Открываем главную страницу", () -> {
            open("https://github.com");
        });

        step("Вводим поисковый запрос", () -> {
            $("[data-test-selector='nav-search-input']").setValue("hw-owner").pressEnter();
            $$("ul.repo-list").first().shouldHave(text("IreneLeontieva"));
            sleep(1000);
        });

    }
}
