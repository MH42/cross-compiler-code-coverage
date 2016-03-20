/* 
 The webtests are designed to use 3 GMail-accounts.
 As we cannot share our accounts, you should create dummy accounts by yourself.
 Our Selenium tests uses the following arrays to execute the webtests. gmail1, gmail2 and gmail3 contain the login data. testMail1 and testMail2 as well as bcMail abd ccMail contain data for sending mails.
 */

var gmail1 = new Array("your-mail-address1", "your-password1", "imap.gmail.com", 993, "imap.gmail.com", 587);
var gmail2 = new Array("your-mail-address2", "your-password2", "imap.gmail.com", 993, "imap.gmail.com", 587);
var gmail3 = new Array("your-mail-address3", "your-password3", "imap.gmail.com", 993, "imap.gmail.com", 587);
var testMail1 = new Array("Selenium-Test-Mail", "Hi!*This is a Selenium-Test-Mail.*Cheers.")
var testMail2 = new Array("Test2", "Hi!*Test - Test!*Cheers.")
var bccMail = new Array("BCC", "Bcc-mail")
var ccMail = new Array("CC", "CC-mail")
var addressbookSelection = new Array("*@gmail.com")