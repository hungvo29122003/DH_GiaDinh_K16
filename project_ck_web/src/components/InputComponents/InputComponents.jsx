import Input from "antd/es/input/Input";
import React from "react";
import styled from "styled-components";

const InputComponents = ({size, placeholder, variant, style, ...rests}) => {
    return (
        <Input
            size={size}
            placeholder={placeholder}
            variant="borderless"
            style={style}
            {...rests}
        />
    )
}

export default InputComponents  