package ch8;

// p.446 연결된 예외(Chained Exception)

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
			startInstall(); // 프로그램 설치에 필요한 준비를 한다.
			copyFiles(); // 파일들을 복사한다.
		} catch (SpaceException se) {
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(se);
			throw ie;
		} catch (MemoryException me) {
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(me);
			throw ie;
		} finally {
			deleteTempFiles();
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) { // 충분한 설치 공간이 없으면...
			throw new SpaceException("설치할 공간이 부족합니다.");
		}
		
		if(!enoughMemory()) { // 충분한 메로리가 없으면...
			throw new MemoryException("메모리가 부족합니다.");
//			throw new RuntimeException(new MemoryException("메모리가 부족합니다."));
		}
	}
	
	static void copyFiles() {
		// 파일 복사코드
	}
	
	static void deleteTempFiles() {
		// 임시파일 삭제 코드
	}
	
	static boolean enoughSpace() {
		// 설치 필요 공간 확인 코드
		return false;
	}
	
	static boolean enoughMemory() {
		// 메모리공간 확인
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