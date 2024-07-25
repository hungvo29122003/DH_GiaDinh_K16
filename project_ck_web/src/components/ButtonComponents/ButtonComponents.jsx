import { Button } from "antd";
import React from "react";
const ButtonComponents = ({size, styleButton, styleTextButton,textButton, ...rests}) => {
    return (
        <Button
            size={size}
            style={styleButton}
            // icon={<SearchOutlined />}
            {...rests}
        >
            <span style={styleTextButton}>{textButton}</span>
        </Button>
    )
}
export default ButtonComponents