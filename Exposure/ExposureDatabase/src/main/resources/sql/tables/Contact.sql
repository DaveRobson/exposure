CREATE TABLE Contact (
	Contact_ID INT NOT NULL AUTO_INCREMENT,
	Firstname VARCHAR(100) NOT NULL,
	Lastname VARCHAR(100) NOT NULL,
	EmailAddress VARCHAR(100) NOT NULL,
	PhoneNumber VARCHAR(100) NOT NULL,
	primary key (Contact_ID)
);