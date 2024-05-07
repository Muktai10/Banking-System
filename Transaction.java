package assignment5b;

public class Transaction {

		private String transactionId;
		private double amount;
		private String type;

		public Transaction(String transactionId, double amount, String type) {
			this.transactionId = transactionId;
			this.amount = amount;
			this.type = type;
		}

		public String getTransactionId() {
			return transactionId;
		}

		public void setTransactionId() {
			this.transactionId = transactionId;
		}
		public double getamount()
		{
			return amount;
		}
		public void setamount()
		{
			this.amount=amount;
		}
		public String getType()
		{
			return type;
		}
		public void setType()
		{
			this.type=type;
		}

	}


