package aop.principle;

public class LibraryImpl implements Library {

	@Override
	public String addBook(String name) {
		return ("增加"+name);
	}

	@Override
	public String subBook(String name) {
		return ("减少"+name);
	}

}
