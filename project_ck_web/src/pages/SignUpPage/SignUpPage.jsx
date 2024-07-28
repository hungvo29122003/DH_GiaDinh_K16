import React from "react";
import { WrapperContainerLeft, WrapperContainerRight, WrapperTextLight } from "./style";
import InputForm from "../../components/InputForm/InputForm";
import ButtonComponents from "../../components/ButtonComponents/ButtonComponents";
import { Image } from "antd";
import imagelogo from "../../accest/LOGO_dangnhap.png"
const SignUpPage = () => {
    return (
        <div style={{ display: 'flex', alignItems: 'center', justifyContent: 'center', background: 'rgba(0, 0 ,0, 0.53)', height: '100vh' }}>
            <div style={{ width: '800px', height: '445px', borderRadius: '6px', background: '#fff', display: 'flex' }}>
                <WrapperContainerLeft>
                    <h1>Xin chào</h1>
                    <p>Đăng kí tài khoản</p>
                    <InputForm style={{ marginBottom: '10px' }} placeholder="abc@gmail.com" />
                    <InputForm placeholder="password" style={{ marginBottom: '10px' }} />
                    <InputForm placeholder="comfirm password" />
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
                        textButton={'Đăng kí'}
                        styleTextButton={{ color: '#fff', fontSize: '15px', fontWeight: '700' }}

                    ></ButtonComponents>
                    <p>Bạn đã có tài khoản? <WrapperTextLight>Đăng nhập</WrapperTextLight></p>
                </WrapperContainerLeft>
                <WrapperContainerRight>
                    <Image src={imagelogo} preview={false} alt="image-logo" height='203px' width='203px' />
                    <h4>Mua sắm tại đây</h4>
                    <p>Với nhiều ưu đãi khuyến mãi </p>
                </WrapperContainerRight>
            </div>
        </div>
    )
}

export default SignUpPage