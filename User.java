package assignment5b;

public class User {

		private String userId;
		private String name;
		private String email;
		
		public User(String userId,String name,String email)
		{
			this.userId=userId;
			this.name=name;
			this.email=email;
		}
		public String getuserId()
		{
			return userId;
		}
		public void setuserId(String userId)
		{
			this.userId=userId;
		}
		public String getname()
		{
			return name;
		}
		public void setname(String name)
		{
			this.name=name;
		}
		public String getemail()
		{
			return email;
		}
		public void setemail(String email)
		{
			this.email=email;
		}
		
	}


