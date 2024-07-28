import React, { useState } from "react";
import { WrapperContainerLeft, WrapperContainerRight, WrapperTextLight } from "./style";
import InputForm from "../../components/InputForm/InputForm";
import ButtonComponents from "../../components/ButtonComponents/ButtonComponents";
import { Image } from "antd";
import imagelogo from "../../accest/LOGO_dangnhap.png";
import { EyeFilled, EyeInvisibleFilled } from "@ant-design/icons";

const SignInPage = () => {
    const [isShowPassword, setIsShowPassword] = useState(false);

    // Hàm để thay đổi trạng thái hiển thị mật khẩu
    const togglePasswordVisibility = () => {
        setIsShowPassword(!isShowPassword);
    };

    return (
        <div style={{ display: 'flex', alignItems: 'center', justifyContent: 'center', background: 'rgba(0, 0 ,0, 0.53)', height: '100vh' }}>
            <div style={{ width: '800px', height: '445px', borderRadius: '6px', background: '#fff', display: 'flex' }}>
                <WrapperContainerLeft>
                    <h1>Xin chào</h1>
                    <p>Đăng nhập hoặc tạo tài khoản</p>
                    <InputForm style={{ marginBottom: '10px' }} placeholder="abc@gmail.com" />
                    <div style={{ position: 'relative' }}>
                        <span
                            Thêm sự kiện onClick ở đây
                            onClick={togglePasswordVisibility}
                            style={{
                                zIndex: 10,
                                position: 'absolute',
                                top: '4px',
                                right: '8px',
                                cursor: 'pointer'
                            }}
                        >
                            {isShowPassword ? (
                                <EyeFilled />
                            ) : (
                                <EyeInvisibleFilled />
                            )}
                        </span>
                        <InputForm placeholder="password" type={isShowPassword ? "text" : "password"} />
                    </div>
                    <ButtonComponents
                        size={40}
                        styleButton={{
                            background: 'rgb(255, 57, 69)',
                            height: '48px',
                            width: '100%',
                            border: 'none',
                            borderRadius: '4px',
                            margin: '26px 0 10px'
                        }}
                        textButton={'Đăng nhập'}
                        styleTextButton={{ color: '#fff', fontSize: '15px', fontWeight: '700' }}
                    />
                    <p><WrapperTextLight>Quên mật khẩu?</WrapperTextLight></p>
                    <p>Chưa có tài khoản? <WrapperTextLight>Tạo tài khoản</WrapperTextLight></p>
                </WrapperContainerLeft>
                <WrapperContainerRight>
                    <Image src={imagelogo} preview={false} alt="image-logo" height="203px" width="203px" />
                    <h4>Mua sắm tại đây</h4>
                    <p>Với nhiều ưu đãi khuyến mãi</p>
                </WrapperContainerRight>
            </div>
        </div>
    );
};

export default SignInPage;
