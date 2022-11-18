package bridge

enum class ErrorType(val errorMessage: String) {
    RANGE(ERROR_NUMBER_RANGE_MESSAGE),
    LENGTH(ERROR_LENGTH_MESSAGE),
    NUMBER(ERROR_NUMBER_MESSAGE),
    EMPTY(ERROR_EMPTY_MESSAGE),
    LETTER(ERROR_LETTER_MESSAGE),
    UPPER(ERROR_UPPER_MESSAGE),
    DRIECTION(ERROR_DRIECTION_MESSAGE),
    COMMAND(ERROR_COMMAND_MESSAGE)
}