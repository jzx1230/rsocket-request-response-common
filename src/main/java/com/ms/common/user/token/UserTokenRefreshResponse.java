package com.ms.common.user.token;


import com.ms.common.base.BaseResponse;
import com.ms.common.base.IBaseResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


// 刷新token
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserTokenRefreshResponse extends BaseResponse {
    private String access_token;
}
