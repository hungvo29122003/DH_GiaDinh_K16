import { Input } from "antd";
import React from "react";

const InputComponent = (size, placeholder, borderless, style, ...rests) => {
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