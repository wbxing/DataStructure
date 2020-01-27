package com.team.sevrice;

/**
 * 自定义异常类
 */
public class TeamException extends Exception {

    static final long serialVersionUID = -3387516993128L;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}
