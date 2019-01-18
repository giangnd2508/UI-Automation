# Modeling concepts & class modeling

A way of thinking about problems using models organized around real world concepts. The fundamental construct is the object, which combines both data and behaviour.

This domain is java class to encapsulates state and behavior appropriate to whatever the class models in the real world.

Example: User Model

```
public class UserAccount {

	private String email;
	private String password;
	private String OTP;

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}


	public UserAccount(String email, String password, String OTP) {
		this.email = email;
		this.password = password;
		this.OTP = OTP;
	}
	
	...

}
```