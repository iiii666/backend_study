package com.kosa.bank;

public interface AccountDAOInterface {
	void accountInsert(AccountVO newAccount);
	void accountList();
	void accountPlusUpdate(AccountVO account);
	void accountMinusUpdate(AccountVO account);
	boolean accountFindOne(String ano);
}
