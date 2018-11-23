package com.ssm.api.common;

import com.ssm.api.common.enums.EC;

import java.io.Serializable;

public class Resultful implements Serializable {

    /**是否成功*/
    private boolean success;
    /**返回码*/
    private String code;
    /**返回信息*/
    private String msg;
    /**返回数据*/
    private Object data;

    // 分页查询时总记录数
    private Integer totalSize;

    public Resultful(){

    }

    public static Resultful builder(){
        return new Resultful();
    }

    /**
     * 成功返回
     * @return
     */
    public static Resultful success() {
        return builder().setCode(EC.SUCCESS.getCode()).setMsg(EC.SUCCESS.getMsg());
    }

    /**
     * 成功返回
     * @param data 返回的数据
     * @return
     */
    public static Resultful success(Object data) {
        return success().setData(data);
    }

    public static Resultful success(Object data, int totalSize) {
        return success(data).setTotalSize(totalSize);
    }


    /**
     * 参数非法
     * @return
     */
    public static Resultful illegal() {
        return builder()
                .setCode(EC.ILLEGAL_PARAMETER.getCode())
                .setMsg(EC.ILLEGAL_PARAMETER.getMsg());

    }

    /**
     * 业务处理失败
     * @return
     */
    public static Resultful fail() {
        return builder()
                .setCode(EC.FAILED_BUSINESS.getCode())
                .setMsg(EC.FAILED_BUSINESS.getMsg());
    }
    /**
     * 参数缺失
     * @param subCode
     * @param subMsg
     * @return
     */
    public static Resultful miss() {
        return builder()
                .setCode(EC.MISS_PARAMETER.getCode())
                .setMsg(EC.MISS_PARAMETER.getMsg());
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public Resultful setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Resultful setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getData() {
        return data;
    }

    public Resultful setData(Object data) {
        this.data = data;
        return this;
    }

    public Integer getTotalSize() {
        return totalSize;
    }

    public Resultful setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    @Override
    public String toString() {
        return "Resultful{" +
                "success=" + success +
                ", code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                ", totalSize=" + totalSize +
                ", data=" + data +
                '}';
    }
}
