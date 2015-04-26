    import org.junit.Test;
    import org.openqa.selenium.By;

    import static org.junit.Assert.assertEquals;


    public class FirstClass extends ConfigurationManager {


        /*@Test
        public void testUntitled() throws Exception {
            driver.get(baseUrl + "/");
            driver.findElement(By.id("mailbox__login")).clear();
            driver.findElement(By.id("mailbox__login")).sendKeys("fjdlskfs;l");
            driver.findElement(By.id("mailbox__password")).clear();
            driver.findElement(By.id("mailbox__password")).sendKeys("fsdfdf");
            driver.findElement(By.id("mailbox__auth__button")).click();
        }*/

    /*@Test
    public void testUntitled2() throws Exception {
        driver.findElement(Locators.LOGIN).clear();
        driver.findElement(Locators.LOGIN).sendKeys("fjdlskfs;l");
        driver.findElement(Locators.PASSWORD).clear();
        driver.findElement(Locators.PASSWORD).sendKeys("fsdfdf");
        driver.findElement(Locators.AUTH_BUTTON).click();
    }*/

    @Test
    public void testUntitled3() throws Exception {
        driver.findElement(Locators.LOGIN).clear();
        driver.findElement(Locators.LOGIN).sendKeys("fjdlskfs;l");
        driver.findElement(Locators.PASSWORD).clear();
        driver.findElement(Locators.PASSWORD).sendKeys("fsdfdf");
        driver.findElement(Locators.AUTH_BUTTON).click();
        /*assertEquals (driver.getTitle(),"asd");*/
        assertEquals (driver.getTitle(),"Вход - Почта Mail.Ru");
    }


            }



