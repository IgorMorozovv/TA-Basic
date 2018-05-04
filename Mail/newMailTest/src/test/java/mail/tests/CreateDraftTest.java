package mail.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mail.tests.common.GeneralActions;

public class CreateDraftTest extends GeneralActions {

    @Test(groups = "basic-functions", dataProvider = "letterData", priority = 1)
    public void createMessage(String receiver, String subject, String message) {
	logger.info("Начало теста по созданию письма");
	logger.info("Ожидание загрузки загаловка страницы Inbox");
	inboxPage.waitTitle();
	logger.info("Заполнение полей: получатель, тема, сообщение");
	fillFields(receiver, subject, message);
	logger.info("Сохранение письма");
	saveLetterAsDraft();

	assertTrue(writeLetterPage.getSavedTextArea().isDisplayed(), "Verify that saved text is displayed");

	logger.info("Переход на страницу Inbox");
	inboxPage.linksToMainPages.clickInboxLink().waitTitle();
    }

    @AfterClass
    private void deleteDrafts() {
	deleteAllDrafts();
    }

    @DataProvider
    private Object[][] letterData() {
	return dataReader.getData(FILE_NAME);
    }

}
