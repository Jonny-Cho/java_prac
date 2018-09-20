package ch8;

// p.446 ����� ����(Chained Exception)

public class ChainedExceptionEx {

	public static void main(String[] args) {
		try {
			install();
		} catch (InstallException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void install() throws InstallException {
		try {
			startInstall(); // ���α׷� ��ġ�� �ʿ��� �غ� �Ѵ�.
			copyFiles(); // ���ϵ��� �����Ѵ�.
		} catch (SpaceException se) {
			InstallException ie = new InstallException("��ġ �� ���ܹ߻�");
			ie.initCause(se);
			throw ie;
		} catch (MemoryException me) {
			InstallException ie = new InstallException("��ġ �� ���ܹ߻�");
			ie.initCause(me);
			throw ie;
		} finally {
			deleteTempFiles();
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) { // ����� ��ġ ������ ������...
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		}
		
		if(!enoughMemory()) { // ����� �޷θ��� ������...
			throw new MemoryException("�޸𸮰� �����մϴ�.");
//			throw new RuntimeException(new MemoryException("�޸𸮰� �����մϴ�."));
		}
	}
	
	static void copyFiles() {
		// ���� �����ڵ�
	}
	
	static void deleteTempFiles() {
		// �ӽ����� ���� �ڵ�
	}
	
	static boolean enoughSpace() {
		// ��ġ �ʿ� ���� Ȯ�� �ڵ�
		return false;
	}
	
	static boolean enoughMemory() {
		// �޸𸮰��� Ȯ��
		return true;
	}
}

class InstallException extends Exception {
	InstallException(String msg) {
		super(msg);
	}
}

class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}

class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}