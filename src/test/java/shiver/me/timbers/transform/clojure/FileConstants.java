package shiver.me.timbers.transform.clojure;

import static shiver.me.timbers.transform.language.test.FileUtils.readTestFileToString;

public final class FileConstants {

    private FileConstants() {
    }

    public static final String TEST_FILE_NAME = "Test.clj";
    public static final String INVALID_TEST_FILE_NAME = "InvalidTest.clj";
    public static final String TRANSFORMED_TEST_FILE_NAME = "Test.clj.transformed";
    public static final String TRANSFORMED_KEYWORDS_TEST_FILE_NAME = "Test.clj.keywords";
    public static final String TRANSFORMED_COMMENTS_TEST_FILE_NAME = "Test.clj.comments";
    public static final String TRANSFORMED_INVALID_TEST_FILE_NAME = "InvalidTest.clj.transformed";
    public static final String TRANSFORMED_TYPES_TEST_FILE_NAME = "Test.clj.types";
    public static final String TRANSFORMED_RULES_TEST_FILE_NAME = "Test.clj.rules";

    public static final String TEST_FILE_SOURCE = readTestFileToString(FileConstants.class, TEST_FILE_NAME);
    public static final String INVALID_TEST_FILE_SOURCE = readTestFileToString(FileConstants.class,
            INVALID_TEST_FILE_NAME);


    public static final String TRANSFORMED_SOURCE = readTestFileToString(FileConstants.class,
            TRANSFORMED_TEST_FILE_NAME);
    public static final String TRANSFORMED_KEYWORDS_SOURCE = readTestFileToString(FileConstants.class,
            TRANSFORMED_KEYWORDS_TEST_FILE_NAME);
    public static final String TRANSFORMED_COMMENTS_SOURCE = readTestFileToString(FileConstants.class,
            TRANSFORMED_COMMENTS_TEST_FILE_NAME);
    public static final String TRANSFORMED_INVALID_SOURCE = readTestFileToString(FileConstants.class,
            TRANSFORMED_INVALID_TEST_FILE_NAME);
    public static final String TRANSFORMED_TYPES_SOURCE = readTestFileToString(FileConstants.class,
            TRANSFORMED_TYPES_TEST_FILE_NAME);
    public static final String TRANSFORMED_RULES_SOURCE = readTestFileToString(FileConstants.class,
            TRANSFORMED_RULES_TEST_FILE_NAME);
}
