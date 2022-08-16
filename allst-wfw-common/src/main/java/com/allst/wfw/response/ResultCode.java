package com.allst.wfw.response;

/**
 * 状态码定义
 *
 * @author June
 * @since 2022-08-16
 */
public enum ResultCode {
    /**
     * 1, 操作成功
     */
    SUCCESS(1, "操作成功"),

    /**
     * 1002, 服务器内部错误
     */
    INTERNAL_ERROR(1002, "服务器内部错误"),

    /**
     * 1003, 非法的访问类型
     */
    INVALID_ACCESS(1003, "非法的访问"),

    /**
     * 1004, 身份认证失败
     */
    AUTH_FAILED(1004, "身份认证失败"),

    /**
     * 1005 alert统一错误相应
     */
    ALERT_ERROR(1005, "alert统一错误相应"),

    /**
     * 1006, 没有数据改变，请使用缓存
     */
    NO_DATA_CHANGE(1006, "没有数据改变，请使用缓存"),

    /**
     * 1007, 防护码失败
     */
    PROTECTCODE_ERROR(1007, "防护码失败"),

    /**
     * 1008, 参数错误
     */
    PARAM_ERROR(1008, "参数错误"),

    /**
     * 1009, 服务器开小差，请稍后再试
     */
    SERVER_ERROR(1009, "服务器开小差，请稍后再试"),

    /**
     * 1010, 请求频繁，请稍后再试
     */
    REPETITION_ERROR(1010, "请求频繁，请稍后再试"),

    /**
     * 1997, token错误
     */
    CSRF_CODE_ERROR(1997, "token错误"),

    /**
     * 303, 图形验证码错误
     */
    VERIFYCODE_IMAGE_ERROR(303, "图形验证码错误"),

    FLOW_SENTINEL_ERROR(508, "当前访问人数较多，请稍后重试");

    private int state;
    private String message;

    ResultCode(int state) {
        this(state, null);
    }

    ResultCode(int state, String message) {
        this.state = state;
        this.message = message;
    }

    public int getState() {
        return state;
    }

    public String getMessage() {
        return message;
    }
}
