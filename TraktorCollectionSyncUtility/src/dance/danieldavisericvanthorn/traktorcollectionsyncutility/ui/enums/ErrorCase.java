package dance.danieldavisericvanthorn.traktorcollectionsyncutility.ui.enums;

import java.util.HashMap;
import java.util.Map;

public enum ErrorCase {

	FILE_UPDATE_NOT_POSSIBLE("FUNP"),
	COLLECTION_FILE_NOT_FOUND("CFNF"),
	UPDATE_ERROR("UE"),
	SETTINGS_FILE_COULD_NOT_BE_OPENED("SFCNBO"),
	PARSE_ERROR("PE"),
	SETTINGS_NOT_LOADABLE("SNL"),
	COLLECTION_PATH_NOT_BIULT("CPNB"),
	GIVEN_FOLDER_NOT_COMPARABLE("GFNC");

	private String code;
	private static Map<String, ErrorCase> codes = new HashMap<>();

	static {
		for (ErrorCase errorCase : ErrorCase.values()) {
			codes.put(errorCase.getCode(), errorCase);
		}
	}

	private ErrorCase(String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}

	public static ErrorCase getErrorCase(String code) {
		return codes.get(code);
	}

}
